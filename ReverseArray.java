package first;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(reverse(array)));
    }

    private static int[] reverse(int[] array){

        int[] reverseArray = new int [array.length];

        for (int i = array.length-1; i >= 0; i--){
            for (int j = 0; j < reverseArray.length; j++){
                if (reverseArray[j] == 0){
                    reverseArray[j] = array[i];
                    break;
                }
            }
        }
        return reverseArray;
    }
}
