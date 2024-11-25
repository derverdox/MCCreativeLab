package de.verdox.mccreativelab.wrapper.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Signals that the annotated element adds logic to the game that is not supported by the native minecraft server platform but can still be implemented on a custom platform implementation.
 * This also means that in most cases this logic will not work unless the interface is used on a custom server platform like paper or fabric
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MCCLogic {
}
