import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        for(int x: theSquaresOfEachNumber(arr)){
            System.out.println(x);
        }
    }

    public static int[] theSquaresOfEachNumber(int [] a){
        int[] arr = new int[a.length];
        for (int i=0;i<a.length;i++){
            arr[i] = a[i]*a[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
