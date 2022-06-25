package sortingAlgorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 1, 3, 6, 13, 97, 3, 5, 24, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 };
        mergeSortMethod(arr, arr.length);
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void mergeSortMethod(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSortMethod(l, mid);
        mergeSortMethod(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSortMethod(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
}

/**
 * https://www.baeldung.com/java-merge-sort
 * Merge sort is a divide and conquer algorithm. It divides the array in two
 * halves, recursively calls itself for the two halves and then merges the two
 * sorted halves.
 * The time complexity will come to O(n Log n). This is true for the worst,
 * average, and * best cases, since it'll always divide the array into two and
 * then merge.The space complexity of the algorithm is O(n), as we're creating
 * temporary arrays in every recursive call.
 */
