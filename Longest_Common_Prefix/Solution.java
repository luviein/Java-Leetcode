public class Solution{

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "fl";
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                System.out.println("prefix length: " + prefix.length());
                prefix = prefix.substring(0, prefix.length() -1);
                System.out.println(prefix);
                if(prefix.equals("")){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String prefix = "fl";
        String[] strs = {"dog", "racecar", "car"};
        String[] strs2 = {"flower","flow","flight"};
        System.out.println(strs2[2].indexOf(prefix));
        //longestCommonPrefix(strs2);
        //System.out.println(prefix);
        //System.out.println(strs[1].indexOf(prefix));
    }
}