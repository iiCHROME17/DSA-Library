package DataStructures.Arrays;

import java.util.Arrays;

public class Deletions {

    private int[] arr;

    public Deletions(int[] arr){
        this.arr = arr;
    }
    public HelperMethods h = new HelperMethods();

    /* The time complexity can vary depending on the position of the elements
    you're deleting.

    Deleting at the end of an array has a space complexity of O(1) Constant time.
    It is also O(1) Time complexity.

    Deleting at the beginning has a Time complexity O(n) linear time. Every element has to be shifted to the left.
    Space complexity is O(1) because no extra space is used.

    Deleting at a specific index has a Time complexity of O(n) linear time
    It requires shifting all elements after the deleted element. The Space complexity is O(1) since no extra space is used.
     */

    //END: ST-O(1) TC-O(1)
    public void endDelete(int size){
        if(size > 0){
            arr[size-1] = 0; // Set last element to 0
            size--;
        }
        h.print("Array after Deletion: " + Arrays.toString(arr));
    }

    //BEGINNING ST-O(n) TC-O(n)
    public void beginningDelete(int size){
        for(int i = 0; i < size - 1; i++){
            arr[i] = arr[i+1]; //Shift left
        }
        arr[size-1] = 0; //Set last element to 0
        size--;
        h.print("Array after Deletion: " + Arrays.toString(arr));
    }
    //SPECIFIC INDEX ST-O(n) TC-O(n)
    public void indexDelete(int index, int size){
        if(index < size){
            for(int i = index;i < size - 1; i++){
                arr[i] = arr[i+1]; // Shift all elements to 0
            }
            arr[size - 1 ] = 0; // set last element to 0
            size--;
        }
        h.print("Array after Deletion: " + Arrays.toString(arr));
    }



}
