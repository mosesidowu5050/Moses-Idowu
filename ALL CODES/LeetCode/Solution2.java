class Solution2 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int temp = 0;
    int[] newArray = new int[nums1.length + nums2.length];

    for (int i = 0; i < newArray.length; i++){
        for (int j = 0; j < newArray.length-1; j++){
            if (newArray[j] > newArray[j+1]){
                temp = newArray[j];
                newArray[j] = newArray[j+1];
                newArray[j+1] = temp;
            }
        }
    }
    double total = 0;
    for (int i = 0; i < newArray.length; i++){
        total += newArray[i] / 2; 
    
    }
    return total;

}

public static void main(String[] args){
int[] nums1 = {1, 3};
int[] nums2 = {2};

double results = findMedianSortedArrays(nums1, nums2);
System.out.print(results);

    }
}