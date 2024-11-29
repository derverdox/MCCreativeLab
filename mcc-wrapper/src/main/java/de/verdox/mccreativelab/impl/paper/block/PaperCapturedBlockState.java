package de.verdox.mccreativelab.impl.paper.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCCapturedBlockState;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.implementation.SuperMethodCall;
import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.matcher.ElementMatchers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.block.CraftBlockState;
import org.bukkit.craftbukkit.block.CraftBlockStates;
import org.jetbrains.annotations.NotNull;

public class PaperCapturedBlockState extends MCCCapturedBlockState {
    private final BlockState bukkitBlockState;
    private final ConversionService conversionService = MCCPlatform.getInstance().getConversionService();

    public PaperCapturedBlockState(@NotNull MCCBlock block, int flag) {
        super(block, flag);

        World world = conversionService.unwrap(block.getLocation().world(), new TypeToken<>() {});
        Location location = conversionService.unwrap(block.getLocation(), new TypeToken<>() {});
        CraftBlockState craftBlockState = (CraftBlockState) world.getBlockAt(location).getState(true);
        try {
            bukkitBlockState = createProxy(craftBlockState.getClass(), craftBlockState);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public PaperCapturedBlockState(MCCLocation location, MCCBlockState capturedBlockState) {
        super(location, capturedBlockState);

        ServerLevel serverLevel = conversionService.unwrap(location.world(), new TypeToken<>() {});
        CraftBlockState craftBlockState = CraftBlockStates.getBlockState(serverLevel, new BlockPos(location.blockX(), location.blockY(), location.blockZ()));
        try {
            bukkitBlockState = createProxy(craftBlockState.getClass(), craftBlockState);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PaperCapturedBlockState from(CraftBlockState craftBlockState, ConversionService conversionService) {
        if (craftBlockState.isPlaced()) {
            return new PaperCapturedBlockState(conversionService.wrap(craftBlockState.getBlock(), new TypeToken<>() {}), craftBlockState.getFlag());
        } else {
            return new PaperCapturedBlockState(conversionService.wrap(craftBlockState.getLocation(), new TypeToken<>() {}), conversionService.wrap(craftBlockState.getLocation(), new TypeToken<>() {}));
        }
    }

    public static PaperCapturedBlockState from(MCCCapturedBlockState blockState) {
        if(blockState instanceof PaperCapturedBlockState paperCapturedBlockState){
            return paperCapturedBlockState;
        }
        if (blockState.isPlaced()) {
            return new PaperCapturedBlockState(blockState.getBlock(), blockState.getFlag());
        } else {
            return new PaperCapturedBlockState(blockState.getLocation(), blockState.getCapturedBlockState());
        }
    }

    public BlockState getBukkitBlockState() {
        return bukkitBlockState;
    }

    private <C extends CraftBlockState> C createProxy(Class<? extends C> craftBlockStateType, C type) throws Exception {
        // Byte Buddy Proxy erzeugen
        return new ByteBuddy()
            .subclass(craftBlockStateType) // Der Proxy erbt von der Klasse des Originals
            .method(ElementMatchers.named("update")
                .and(ElementMatchers.takesArguments(2))) // Nur die "update"-Methode überschreiben
            .intercept(MethodDelegation.to(new CustomUpdateInterceptor(this)))
            .method(ElementMatchers.any()) // Alle anderen Methoden unverändert lassen
            .intercept(SuperMethodCall.INSTANCE)
            .make()
            .load(craftBlockStateType.getClassLoader())
            .getLoaded()
            .getDeclaredConstructor(CraftBlockState.class, Location.class)
            .newInstance(type, type.getLocation());
    }

    private record CustomUpdateInterceptor(PaperCapturedBlockState paperCapturedBlockState) {
        @RuntimeType
        public void intercept(@AllArguments Object[] args) throws Exception {
            boolean force = (boolean) args[0];
            boolean applyPhysics = (boolean) args[1];

            if (!paperCapturedBlockState.getToChange().isVanilla()) {
                paperCapturedBlockState.update(force, applyPhysics);
            } else {
                paperCapturedBlockState.getBukkitBlockState().getClass()
                    .getMethod("update", boolean.class, boolean.class)
                    .invoke(paperCapturedBlockState.getBukkitBlockState(), force, applyPhysics);
            }
        }
    }
}
