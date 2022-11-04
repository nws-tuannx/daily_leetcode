public class RemoveElement {

    public static void main(String[] args) {
        int[] nums ={3,2,2,3};
        int val = 2;

        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n;i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
