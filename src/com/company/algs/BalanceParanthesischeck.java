package com.company.algs;

import java.util.Stack;

public class BalanceParanthesischeck {
    public static void main(String... args) {
        String str = "{{}}";
                char[] ch = str.toCharArray();

        System.out.println(isBalanced(ch));
    }
    private static boolean isBalanced(char[] ch) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c : ch){
            if(c == '{' || c == '['|| c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty())
                    return false;
                char cp = stack.pop();
                if (cp == '{' && c != '}')
                    return false;
                else if (cp == '[' && c != ']')
                    return false;
                else if (cp == '(' && c != ')')
                    return false;
            }

        }
        return true;
    }
}
