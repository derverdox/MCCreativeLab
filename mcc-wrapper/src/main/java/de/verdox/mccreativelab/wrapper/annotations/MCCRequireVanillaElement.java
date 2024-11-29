package de.verdox.mccreativelab.wrapper.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to specify, that a MCC parameter needs to be a vanilla element. Else the method would throw an exception.
 * <p>
 * A vanilla element is an element that the native minecraft platform knows.
 * This annotation can be ignored if you work on a platform that allows minecraft client manipulation as well (Mods).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface MCCRequireVanillaElement {
}
