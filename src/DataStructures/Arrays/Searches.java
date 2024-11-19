package DataStructures.Arrays;

public class Searches {

    private static int arr[];

    public Searches(int[] arr){
        this.arr = arr;
    }

    /* Linear Search:
        Traverse the array element by element to find the target value:
        Time Complexity:
            >Best Case: O(1) if element is first
            >Worst Case: O(n) if element is at the end / missing
            >Average Case: O(n)
        Space Complexity: O(1)

        Use on Small,Unsorted arrays
     */

    public  int linearSearch(int targ){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == targ) return arr[i];
        }
        return  -1;
    }

    /* Binary Search:
    Works only on sorted arrays. Repeatedly divides the array into two halves to find target value (Divide and Conquer)
        Time Complexity:
            >Best Case: O(1) if the element is at midpoint
            >Worst Case: O(log n) Dividies the array size by 2 at each step
            >Average Case: O(log n)
        Space Complexity:
            >Iterative: O(1)
            >Recursive: O(log n)

        Use on sorted arrays to reduce search time. Iterative is more space-efficient
     */
    public  int binarySearchIterative(int targ){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            //Return the index if the target is found
            if(arr[mid] == targ){
                return mid;
            } else if (arr[mid]<targ){
                //Move left boundary if midpoint is smaller than target
                left = mid + 1;
            } else {
                //Move the right boundary
                right = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int left,int right, int targ){
        if(left<=right){
            int mid = left + (right - left) / 2; //Prevent overflow

            if(arr[mid] == targ){
                return mid; //Return index if target is found
            } else if (arr[mid] < targ) {
                //Recur on the right
                return binarySearchRecursive(mid+1,right,targ);
            } else {
                return  binarySearchRecursive(left, mid - 1, targ);
            }
        }
        return -1;
    }
}
