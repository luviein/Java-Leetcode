import java.util.Arrays;



class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;

        }

        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);

        return Arrays.equals(firstString, secondString);

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        isAnagram(s,t);

    }
}