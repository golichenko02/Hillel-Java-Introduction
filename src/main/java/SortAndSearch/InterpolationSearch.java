package SortAndSearch;

public class InterpolationSearch {
    public static int find(int[] sortedArr, int key) {
        int left = 0;
        int right = sortedArr.length - 1;
        while (sortedArr[left] <= key && key <= sortedArr[right]) {
            int mid = left + (key - sortedArr[left]) * (right - left) / (sortedArr[right] - sortedArr[left]);
            if (sortedArr[mid] == key)
                return mid;
            if (sortedArr[mid] < key)
                left = ++mid;
            if (sortedArr[mid] > key)
                right = --mid;
        }
        return -1;
    }
}
