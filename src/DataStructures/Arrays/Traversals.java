package DataStructures.Arrays;

public class Traversals {

    /* WHAT IS AN ARRAY?
    It's a data structure used to store multiple elements of the same type.

    ARRAY TRAVERSALS
    These involve visiting each element of the array to perform cetain operations:
    1. Print all elements
    2. Searching for an element
    3. Updating an element

    The Time Complexity of Array Traversals is O(n) where n is the number of elements in the array.
    The Time complexity is linear and grows porportionally with the size of the array.
    The Space Complexity is O(1) because no extra space is used.
    The space occupied does not increase with the array size.

     */

    //Constructor
    private int[] arr;
    public Traversals(int[] arr){
        this.arr = arr;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void enhancedPrint() {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //Here are some Operations that can be performed on an array
    //1. Finding MAX or MIN
    public int findMax() {
        int max = arr[0]; // Initialize max with the first element
        for (int i : arr) {
            if (i > max) {
                max = i; // Update max if a larger value is found
            }
        }
        return max;
    }

    public int findMin() {
        int min = arr[0]; // Initialize min with the first element
        for (int i : arr) {
            if (i < min) {
                min = i; // Update min if a smaller value is found
            }
        }
        return min;
    }

    //2. Finding the sum of all elements
    public int calculateSum() {
        int sum = 0; // Initialize sum to 0
        for (int i : arr) {
            sum += i; // Add each element to sum
        }
        return sum;
    }

    //3. Search for an Element
    public boolean search(int target){
        for(int i:arr){
            if (i == target){
                return true;
            }
        }
        return false;
    }

}
