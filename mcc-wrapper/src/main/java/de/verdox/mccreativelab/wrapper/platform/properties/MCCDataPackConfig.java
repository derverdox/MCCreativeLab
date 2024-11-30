package de.verdox.mccreativelab.wrapper.platform.properties;

import com.google.common.reflect.TypeToken;

import java.util.List;
import java.util.Properties;

public record MCCDataPackConfig(List<String> enabled, List<String> disabled) {

    public static class PropertyValue extends de.verdox.mccreativelab.wrapper.platform.properties.PropertyValue<MCCDataPackConfig>{
        public PropertyValue() {
            super(new TypeToken<>() {});
        }

        @Override
        public MCCDataPackConfig read(String key, Properties properties) {



            return null;
        }

        @Override
        public void write(String key, Properties properties, MCCDataPackConfig value) {

        }
    }

}
