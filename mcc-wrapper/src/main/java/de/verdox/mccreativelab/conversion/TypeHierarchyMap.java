package de.verdox.mccreativelab.conversion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * This hierarchy map is used to group values by provided class types.
 * However, if you put a new type into the map that extends an already existing class then the new value associated with it is inserted in the tree structure.
 * Now when retrieving a value from the map with a provided type it will search for the type that fits best and return the associated result.
 *
 * @param <V>
 */
public class TypeHierarchyMap<V> implements Map<Class<?>, V> {
    private final HierarchyNode<V> root = new HierarchyNode<>(Object.class, null); // null as value is only allowed for the root node

    @Override
    public int size() {
        return root.size();
    }

    @Override
    public boolean isEmpty() {
        return root.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return root.containsKey(key);
    }

    /**
     * Is used to check whether a class is either contained as a direct key in the map or a superclass of the type is found.
     *
     * @param key the type
     * @return true if a relative was found
     */
    public boolean canFindRelative(Class<?> key) {
        return root.canFindRelative(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return root.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return root.get(key);
    }

    @Override
    public @Nullable V put(Class<?> key, V value) {
        return root.put(key, value);
    }

    @Override
    public V remove(Object key) {
        return root.remove(key);
    }

    @Override
    public void putAll(@NotNull Map<? extends Class<?>, ? extends V> m) {
        root.putAll(m);
    }

    @Override
    public void clear() {
        root.clear();
    }

    @Override
    public @NotNull Set<Class<?>> keySet() {
        return root.keySet();
    }

    @Override
    public @NotNull Collection<V> values() {
        return root.values();
    }

    @Override
    public @NotNull Set<Entry<Class<?>, V>> entrySet() {
        return root.entrySet();
    }

    @Override
    public String toString() {
        return "TypeHierarchyMap{" +
            "root=" + root +
            '}';
    }

    private static class HierarchyNode<V> implements Map<Class<?>, V> {
        private final Class<?> type;
        private V value;

        private final Map<Class<?>, HierarchyNode<V>> childTypes = new ConcurrentHashMap<>();

        private HierarchyNode(Class<?> type, V value) {
            Objects.requireNonNull(type);
            if (!type.equals(Object.class) && value == null) {
                throw new IllegalArgumentException("Value of hierarchy node cannot be null");
            }
            this.type = type;
            this.value = value;
        }


        @Override
        public int size() {
            return childTypes.values().parallelStream().mapToInt(HierarchyNode::size).sum() + (value != null ? 1 : 0);
        }

        @Override
        public boolean isEmpty() {
            return value == null && childTypes.isEmpty();
        }

        public boolean canFindRelative(Class<?> key) {
            Objects.requireNonNull(key);
            if (isEmpty() || !(key instanceof Class<?> clazz)) {
                return false;
            }

            if (this.type.isAssignableFrom(clazz)) {
                return true;
            }

            if (childTypes.containsKey(clazz)) {
                return true;
            }

            return childTypes.keySet().parallelStream().filter(aClass -> aClass.isAssignableFrom(clazz)).map(childTypes::get).anyMatch(node -> node.containsKey(clazz));
        }

        @Override
        public boolean containsKey(Object key) {
            Objects.requireNonNull(key);
            if (isEmpty() || !(key instanceof Class<?> clazz)) {
                return false;
            }

            if (this.type.equals(clazz)) {
                return true;
            }

            if (childTypes.containsKey(clazz)) {
                return true;
            }

            return childTypes.keySet().parallelStream().filter(aClass -> aClass.isAssignableFrom(clazz)).map(childTypes::get).anyMatch(node -> node.containsKey(clazz));
        }

        @Override
        public boolean containsValue(Object value) {
            Objects.requireNonNull(value);
            return childTypes.containsValue(value) || childTypes.values().parallelStream().anyMatch(node -> node.containsValue(value));
        }

        @Override
        public V get(Object key) {
            Objects.requireNonNull(key);
            if (isEmpty() || !(key instanceof Class<?> clazz)) {
                return null;
            }

            if (this.type.equals(clazz)) {
                return this.value;
            }

            Class<?> foundAssignable = childTypes.keySet().parallelStream().filter(aClass -> aClass.isAssignableFrom(clazz)).findAny().orElse(null);
            if (foundAssignable != null) {
                return childTypes.get(foundAssignable).get(clazz);
            }

            // Although, containsKey and isAssignableFrom is technically the same call for classes that are equal, however it is better performance wise to first to a direct check.

            if (childTypes.containsKey(clazz)) {
                return childTypes.get(clazz).value;
            }

            if (this.type.isAssignableFrom(clazz)) {
                return this.value;
            }

            return null;
        }

        @Override
        public @Nullable V put(Class<?> key, V value) {
            Objects.requireNonNull(key);
            Objects.requireNonNull(value);
            if (key.equals(Object.class)) {
                throw new IllegalArgumentException("Cannot use Object.class as a key");
            }

            if (this.type.equals(key)) {
                V oldValue = this.value;
                this.value = value;
                return oldValue;
            }

            if (childTypes.containsKey(key)) {
                return childTypes.get(key).put(key, value);
            }

            Class<?> foundAssignable = childTypes.keySet().parallelStream().filter(aClass -> aClass.isAssignableFrom(key)).findAny().orElse(null);
            if (foundAssignable != null) {
                return childTypes.get(foundAssignable).put(key, value);
            }

            return putAndReorganize(key, value);
        }


        @Override
        public V remove(Object key) {
            Objects.requireNonNull(key);
            if (key.equals(Object.class)) {
                throw new IllegalArgumentException("Cannot remove Object.class from the hierarchy");
            }

            if (isEmpty() || !(key instanceof Class<?> clazz)) {
                return null;
            }


            if (childTypes.containsKey(clazz)) {
                return childTypes.remove(clazz).value;
            }

            Class<?> foundAssignable = childTypes.keySet().parallelStream().filter(aClass -> aClass.isAssignableFrom(clazz)).findAny().orElse(null);
            if (foundAssignable != null) {
                return childTypes.get(foundAssignable).remove(key);
            }

            return null;
        }

        @Override
        public void putAll(@NotNull Map<? extends Class<?>, ? extends V> m) {
            m.entrySet().parallelStream().forEach(entry -> put(entry.getKey(), entry.getValue()));
        }

        @Override
        public void clear() {
            childTypes.clear();
        }

        @Override
        public @NotNull Set<Class<?>> keySet() {
            Set<Class<?>> result = new HashSet<>();
            if (this.value != null) {
                result.add(this.type);
            }
            childTypes.values().parallelStream().forEach(vHierarchyNode -> result.addAll(vHierarchyNode.keySet()));
            return result;
        }

        @Override
        public @NotNull Collection<V> values() {
            List<V> result = new ArrayList<>(32);
            if (this.value != null) {
                result.add(this.value);
            }
            childTypes.values().parallelStream().forEach(vHierarchyNode -> result.addAll(vHierarchyNode.values()));
            return result;
        }

        @Override
        public @NotNull Set<Entry<Class<?>, V>> entrySet() {
            Set<Entry<Class<?>, V>> result = new HashSet<>();
            if (this.value != null) {
                result.add(new Entry<>() {
                    private V value;

                    @Override
                    public Class<?> getKey() {
                        return type;
                    }

                    @Override
                    public V getValue() {
                        return value;
                    }

                    @Override
                    public V setValue(V value) {
                        this.value = value;
                        return value;
                    }
                });
            }

            childTypes.values().parallelStream().forEach(vHierarchyNode -> result.addAll(vHierarchyNode.entrySet()));
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HierarchyNode<?> that = (HierarchyNode<?>) o;
            return Objects.equals(type, that.type) && Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(type, value);
        }


        private @Nullable V putAndReorganize(Class<?> key, V value) {
            Map<Class<?>, HierarchyNode<V>> toReOrganize = childTypes.entrySet().parallelStream().filter(pair -> key.isAssignableFrom(pair.getKey())).collect(Collectors.toConcurrentMap(Entry::getKey, Entry::getValue));

            if (!toReOrganize.isEmpty()) {
                for (Class<?> toRemove : toReOrganize.keySet()) {
                    childTypes.remove(toRemove);
                }
            }
            // Hinzufügen des neuen Knotens
            HierarchyNode<V> newNode = new HierarchyNode<>(key, value);
            HierarchyNode<V> former = childTypes.put(key, newNode);

            if (!toReOrganize.isEmpty()) {
                // Umsiedeln der vorher identifizierten Knoten
                newNode.childTypes.putAll(toReOrganize);
            }

            return former != null ? former.value : null;
        }

        @Override
        public String toString() {
            return "HierarchyNode{" +
                "type=" + type +
                ", value=" + value +
                ", childTypes=" + childTypes +
                '}';
        }
    }
}
