
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           copied[i] = array[i];
        }
        return copied;
    }
    
    public static int[] reverseCopy(int[] array) {
        int counter = array.length - 1;
        int [] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[counter] = array[i];
            counter--;
        }
        return reversed;
    }
}
