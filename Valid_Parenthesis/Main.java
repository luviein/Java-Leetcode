import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++) {
            // opening brackets
            if(s.charAt(i) == '{' || s.charAt(i)  == '(' || s.charAt(i) == '[') {
                stack.add(s.charAt(i));
                continue;
            }
            // closing brackets
            //// stack is empty
            if (stack.isEmpty()) {
                return false;
            }

            //// stack not empty
            if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
                continue;
            } else if (s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
                continue;
            } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
                continue;
            } 
            // when closing bracket dont match opening
            return false;
        }

        if(stack.isEmpty()) {
            return true;
        }
        // when opening bracket is added at the end of the loop
        return false;

        
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}]"));
    }
}