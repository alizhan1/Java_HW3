package space.harbour.java.hw3;

public class Element<K, V> {
    private K key;
    private V value;

    public Element(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
