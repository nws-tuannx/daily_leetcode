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
    //Dùng 2 con trỏ
    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = copy[left] + copy[right];

            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == copy[left]) {
                res[0] = i;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == copy[right]) {
                res[1] = i;
            }
        }

        return res;
    }
}
