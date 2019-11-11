package space.harbour.java.hw3;

public class Element<K, V> {
    public K key;
    public V value;

    public Element(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public  Element() {}
}
