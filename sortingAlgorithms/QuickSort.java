package sortingAlgorithms;

public class QuickSort {
    private QuickSort() {
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 1, 3, 6, 13, 97, 3, 5, 24, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 };
        int[] sortedArray = quickSortMethod(arr, 0, arr.length - 1);
        for (int item : sortedArray) {
            System.out.print(item + " ");
        }
    }

    private static int[] quickSortMethod(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivot = partition(arr, begin, end);
            quickSortMethod(arr, begin, pivot - 1);
            quickSortMethod(arr, pivot + 1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/**
 * https://www.baeldung.com/java-quicksort
 * It’s generally an “in-place” algorithm, with the average time complexity of
 * O(n log n).
 * Although both Quicksort and Mergesort have an average time complexity of O(n
 * log n), Quicksort is the preferred algorithm, as it has an O(log(n)) space
 * complexity. Mergesort, on the other hand, requires O(n) extra storage, which
 * makes it quite expensive for arrays.
 * 
 * Quicksort requires to access different indices for its operations, but this
 * access is not directly possible in linked lists, as there are no continuous
 * blocks; therefore to access an element we have to iterate through each node
 * from the beginning of the linked list. Also, Mergesort is implemented without
 * extra space for LinkedLists.
 * 
 * In such case, overhead increases for Quicksort and Mergesort is generally
 * preferred.
 */