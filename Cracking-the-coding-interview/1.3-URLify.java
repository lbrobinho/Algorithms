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
       int j = trueLength + count * 2 - 1;

       for (int i =  trueLength - 1; i >= 0; i--) {

            if (ch[i] == ' ') {
                ch[j] = '%';
                ch[j - 1] = "0";
                ch[j - 2] = "2";
                j = j - 3;
            } else {
                ch[j--] = ch[i];
            }
       }

       return new String(ch);
    }
} 