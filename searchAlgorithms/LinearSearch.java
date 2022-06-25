package searchAlgorithms;

class LinearSearch {
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40, 110, -110, 200, 330, 500,
                -500, -330, -200, -110, -40, -10, -4, -3, -2 };
        int x = -2;

        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Linear Search Result: Element is present at index "
                    + result);
    }
}