package searchAlgorithms;

class BinarySearch {
    /**
     * Binary search algorithm.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int itemToFind = 8;
        BinarySearch ob = new BinarySearch();
        int index = ob.search(arr, itemToFind);
        if (index == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at index: " + index);
        }

    }

    /**
     * This method searches for the item in the array.
     * 
     * @param arr        - array to be searched
     * @param itemToFind - item to be searched for
     * @return integer index of the item in the array.
     */
    int search(int[] arr, int itemToFind) {
        int low = 0;

        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("low: " + low + " mid: " + mid + " high: " + high);
            if (arr[mid] == itemToFind) {
                return mid;
            } else if (arr[mid] < itemToFind) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}