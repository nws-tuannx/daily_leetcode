import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,5,7,15};
        int target = 9;

       Arrays.stream(twoSum(a, target)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] a, int target) {
        int[] arr = new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]+a[j]) == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new RuntimeException();
    }
}
