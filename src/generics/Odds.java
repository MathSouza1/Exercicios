package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Odds<K extends Number, V> {

    private final Set<Odd<K, V>> items = new LinkedHashSet<>();

    public void add(K key, V value) {
        if(key == null) return;

        Odd<K, V> newOdd = new Odd<K, V>(key, value);

        if(items.contains(newOdd)) {
            items.remove(newOdd);
        }

        items.add(newOdd);
    }

    public V getValue(K key) {
        if(key == null) return null;
        Optional<Odd<K, V>> optionalOdd = items.stream()
                .filter(odd -> key.equals(odd.getKey()))
                .findFirst();

        return optionalOdd.isPresent() ? optionalOdd.get().getValue() : null;
    }
}
