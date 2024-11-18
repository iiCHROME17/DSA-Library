package DataStructures.Arrays;

public class Main {

    private static int[] arr = {1, 2, 3, 4, 5,0};
    private static HelperMethods h = new HelperMethods();
    private static Traversals arrayTraversal = new Traversals(arr);
    private static Insertions arrayInsertion = new Insertions(arr);

    //MAIN HERE________________________________________________________
    public static void main(String[] args){
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

    //____________________________________________________DELETIONS
}
