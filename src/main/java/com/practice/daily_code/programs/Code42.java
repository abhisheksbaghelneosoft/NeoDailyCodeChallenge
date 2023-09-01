package com.practice.daily_code.programs;

import java.util.Stack;


public class Code42 {
    public static void main(String[] args) {
        String str = "[][]]";
        Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                    stack.push(str.charAt(i));
                else {
                    switch (str.charAt(i)) {
                        case ')' -> {
                            if (!stack.isEmpty() && stack.peek() == '(')
                                stack.pop();
                            else
                                stack.push(')');
                        }
                        case '}' -> {
                            if (!stack.isEmpty() && stack.peek() == '{')
                                stack.pop();
                            else
                                stack.push('}');
                        }
                        case ']' -> {
                            if (!stack.isEmpty() && stack.peek() == '[')
                                stack.pop();
                            else
                                stack.push(']');
                        }
                        default -> {
                            stack.isEmpty();
                        }
                    }
                }
            }
            System.out.println(stack);
            if (stack.isEmpty())
                System.out.println("balanced");
            else
                System.out.println("not balanced");
    }
}
