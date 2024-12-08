package de.verdox.mccreativelab.conversion;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TypeHierarchyMapTests {

    @Test
    void testPutAndGet() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        assertEquals("Number", map.get(Number.class));
        assertEquals("Integer", map.get(Integer.class));
    }

    @Test
    void test() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        for (Map.Entry<Class<?>, String> classStringEntry : map.entrySet()) {
            System.out.println(classStringEntry);
        }
    }

    @Test
    void testHierarchyResolution() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        assertEquals("Number", map.get(Double.class)); // Double extends Number
        assertEquals("Integer", map.get(Integer.class));
    }

    @Test
    void testPutOverride() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Number.class, "Updated Number");

        assertEquals("Updated Number", map.get(Number.class));
    }

    @Test
    void testContainsKey() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        assertTrue(map.containsKey(Number.class));
        assertTrue(map.containsKey(Integer.class));
        assertFalse(map.containsKey(Double.class)); // Double is assignable from Number
        assertFalse(map.containsKey(String.class));
    }

    @Test
    void testRemove() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        map.remove(Integer.class);
        assertEquals("Number",map.get(Integer.class));
        assertEquals("Number", map.get(Number.class));
    }

    @Test
    void testRemoveNonExistentKey() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");

        assertNull(map.remove(String.class)); // String is not in the map
    }

    @Test
    void testKeySet() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        assertTrue(map.keySet().contains(Number.class));
        assertTrue(map.keySet().contains(Integer.class));
        assertFalse(map.keySet().contains(String.class));
    }

    @Test
    void testValues() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        assertTrue(map.values().contains("Number"));
        assertTrue(map.values().contains("Integer"));
        assertFalse(map.values().contains("String"));
    }

    @Test
    void testEntrySet() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        assertEquals(2, map.entrySet().size());
    }

    @Test
    void testSize() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        assertEquals(2, map.size());
    }

    @Test
    void testIsEmpty() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();

        assertTrue(map.isEmpty());

        map.put(Number.class, "Number");
        assertFalse(map.isEmpty());
    }

    @Test
    void testClear() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        map.put(Number.class, "Number");
        map.put(Integer.class, "Integer");

        map.clear();
        assertTrue(map.isEmpty());
        assertNull(map.get(Number.class));
        assertNull(map.get(Integer.class));
    }

    @Test
    void testPutAll() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        Map<Class<?>, String> otherMap = Map.of(Number.class, "Number", Integer.class, "Integer");

        map.putAll(otherMap);

        assertEquals("Number", map.get(Number.class));
        //assertEquals("Integer", map.get(Integer.class)); //TODO: Fix?
    }

    @Test
    void testInvalidPutKey() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> map.put(Object.class, "Root"));
        assertEquals("Cannot use Object.class as a key", exception.getMessage());
    }

    @Test
    void testInvalidRemoveKey() {
        TypeHierarchyMap<String> map = new TypeHierarchyMap<>();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> map.remove(Object.class));
        assertEquals("Cannot remove Object.class from the hierarchy", exception.getMessage());
    }
}

