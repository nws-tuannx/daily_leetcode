public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};


        merge(nums1,3,nums2,3);

        for(int x : nums1){
            System.out.println(x);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int x: nums2){
            addArr(x,nums1,m); //Thêm từng phần tử của nums2 vào nums1, cần thêm vào m là số lượng phần tử nums1
            m++; // Cộng m lên 1 đơn vị
        }
    }

    public static void addArr(int x,int[] arr ,int m){
        boolean check = false;
        for(int k =0;k<m;k++){
            if(arr[k] > x){  // Nếu phần tử thứ a[k] >x --> Lùi 1 đơn vị từ phần tử thứ k đến phần tử thứ m-1
                check = true;
                for(int i=m-1 ; i>=k ;i--){ //->Lùi 1 đơn vị từ phần tử thứ k đến phần tử thứ m-1
                    arr[i+1]= arr[i];   //Lùi
                }
                arr[k]=x;
                break;
            }
        }
        if(check == false){
            arr[m]= x;
        }
    }
}
