class Solution {
    public int numberOfBeams(String[] bank) {
          int ans = 0, prev = 0, count = 0;
    for(String s: bank) {
        count = 0;
        for (int i = 0; i < s.length(); i++) 
            // eg: "011001" count = 3
            if (s.charAt(i) == '1') count++;
        if (count > 0) {
            // eg: "011001" count = 3, prev = 0 ans = 3 * 0 (no beams in previous row)
            ans += prev * count;
            prev = count;
        }
    }
    return ans;
    }
}