class Solution {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // when left is not equal to right
        while (left < right) {
            // change all to lowercase to equal matching
            char rightChar = Character.toLowerCase(s.charAt(right));
            char leftChar =  Character.toLowerCase(s.charAt(left));
            // checks if char is not alphannumeric
            if (!Character.isLetterOrDigit(rightChar)){
                right--;

                // continues to top of while loop to check if next char is alphanumeric or not
                continue;
            }else if (!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
        

            if (leftChar == rightChar) {
                // adjust position to check the next chars
                left++;
                right--;

            } 
            else {
                // letters dont match = not a palindrome
                System.out.println(left);
                System.out.println(right);
                return false;

            }

        }

        // true when position is at the same or when left pasts right
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}