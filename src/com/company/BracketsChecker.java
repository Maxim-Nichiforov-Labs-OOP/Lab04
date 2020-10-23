package com.company;

public class BracketsChecker {
    static String CheckBrackets(String str) {
        Stack brackets = Stack.empty();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                brackets.push('(');
            } else if (str.charAt(i) == ')') {
                if (brackets.isempty()) {
                    return "Bad brackets placement.";
                } else {
                    brackets.pop();
                }
            }
        }

        if (brackets.isempty())
            return "Everything is fine";
        else
            return "You didn't close some brackets";
    }
}
