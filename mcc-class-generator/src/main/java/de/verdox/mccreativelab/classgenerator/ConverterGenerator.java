package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.Singleton;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter;
import de.verdox.mccreativelab.wrapper.platform.adapter.WrapperAdapter;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConverterGenerator {
    public static final Logger LOGGER = Logger.getLogger(ConverterGenerator.class.getName());

    private static final Map<FromTo, Conversion> converterToFunctionName = new ConcurrentHashMap<>();
    private final Set<ConversionMethodCreator> preDefinedMethodCreators = new HashSet<>();
    private final Set<ApiToImpl> apiToImpls = new HashSet<>();

    private static final Queue<Conversion> leftToGenerate = new LinkedBlockingQueue<>();
    private final ClassBuilder classBuilder;
    private final String converterClassPackage;
    private final String converterClassName;

    public ConverterGenerator(String converterClassPackage, String converterClassName) {
        this.converterClassPackage = converterClassPackage;
        this.converterClassName = converterClassName;
        classBuilder = new ClassBuilder();
        classBuilder.withPackage(converterClassPackage);
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.INTERFACE, converterClassName, "");
        classBuilder.includeImport(Singleton.class);
        classBuilder.withField("public static final", DynamicType.of(Singleton.class, true), "<" + converterClassName + "> INSTANCE", "new Singleton<>(" + converterClassName + ".class);");
    }

    public ConverterGenerator withPredefinedGenerator(ConversionMethodCreator conversionMethodCreator) {
        preDefinedMethodCreators.add(conversionMethodCreator);
        return this;
    }

    public String requireGeneratorFunction(DynamicType api, DynamicType impl) {
        LOGGER.log(Level.FINER, "require generator function from api: " + api + " to impl: " + impl);
        FromTo apiToImplPair = new FromTo(api, impl);
        FromTo implToApiPair = new FromTo(impl, api);
        if (converterToFunctionName.containsKey(apiToImplPair))
            return converterToFunctionName.get(implToApiPair).methodName();
        int id = converterToFunctionName.size();

        Conversion apiToImpl = new Conversion(api, impl, "apiToImpl" + id, (gen, from, to, assignedMethodName, fromParameterName, outputParameterName, methodBuilder, classBuilder) -> from.equals(api) && to.equals(impl));
        Conversion implToApi = new Conversion(impl, api, "implToApi" + id, (gen, from, to, assignedMethodName, fromParameterName, outputParameterName, methodBuilder, classBuilder) -> from.equals(impl) && to.equals(api));

        boolean created = false;
        if (!converterToFunctionName.containsKey(apiToImplPair)) {
            converterToFunctionName.put(apiToImplPair, apiToImpl);
            leftToGenerate.add(apiToImpl);
            created = true;
        }
        if (!converterToFunctionName.containsKey(implToApiPair)) {
            converterToFunctionName.put(implToApiPair, implToApi);
            leftToGenerate.add(implToApi);
            created = true;
        }
        if (created) {
            LOGGER.log(Level.FINER, "added generator function generation to queue from api: " + api + " to impl: " + impl);
            apiToImpls.add(new ApiToImpl(api, impl));
        }
        return getConverterFunctionName(api, impl);
    }

    public String getConverterFunctionName(DynamicType from, DynamicType to) {
        return converterToFunctionName.get(new FromTo(from, to)).methodName();
    }

    public void buildConverterInterface(File sourceDir) throws IOException {
        HashSet<Conversion> done = new HashSet<>();
        while (leftToGenerate.peek() != null) {
            Conversion conversion = leftToGenerate.poll();
            if (done.contains(conversion)) continue;
            DynamicType from = conversion.from();
            DynamicType to = conversion.to();

            done.add(conversion);

            boolean foundPreDefined = false;
            for (ConversionMethodCreator preDefinedMethodCreator : preDefinedMethodCreators) {
                CodeLineBuilder codeLineBuilder = new CodeLineBuilder(classBuilder, 0);
                if (preDefinedMethodCreator.generate(this, from, to, conversion.methodName(), "from", "to", codeLineBuilder, classBuilder)) {
                    classBuilder.withMethod("default", conversion.methodName(), to, codeLineBuilder1 -> {
                        codeLineBuilder1.add(codeLineBuilder);
                        codeLineBuilder1.append("return to;");
                    }, new Parameter(from, "from"));
                    foundPreDefined = true;
                    break;
                }
            }

            if (foundPreDefined) continue;

            CodeLineBuilder codeLineBuilder = new CodeLineBuilder(classBuilder, 0);
            conversion.methodBuilder().generate(this, from, to, conversion.methodName(), "from", "to", codeLineBuilder, classBuilder);
            if (codeLineBuilder.isEmpty()) {
                classBuilder.withAbstractMethod("public", conversion.methodName(), to, new Parameter(from, "from"));
            } else {
                classBuilder.withMethod("default", conversion.methodName(), to, codeLineBuilder1 -> {
                    codeLineBuilder1.add(codeLineBuilder);
                    codeLineBuilder1.append("return to;");
                }, new Parameter(from, "from"));
            }
        }
        classBuilder.writeClassFile(sourceDir);
    }

    public void buildWrapperAdapters(File sourceDir) {

        // We search for all conversion functions that convert the same class type to the same other class type
        // The result of this search are all generic variants if any exist
        Map<ApiToImpl, Set<ApiToImpl>> variants = new HashMap<>();
        for (ApiToImpl apiToImpl : apiToImpls) {
            for (ApiToImpl toImpl : apiToImpls) {
                if (!apiToImpl.api().compareWithoutGenerics(toImpl.api()) || apiToImpl.impl().compareWithoutGenerics(toImpl.impl()))
                    continue;
                variants.computeIfAbsent(new ApiToImpl(apiToImpl.api().withNoGenerics(), apiToImpl.impl().withNoGenerics()), apiTo -> new HashSet<>()).add(toImpl);
            }
        }

        variants.forEach((types, genericVariants) -> {
            if (types.api().compareWithoutGenerics(DynamicType.of(List.class)))
                return;

            String className = "NMS" + types.impl().getClassDescription().getClassName() + "Adapter";
            ClassBuilder classBuilder = new ClassBuilder();
            classBuilder.withPackage(converterClassPackage + ".adapters");
            classBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, className, "");
            classBuilder.implementsClasses(DynamicType.of(WrapperAdapter.class).withAddedGeneric(types.impl()).withAddedGeneric(types.api()));

            classBuilder.includeImport(types.api());
            classBuilder.includeImport(types.impl());
            classBuilder.includeImport(DynamicType.of(WrapperAdapter.class));

            classBuilder.withMethod("public", "getPlatformType", DynamicType.of(Class.class).withAddedGeneric(types.impl()), methodCode -> {
                methodCode.appendAndNewLine("return " + types.impl().getTypeName() + ".class;");
            });

            classBuilder.withMethod("public", "getApiType", DynamicType.of(Class.class).withAddedGeneric(types.api()), methodCode -> {
                methodCode.appendAndNewLine("return " + types.api().getTypeName() + ".class;");
            });

            classBuilder.withMethod("public", "apiToPlatform", types.impl(), methodCode -> {

                for (ApiToImpl genericVariant : genericVariants) {
                    methodCode.appendAndNewLine("if(wrappedObject instanceof " + genericVariant.api() + ") {");
                    methodCode.appendAndNewLine("return null;");
                    methodCode.appendAndNewLine("}");
                }

                methodCode.appendAndNewLine("return null;");
            }, new Parameter(types.api(), "wrappedObject"));

            classBuilder.withMethod("public", "platformToApi", types.api(), methodCode -> {
                methodCode.appendAndNewLine("return null;");
            }, new Parameter(types.impl(), "platformObject"));

            try {
                classBuilder.writeClassFile(sourceDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public Set<ConversionMethodCreator> getPreDefinedConverters() {
        return preDefinedMethodCreators;
    }

    public static Map<FromTo, Conversion> getConverterToFunctionNameMap() {
        return Map.copyOf(converterToFunctionName);
    }

    public ClassDescription getConverterClass() {
        return classBuilder.getClassDescription();
    }

    public record Conversion(DynamicType from, DynamicType to, String methodName,
                             ConversionMethodCreator methodBuilder) {
    }

    public record FromTo(DynamicType from, DynamicType to) {
    }

    private record ApiToImpl(DynamicType api, DynamicType impl) {
    }

    public interface ConversionMethodCreator {
        /**
         * Returns true if a method was generated by this creator
         *
         * @param from
         * @param to
         * @param assignedMethodName
         * @param classBuilder
         * @return
         */
        boolean generate(ConverterGenerator converterGenerator, DynamicType from, DynamicType to, String assignedMethodName, String fromParameterName, String outputParameterName, CodeLineBuilder methodBuilder, ClassBuilder classBuilder);

        default void createFromToMethod(DynamicType from, DynamicType to, String assignedMethodName, ClassBuilder classBuilder, Consumer<CodeLineBuilder> codeLineBuilderConsumer) {
            classBuilder.withMethod("default", assignedMethodName, to, codeLineBuilderConsumer, new Parameter(from, "from"));
        }
    }
}
