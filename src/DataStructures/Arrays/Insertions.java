package DataStructures.Arrays;
import java.util.Arrays;
import java.util.ArrayList;
public class Insertions {

    //Constructor
    private int[] arr ;
    private ArrayList<Integer> dynamicArr = new ArrayList<Integer>();
    private int size;
    public Insertions(int[] arr){this.arr = arr;}
    public HelperMethods helper = new HelperMethods();

    /* Insertions are operations in arrays that involve adding an element to the array.
    Time Complexity depends on where the new element is inserted.

    INSERTING AT THE END:O(1) Constant time. Both Space / Time Complexity, it is the best Complexity
     */
    public void endInsert(int elementToInsert, int size){
        arr[size] = elementToInsert;
        size++;
        helper.print("Array after Insertion: " + Arrays.toString(arr));


    }

    //INSERTING AT THE BEGINNING: O(n) Linear time. Every element has to be shifted to the right.
    // Time Complexity is directly proportional to the number of elements in the array.
    // Space Complexity is O(1) because no extra space is used.
    public void beginningInsert(int elementToInsert, int size) {
        for (int i = size; i > 0; i--) { //For loop going from the last element to the first
            arr[i] = arr[i-1];
        }
        arr[0] = elementToInsert;
        size ++;

        helper.print("Array after Insertion: " + Arrays.toString(arr));
    }

    //INSERTING AT A SPECIFIC INDEX: O(n) Linear time. Every element from the target to be shifted to the right.
    //TIME COMPLEXITY: O(n) Linear time means it grows proportionally with the number of elements in the array.
    //SPACE COMPLEXITY: O(1) because no extra space is used.
    public void indexInsert(int elementToInsert,int index,int size){
        for(int i = size; i> index;i--){//For loop going from the last element to the target index
            arr[i] = arr[i-1];
        }
        arr[index] = elementToInsert;
        size++;
        helper.print("Array after Insertion: " + Arrays.toString(arr));
    }

    /*Java allows the use of Dynamic arrays with ArrayLists.
    Adding to the end of an ArrayList is O(1) Constant time. Best Time Complexity.
    Adding to beginning or specified index is O(n) Linear time. Portional to the number of elements.
     */
    public void dynamicInsert(int endElement, int beginningElement, int middleElement){
        dynamicArr.add(endElement); //Adding to the end
        dynamicArr.add(0,beginningElement); //Adding to the beginning
        dynamicArr.add((dynamicArr.size() / 2),middleElement); //Adding to a specific index (middle)

        helper.print("Array after Insertion: " + dynamicArr.toString());
    }

}
