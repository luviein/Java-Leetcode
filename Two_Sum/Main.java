
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

    // for i = 0 ,new entry will be 1 , 0 where the value is the placeholder
    // for i = 1, new entry will be 2 , 1. (5 is not equal to existing 1)
    // for i = 2 , new entry will be 4, 2. (3 is not equals to existing 2)
    // for i = 3, if loop will become true cos diff 2 is equals to existing entry of 2,1
    // so i will put in the value of 3 (index) into the 2,1 map
}