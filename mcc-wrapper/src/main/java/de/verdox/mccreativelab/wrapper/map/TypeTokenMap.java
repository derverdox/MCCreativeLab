package de.verdox.mccreativelab.wrapper.map;

import com.google.common.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * Saves values according to best matching {@link com.google.common.reflect.TypeToken}
 * @param <V>
 */
public class TypeTokenMap<V> {
    private final TreeMap<Integer, Map<TypeToken<?>, V>> map = new TreeMap<>();

    private <T> int getSpecificityScore(TypeToken<T> typeToken) {
        return typeToken.getType().getTypeName().split("\\.").length;
    }

    public <T> void put(TypeToken<T> typeToken, V value) {
        int score = getSpecificityScore(typeToken);
        map.computeIfAbsent(score, k -> new HashMap<>()).put(typeToken, value);
    }

    // Die neue contains-Methode
    public <T> boolean contains(TypeToken<T> requestedToken) {
        for (Map<TypeToken<?>, V> group : map.descendingMap().values()) {
            for (TypeToken<?> key : group.keySet()) {
                if (key.equals(requestedToken)) {
                    return true;
                }
            }
        }
        return false;
    }

    public <T> Optional<V> get(TypeToken<T> requestedToken) {
        // Durchlaufen der spezifischsten Gruppen zuerst
        for (Map<TypeToken<?>, V> group : map.descendingMap().values()) {
            for (Map.Entry<TypeToken<?>, V> entry : group.entrySet()) {
                if (entry.getKey().isSupertypeOf(requestedToken) || entry.getKey().equals(requestedToken)) {
                    return Optional.of(entry.getValue());
                }
            }
        }
        return Optional.empty();
    }

    public void clear(){
        map.clear();
    }
}
