import java.util.Arrays;

public class Solution {
    public static int findContentChildren(int[] g, int[] s) {
          
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;

        // checks if the count and i is within both array ranges
        for(int i = 0; count < g.length && i < s.length; i ++) {
          
            // if cookie size is more than or equal to child greed factor
            if(s[i] >= g[count]) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};

        System.out.println(findContentChildren(g,s));
    }
}

