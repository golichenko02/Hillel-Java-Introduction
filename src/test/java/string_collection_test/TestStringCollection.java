package string_collection_test;


import org.junit.jupiter.api.*;
import string_collection.StringCollection;


public class TestStringCollection {
    private  StringCollection collection;
    @BeforeAll
    public static void start() {
        System.out.println("------");
        System.out.println("START!");
        System.out.println("------");
    }


    @AfterAll
    public static void finish() {
        System.out.println("-------------");
        System.out.println("SUCCESSFULLY!");
        System.out.println("-------------");
    }


    @BeforeEach
    public void printInfo() {
        System.out.println("-----test-----");
        collection = new StringCollection();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
    }


    @RepeatedTest(3)
    public void checkAddForEx() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> collection.add(-263, "str"));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> collection.add(10, "str"));
    }


    @RepeatedTest(3)
    public void addTest() {
        Assertions.assertTrue(collection.add("smth"));
        Assertions.assertTrue(collection.add(0, "smth"));
    }



    @RepeatedTest(3)
    public void deleteTest() {
        Assertions.assertTrue(collection.delete("a"));
        Assertions.assertTrue(collection.delete("b"));
        Assertions.assertTrue(collection.delete("c"));
        Assertions.assertTrue(collection.delete("d"));
        Assertions.assertFalse(collection.delete("f"));
        Assertions.assertFalse(collection.delete(null));
        Assertions.assertFalse(collection.delete(-1));
        Assertions.assertFalse(collection.delete(10000));
    }


    @RepeatedTest(3)
    public void getTest() {
        Assertions.assertEquals("a",collection.get(0));
        Assertions.assertNotEquals("c",collection.get(3));
        Assertions.assertEquals("d",collection.get(3));
    }



    @RepeatedTest(3)
    public void checkGetForEx(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> collection.get(-2));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> collection.get(50));
    }

    @RepeatedTest(3)
    public void sizeTest(){
        Assertions.assertEquals(4,collection.size());
        collection.delete(0);
        Assertions.assertEquals(3,collection.size());
        Assertions.assertNotEquals(5,collection.size());

    }

    @RepeatedTest(3)
    public void clearTest(){
        Assertions.assertTrue(collection.clear());
        Assertions.assertFalse(collection.clear());
        Assertions.assertEquals(0,collection.size());
    }

    @RepeatedTest(3)
    public void containsTest(){
        Assertions.assertTrue(collection.contains("a"));
        Assertions.assertTrue(collection.contains("b"));
        Assertions.assertFalse(collection.contains("h"));
        Assertions.assertFalse(collection.contains("A"));
    }

    @RepeatedTest(3)
    public void equalsTest(){
        StringCollection test = new StringCollection();
        Assertions.assertTrue(collection.equals(collection));
        Assertions.assertFalse(collection.equals(test));
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        Assertions.assertTrue(collection.equals(test));
        test.delete("b");
        Assertions.assertFalse(collection.equals(test));
    }


}
