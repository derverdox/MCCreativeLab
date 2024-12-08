package de.verdox.mccreativelab.impl.vanilla.inventory.factory;

import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ContainerFactoryTests extends TestBase {
    private static final Set<MCCMenuType<?>> menuTypes = new HashSet<>();

    @BeforeAll
    public static void setup() throws IllegalAccessException {
        for (Field declaredField : MCCMenuTypes.class.getDeclaredFields()) {
            if(!declaredField.getType().isAssignableFrom(MCCMenuType.class)){
                continue;
            }
            if(!(declaredField.getGenericType() instanceof ParameterizedType parameterizedType)){
                continue;
            }
            MCCMenuType<?> menuType = (MCCMenuType<?>) declaredField.get(null);
            menuTypes.add(menuType);
        }
    }

    public static Stream<MCCMenuType<?>> provideReferences() {
        return menuTypes.stream();
    }

    @ParameterizedTest
    @MethodSource("provideReferences")
    public void testCreatorInstanceCreation(MCCMenuType<?> type) {
        MCCPlatform.getInstance().getContainerFactory().create(type);
    }

}
