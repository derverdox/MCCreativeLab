package de.verdox.mccreativelab.wrapper.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks where in the MCC ecosystem an object is actually created.
 * <p>
 * Let us assume we have implemented a custom {@link de.verdox.mccreativelab.wrapper.block.MCCBlockType}. In order to include that into the MCC ecosystem we need to modify the process where the actual implementations of the block types are read from the world.
 * This Annotation tells you where to look for this instantiation.
 * For example when getting a {@link de.verdox.mccreativelab.wrapper.block.MCCBlockType} from a {@link de.verdox.mccreativelab.wrapper.world.MCCWorld} it delegates the calls down to the {@link de.verdox.mccreativelab.wrapper.world.chunk.MCCChunkSection}.
 * Custom implementations now only need to create a custom {@link de.verdox.mccreativelab.wrapper.world.chunk.MCCChunkSection} to properly get their custom block type.
 * <p>
 * If the sourceClass is annotated as Object.class it means that the instantiation source is unknown.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MCCInstantiationSource {
    Class<?>[] sourceClasses();
}
