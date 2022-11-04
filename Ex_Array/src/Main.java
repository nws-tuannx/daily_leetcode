public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count =0;

        for(int i = 0 ;i< nums.length;i++){
            int check = demsophantu(nums[i]);
            if(check % 2 == 0) {
                count ++;
            }
        }
        return count;

    }
    public static int demsophantu(int x){
        int count = 0;
        int result = x;
        while (result !=0){
            result = result/10;
            count ++;
        }

        return count;
    }
}