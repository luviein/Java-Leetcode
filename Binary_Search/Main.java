class Solution {
    public static int search(int[] nums, int target) {
        // set the initial low and high of array, will change when range changes
        int low = 0;
        int high = nums.length - 1;

        // ensure there is valid range (eg: no negative range)
        while (low <= high) {
            // set the mid based on the current range
            int mid = (high + low) / 2;

            // when target matches element in array
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                // to focus search on the right half
                low = mid + 1;
                System.out.println("mid" + mid);

            } else {
                // focus search to the left
                high = mid - 1;

            }

        }

        // when target doesnt match any element in array
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 5 };
        int[] nums2 = { -1, 0, 3, 5, 9, 12 };
        int[] nums3 = { -1, 0, 3, 5, 9, 12 };
        // System.out.println(search(nums, 5));
        System.out.println(search(nums2, 0));
        // System.out.println(search(nums3, 13));
    }
}