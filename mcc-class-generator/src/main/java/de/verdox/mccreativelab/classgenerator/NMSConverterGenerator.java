package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.Singleton;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class NMSConverterGenerator {
    private static final Map<Conversion, String> converterToFunctionName = new LinkedHashMap<>();
    private final ClassDescription converterClass;

    public NMSConverterGenerator(String converterClassPackage, String converterClassName) {
        converterClass = new ClassDescription(converterClassPackage, converterClassName, null);
    }

    public String requireGeneratorFunction(DynamicType api, DynamicType impl) {
        if(converterToFunctionName.containsKey(new Conversion(api, impl)))
            return converterToFunctionName.get(new Conversion(api, impl));
        Conversion apiToImpl = new Conversion(api, impl);
        Conversion implToApi = new Conversion(impl, api);
        int id = converterToFunctionName.size();
        if (!converterToFunctionName.containsKey(apiToImpl))
            converterToFunctionName.put(apiToImpl, "apiToImpl" + id);
        if (!converterToFunctionName.containsKey(implToApi))
            converterToFunctionName.put(implToApi, "implToApi" + id);
        return getConverterFunctionName(api, impl);
    }

    public String getConverterFunctionName(DynamicType from, DynamicType to){
        return converterToFunctionName.get(new Conversion(from, to));
    }

    public void buildConverterInterface(File sourceDir) throws IOException {
        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withPackage(converterClass.packageName());
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.INTERFACE, converterClass.className(), "");
        classBuilder.includeImport(Singleton.class);
        //TODO: Google Types hier nutzen für generics
        classBuilder.withField("public static final", DynamicType.of(Singleton.class, true), "<" + converterClass.className() + "> INSTANCE", "new Singleton<>(" + converterClass.className() + ".class);");

        converterToFunctionName.forEach((conversion, s) -> classBuilder.withAbstractMethod("public", s, conversion.to, new Parameter(conversion.from, "from")));
        classBuilder.writeClassFile(sourceDir);
    }

    public ClassDescription getConverterClass() {
        return converterClass;
    }

    private record Conversion(DynamicType from, DynamicType to) {
    }
}
