package sortAndSearchTest;

import SortAndSearch.BinarySearch;
import SortAndSearch.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    private static int[] arr = {11, 3, 16, 14, 25, 9, 5, 45, 81, 10};

    @BeforeAll
    public static void sortingArr() {
        BubbleSort.fromDownToUp(arr);
    }

    @Test
    public void findTest() {
        Assertions.assertEquals(5, BinarySearch.find(arr, 14));
        Assertions.assertNotEquals(8, BinarySearch.find(arr, 81));
        Assertions.assertEquals(9, BinarySearch.find(arr, 81));
        Assertions.assertEquals(7, BinarySearch.find(arr, 25));
        Assertions.assertEquals(-1, BinarySearch.find(arr, 105));
    }
}
