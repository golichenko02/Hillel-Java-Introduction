package SortAndSearch;

public class BinarySearch {
    public static int find(int[] sortedArr, int key) {
        int left = 0;
        int right = sortedArr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortedArr[mid] == key)
                return mid;
            if (sortedArr[mid] < key)
                left = mid + 1;
            if (sortedArr[mid] > key)
                right = mid - 1;
        }
        return -1;
    }
}
