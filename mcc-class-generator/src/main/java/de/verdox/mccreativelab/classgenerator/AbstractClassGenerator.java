package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;

import java.io.File;
import java.lang.reflect.Type;
import java.util.List;

public class AbstractClassGenerator {
    protected final String suffix;
    protected final List<Class<?>> excludedTypes;
    protected final List<String> excludedPackages;
    protected final File srcDir;
    protected final String prefix;

    public AbstractClassGenerator(File srcDir, String prefix, String suffix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        this.srcDir = srcDir;
        this.prefix = prefix;
        this.suffix = suffix;
        this.excludedTypes = excludedTypes;
        this.excludedPackages = excludedPackages;
    }

    public boolean isForbiddenType(DynamicType dynamicType){
        if(dynamicType.getRawType() == null)
            return false;

        if(excludedTypes.contains(dynamicType.getRawType()))
            return true;

        for (DynamicType genericType : dynamicType.getGenericTypes()) {
            if(isForbiddenType(genericType))
                return true;
        }
        return false;
    }

    public boolean isForbiddenType(Type type){
        return isForbiddenType(DynamicType.of(type, false));
    }
}
