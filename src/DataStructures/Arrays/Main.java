package DataStructures.Arrays;

public class Main {

    private static int[] arr = {1, 2, 3, 4, 5};
    private static Traversals arrayTraversal = new Traversals(arr);

    //MAIN HERE________________________________________________________
    public static void main(String[] args){
        trySearch(5);
        tryMinAndMax();


    }
    //_______________________________________________________MAIN HERE

    private static void trySearch(int num){
        if(arrayTraversal.search(num)){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
    private static void tryMinAndMax(){
        System.out.println("Max: " + arrayTraversal.findMax());
        System.out.println("Min: " + arrayTraversal.findMin());
    }
}
