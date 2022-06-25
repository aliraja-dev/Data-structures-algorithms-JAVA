# Sorting Algorithms in Java

Selection Sort
Merge Sort
Quick Sort

## Built In Sort Method for Primitives - JAVA

Read Built in Arrays.sort(array) from Arrays class in java.util package
It uses double pivot concurrency and quicksort under the hood.

### Arrays.class

### DualPivotQuicksort.class

### In place Algorithms - Space Complexity

An in-place algorithm is an algorithm that does not need an extra space and produces an output in the same memory that contains the data by transforming the input ‘in-place’. However, a small constant extra space used for variables is allowed.

https://www.geeksforgeeks.org/in-place-algorithm/

Which Sorting Algorithms are In-Place and which are not?
In Place: Bubble sort, Selection Sort, Insertion Sort, Heapsort.
Not In-Place: Merge Sort. Note that merge sort requires O(n) extra space.
What about QuickSort? Why is it called In-Place?
QuickSort uses extra space for recursive function calls. It is called in-place according to broad definition as extra space required is not used to manipulate input, but only for recursive calls.
