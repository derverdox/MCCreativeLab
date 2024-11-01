package de.verdox.mccreativelab.classgenerator;

import java.lang.reflect.Method;

public class MethodOriginFinder {
    private Class<?> result;
    private Method foundMethod;

    public void startFindingMethod(Method method) {
        startFindingMethod(method.getDeclaringClass(), method.getName(), method.getParameterTypes());
    }

    public synchronized void startFindingMethod(Class<?> currentClass, String methodName, Class<?>... parameterTypes) {
        result = null;
        foundMethod = null;
        search(currentClass, methodName, parameterTypes);
    }

    public Class<?> getClassDeclaringMethod() {
        return result;
    }

    public Method getOriginalMethod() {
        return foundMethod;
    }

    private boolean search(Class<?> currentClass, String methodName, Class<?>... parameterTypes) {
        if (result != null)
            return false;
        boolean foundInSuperClass = false;
        if (currentClass.getSuperclass() != null && !currentClass.getSuperclass().equals(Object.class)) {
            var found = search(currentClass.getSuperclass(), methodName, parameterTypes);
            if (found)
                foundInSuperClass = true;
        }

        boolean foundInAnyInterface = false;
        for (Class<?> anInterface : currentClass.getInterfaces()) {
            var foundMethodInInterface = search(anInterface, methodName, parameterTypes);
            if (foundMethodInInterface)
                foundInAnyInterface = true;
        }


        try {
            Method method = currentClass.getMethod(methodName, parameterTypes);

            if (!foundInSuperClass && !foundInAnyInterface && !currentClass.equals(Object.class)) {
                result = currentClass;
                foundMethod = method;
            }

            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }
}
