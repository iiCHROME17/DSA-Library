package DataStructures.Arrays;

public class Sorting {

    private static int[] arr;

    public Sorting(int[] arr){
        this.arr = arr;
    }

    /* Bubble Sort:
        Repeatedly swaps adjacent elements if they are in the wrong order.
            Time Complexity:
                >Best Case: O(n) When array is sorted, with an optimisation flag.
                >Worst Case: O(n^2) When array is in reverse order
                >Average Case: O(n^2)
            Space Complexity:
                >O(1) in splace sorting.

        Simple but inefficient for large datasets.
     */

    public void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Stop if already sorted
        }
    }
}
