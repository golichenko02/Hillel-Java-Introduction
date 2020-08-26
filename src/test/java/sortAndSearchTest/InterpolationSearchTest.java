package sortAndSearchTest;

import SortAndSearch.InsertionSort;
import SortAndSearch.InterpolationSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InterpolationSearchTest {
    private static int[] arr = {11, 3, 16, 14, 25, 9, 5, 45, 81, 10};
    @BeforeAll
    public static void sortingArr(){
        InsertionSort.sort(arr);
    }
    @Test
    public void findTest(){
        Assertions.assertEquals(5, InterpolationSearch.find(arr,14));
        Assertions.assertNotEquals(8, InterpolationSearch.find(arr,81));
        Assertions.assertEquals(9, InterpolationSearch.find(arr,81));
        Assertions.assertEquals(8, InterpolationSearch.find(arr,45));
        Assertions.assertEquals(-1, InterpolationSearch.find(arr,59));
    }
}
