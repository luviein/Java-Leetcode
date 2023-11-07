import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int firstIndex = m - 1;
        int secondINdex = n - 1;

        int combinedIndex = m + n - 1 ;
        while(firstIndex >= 0 && secondINdex >= 0) {
            if (nums1[firstIndex] > nums2[secondINdex] ) {

                nums1[combinedIndex] = nums1[firstIndex];
                firstIndex --;
            } 
            else {
         
                nums1[combinedIndex] = nums2[secondINdex];
                secondINdex --;
            }
            combinedIndex --;
        }

        while (secondINdex >= 0) {
            nums1[combinedIndex] = nums2[secondINdex];
            secondINdex --;
            combinedIndex --;

        }
        System.out.println(Arrays.toString(nums1));
        
        

    }

    public static void main(String[] args) {
        int[] num1 = {0};
        int m = 0;
        int[] num2 = {1};
        int n = 1;
        merge(num1, m, num2, n);
    }
}