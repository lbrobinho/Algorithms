public class Solution {

    private String urilify(String s, int trueLength) {

        char[] ch = s.toCharArray();

        int count = 0;

       //count how many extra space we need
       for (char c : ch) {
           if (c == ' ') {
               count++;
           }
       }

       //put character from backward
       int j = trueLength - 1;

       for (int i = count + trueLength - 1; i--; i >= 0) {

       }
    }
} 