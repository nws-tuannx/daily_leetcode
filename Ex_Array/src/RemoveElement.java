public class RemoveElement {

    public static void main(String[] args) {
        int[] nums ={3,2,2,3};
        int val = 2;

        System.out.println(removeElement(nums,val));
    }
    // Dùng 2 con trỏ
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0; // Gọi k là 1 con trỏ -> Và a[k] luôn là phần tử đúng cuối cùng
        for(int i=0; i<n;i++){ // i ở đây được coi như 1 con trỏ
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;// vì a[k] là phần tử đúng cuối cùng nên k chính là số phần tử của mảng sau khi xóa  các giá trị =val
    }
}
