public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};


        merge(nums1,3,nums2,3);
        int [] arr = addArr2Point(nums1,3,nums2,3);
        for(int x : arr){
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

    // Sử dụng 2 con trỏ để merge 2 mảng vs nhau mà đúng thứ tự sắp xếp
    public static int[] addArr2Point(int[] nums1, int m, int[] nums2, int n){
        // Tạo i,j chạy từ cuối 2 mảng nums1 và nums2
        int i = m-1;
        int j = n-1;
        int k = (m+n) -1; // Gán k vào phần tử cuối cùng của mảng merge
//        int[] nums1 = {1,2,3};
//        int[] nums2 = {2,5,6};
        while (k>=0){ // Nếu k <0 dừng lặp
            if(i<0){
                nums1[k] = nums2[j];
            } else if (j<0) {
                nums1[k] = nums1[i];
            }else if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else if(nums1[i]<nums2[j]){
                nums1[k]= nums2[j];
                j--;
            }
            k--;
        }
        return nums1;
    }
}
