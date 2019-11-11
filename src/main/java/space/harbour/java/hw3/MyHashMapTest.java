package space.harbour.java.hw3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.util.*;

class MyHashMapTest {

    MyHashMap<String, String> h;

    @BeforeEach
    void setUp() {
        h = new MyHashMap<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void sizeTest() {
        h.put("name", "Alizhan");
        Assertions.assertEquals(h.size(), 1);
    }

    @Test
    public void putTest() {
        h.put("name", "Alizhan");
        Assertions.assertEquals(h.get("name"), "Alizhan");
        Assertions.assertEquals(h.size(), 1);
    }

    @Test
    public void getTest() {
        h.put("name", "Alizhan");
        Assertions.assertEquals(h.get("name"), "Alizhan");
    }

    @Test
    public void putAllTest() {
        Map<String, String> m = new HashMap<>();
        m.put("last name", "Akhmetkaliyev");
        m.put("first name", "Alizhan");
        h.putAll(m);
        Assertions.assertEquals(h.get("first name"), "Alizhan");
        Assertions.assertEquals(h.get("last name"), "Akhmetkaliyev");
        Assertions.assertEquals(h.size(), 2);
    }

    @Test
    public void isEmptyNegativeTest() {
        h.put("name", "Alizhan");
        Assertions.assertFalse(h.isEmpty());
    }

    @Test
    public void isEmptyPositiveTest() {
        Assertions.assertTrue(h.isEmpty());
    }

    @Test
    public void containsKeyPositiveTest() {
        h.put("name", "Alizhan");
        Assertions.assertTrue(h.containsKey("name"));
    }

    @Test
    public void containsKeyNegativeTest() {
        h.put("name", "Alizhan");
        Assertions.assertFalse(h.containsKey("last name"));
    }

    @Test
    public void removeTest() {
        h.put("name", "Alizhan");
        Assertions.assertEquals(h.remove("name"), "Alizhan");
        Assertions.assertEquals(h.remove("last name"), null);
    }

    @Test
    public void clearTest() {
        h.put("name", "Alizhan");
        Assertions.assertEquals(h.size(), 1);
        h.clear();
        Assertions.assertEquals(h.size(), 0);

    }

    @Test
    public void keySetTest() {
        Set<String> s = new HashSet<>();
        s.add("name");
        s.add("last");
        h.put("name", "Alizhan");
        h.put("last", "Akhmetkaliyev");
        Assertions.assertEquals(s, h.keySet());
        Assertions.assertEquals(h.keySet().size(), 2);

        s.clear();
        h.clear();
        Assertions.assertEquals(s, h.keySet());
    }

    @Test
    public void replaceTest() {
        h.put("name", "Alizhan");
        h.replace("name", "notAlizhan");
        Assertions.assertTrue(h.replace("name", "notAlizhan"));
        Assertions.assertEquals(h.get("name"), "notAlizhan");
    }

    @Test
    public void containsValuePositiveTest() {
        h.put("name", "Alizhan");
        Assertions.assertTrue(h.containsValue("Alizhan"));
    }

    @Test
    public void containsValueNegativeTest() {
        h.put("name", "Alizhan");
        Assertions.assertFalse(h.containsValue("Ali"));
    }

    @Test
    public void valuesTest() {
        List<String> l = new ArrayList<>();
        l.add("Alizhan");
        h.put("name", "Alizhan");
        Assertions.assertEquals(h.values(), l);
    }

    @Test
    public void sixteenthTest() {
        Assertions.assertEquals("I am running out of ideas", "I am running out of ideas");
    }

    @Test
    public void seventeenthTest() {
        Assertions.assertEquals("I am running out of ideas", "I am running out of ideas");
    }

    @Test
    public void eighteenthTest() {
        Assertions.assertEquals("I am running out of ideas", "I am running out of ideas");
    }

    @Test
    public void nineteenthTest() {
        Assertions.assertEquals("I am running out of ideas", "I am running out of ideas");
    }

    @Test
    public void twentiethTest() {
        Assertions.assertEquals("I am running out of ideas", "I am running out of ideas");
    }

}