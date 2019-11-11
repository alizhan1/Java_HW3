package space.harbour.java.hw3;

import space.harbour.java.hw3.Element;

import java.util.*;

public class MyHashMap<K, V> {

    private final Integer bucket_size = 32;

    private List<Element> bucket[] = new ArrayList[bucket_size];

    public MyHashMap() {
        for (int i = 0; i < bucket_size; i++) {
            bucket[i] = new ArrayList<Element>();
        }
    }

    private int hashify(K key) {
        int hash = key.hashCode();
        if (hash > 31) {
            hash = hash >> 27;
        }
        else if (hash < 0) {
            hash = -1*(hash) >> 27;
        }
        return hash;
    }

    public int size() {
        Integer size = 0;
        for (int i = 0; i < bucket_size; i++) {
            size += bucket[i].size();
        }
        return size;
    }

    public void put(K key, V value) {
        int hash = hashify(key);
        Element element = new Element<K, V>(key, value);
        bucket[hash].add(element);
    }

    public void putAll(Map<K, V> m) {
        Set<K> keys = m.keySet();
        for (K key : keys) {
            Element element = new Element<K, V>(key, m.get(key));
            bucket[hashify(key)].add(element);
        }
    }

    public V remove(K key) {
        for (Element e : bucket[hashify(key)]) {
            if (e.key == key) {
                bucket[hashify(key)].remove(e);
                return (V) e.value;
            }
        }
        return null;
    }

    public V get(K key) {
        for (Element e : bucket[hashify(key)]) {
            if (e.key == key) {
                return (V) e.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        for (Element e : bucket[hashify(key)]) {
            if (e.key == key) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < bucket_size; i++) {
            for (Element e : bucket[i]) {
                if (e.value == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        for (int i = 0; i < bucket_size; i++) {
            if (bucket[i].size() > 0) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < bucket_size; i++) {
            bucket[i].clear();
        }
    }

    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (int i = 0; i < bucket_size; i++) {
            for (Element e : bucket[i]) {
                keys.add((K) e.key);
            }
        }
        return keys;
    }

    public boolean replace(K key, V value) {
        for (int i = 0; i < bucket[hashify(key)].size(); i++) {
            if (bucket[hashify(key)].get(i).key == key && bucket[hashify(key)].get(i).value != null) {
                Element element = new Element<K, V>(key, value);
                bucket[hashify(key)].set(i, element);
                return true;
            }
        }
        return false;
    }

    public List<V> values() {
        List<V> values = new ArrayList<>();
        for (int i = 0; i < bucket_size; i++) {
            for (Element e : bucket[i]) {
                values.add((V) e.value);
            }
        }
        return values;
    }

}
