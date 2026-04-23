package org.demo3.task1;

import java.util.Stack;

public class MathLogic {

    private int getPrecedence(char ch){
        if (ch== '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;

        return -1;
    }

    public String infixToPostfix ( String infix){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++){
            char c = infix.charAt(i);
            if (c == ' ') continue;

            if (Character.isDigit(c)){
                result.append(c).append(' ');
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop()).append(" ");
                stack.pop();
            } else {
                while   (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek()))
                    result.append(stack.pop()).append(" ");
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) result.append(stack.pop()).append(" ");
        return result.toString().trim();
    }

    public double   evaluatePostfix (String postfix){
        Stack<Double> stack = new Stack<>();
        String [] tokens = postfix.split(" ");

        for (String token : tokens) {
            if ((token.isEmpty()))continue;
             if (Character.isDigit(token.charAt(0))){
                 stack.push(Double.parseDouble(token));
             } else {
                 double b = stack.pop();
                 double a = stack.pop();
                 switch (token.charAt(0)){
                     case '+' : stack.push(a+b); break;
                     case '-' : stack.push(a-b) ; break;
                     case '*' : stack.push(a*b) ; break;
                     case '/' : stack.push(a/b) ; break;
                 }
             }
        }
        return stack.pop();
    }




}

