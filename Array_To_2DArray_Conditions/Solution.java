import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // eg: [1,3,4,1,2,3,1]
        // freq = [0,0,0,0,0,0,0,0]
        int[] freq = new int[nums.length + 1];
        List<List<Integer>> ans = new ArrayList<>();

        for (int c : nums) {
            // first iteration is 0 >= 0
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }
            // adds element into ans based on existing frequency position
            ans.get(freq[c]).add(c);

            // increment frequency count after adding into ans array list

            freq[c]++;
        }

        return ans;
    }
}
