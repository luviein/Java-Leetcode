
import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                int[] answer = {map.get(diff), i};
                return answer;
            }
            
            map.put(nums[i], i);
            
        }

        return new int[]{-1,-1};
    }
    

    public static void main(String[] args) {
        int[] question = {2,7,11,15};
        twoSum(question, 9);
    }
}