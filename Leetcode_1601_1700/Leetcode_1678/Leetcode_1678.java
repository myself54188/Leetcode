package Leetcode_1601_1700.Leetcode_1678;

class Solution {
    public String interpret(String command) {
        String a = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                a += "G";
            }
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                a += "o";
                i++;
            }
            if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') {
                a += "al";
                i += 3;
            }
        }
        return a;
    }
}