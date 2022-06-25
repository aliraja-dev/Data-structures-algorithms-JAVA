public class SumOfArrayRecursion {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5 };
        int sumofArray = sum(arr, arr.length);
        System.out.println("Sum of array is " + sumofArray);
    }

    private static int sum(int[] arr, int length) {
        // base case where array is length zero
        if (length <= 0)
            return 0;
        // recursive case
        else
            return sum(arr, length - 1) + arr[length - 1];
    }
}
