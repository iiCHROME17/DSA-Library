package DataStructures.Arrays;

import java.util.Arrays;

public class Main {

    private static int[] arr = {1, 2, 3, 4, 5,6};
    private static int[] arr_to_sort = {10,5,8,11,6,3,17};
    private static HelperMethods h = new HelperMethods();
    private static Traversals arrayTraversal = new Traversals(arr);
    private static Insertions arrayInsertion = new Insertions(arr);
    private static Deletions arrayDeletion = new Deletions(arr);
    private static Searches arraySearch = new Searches(arr);
    private static Sorting arraySort = new Sorting(arr);
    //MAIN HERE________________________________________________________
    public static void main(String[] args){
        h.print("Array before operations: " + Arrays.toString(arr_to_sort));
        /* TRAVERSAL
        trySearch(5);
        tryMinAndMax();
        trySum();
         */

        /* INSERTIONS
        h.print("Array before Insertion: " + java.util.Arrays.toString(arr));
        tryDynamicInsert(10,5,2);
        //tryInsertAtIndex(12,4);
        //tryInsertAtBeginning(12);
        //tryInsertAtEnd(12);
         */

        /*
        tryDeleteAtEnd();
        tryDeleteAtBeginning();
        tryDeleteAtIndex(3);
        */

        /*
        //int result =  tryLinearSearch(6);
        int result = tryBinarySearchRecursive(6);
        if(result != -1){
            h.print("Element found at index: "+ result);
        } else {
            h.print("Element missing from array.");
        }
         */

        tryBubbleSort();
        h.print("Sorted Array:" + Arrays.toString(arr_to_sort));





    }
    //_______________________________________________________MAIN HERE

    //TRAVERSALS_____________________________________________________
    private static void trySearch(int num){
        if(arrayTraversal.search(num)){
            h.print("The Element " + num + " was found.");
        }else{
            h.print("The Element " + num + " was not found.");
        }
    }
    private static void tryMinAndMax(){
        h.print("Max: " + arrayTraversal.findMax());
        h.print("Min: " + arrayTraversal.findMin());
    }
    private static void trySum(){
        h.print("Sum: " + arrayTraversal.calculateSum());
    }
    //____________________________________________________TRAVERSALS

    //INSERTIONS_____________________________________________________
    private static void tryInsertAtEnd(int num){
        arrayInsertion.endInsert(num, arr.length-1);
    }
    private static void tryInsertAtBeginning(int num){
        arrayInsertion.beginningInsert(num, arr.length-1);
    }
    private static void tryInsertAtIndex(int num, int index){
        arrayInsertion.indexInsert(num, index, arr.length-1);
    }
    private static void tryDynamicInsert(int e, int b, int m){
        arrayInsertion.dynamicInsert(e,b,m);
    }
    //____________________________________________________INSERTIONS
    //DELETIONS_____________________________________________________
    private static void tryDeleteAtEnd(){
        arrayDeletion.endDelete(arr.length);
    }
    private static void tryDeleteAtBeginning(){
        arrayDeletion.beginningDelete(arr.length);
    }
    private static void tryDeleteAtIndex(int index){
        arrayDeletion.indexDelete(index,arr.length);
    }

    //____________________________________________________DELETIONS
    //SEARCHES_____________________________________________________
    private static int tryLinearSearch(int targ){
        return arraySearch.linearSearch(targ);
    }
    private static int tryBinarySearchIterative(int targ){
        return arraySearch.binarySearchIterative(targ);
    }
    private static int tryBinarySearchRecursive(int targ){
        return arraySearch.binarySearchRecursive(0,arr.length - 1,targ);
    }
    //____________________________________________________SEARCHES
    //SORTING_____________________________________________________
    private static void tryBubbleSort(){
        arraySort.bubbleSort(arr_to_sort);
    }
}
