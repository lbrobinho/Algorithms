public class Solution {

    public String stringCompression(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        if (s.length() == 1) {
            return s;
        }

        int count = 0;

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
             if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i)).append(count);
                count = 0;
             } else {
                 count++;
             }
        }

        String newS = sb.toString();

        return newS.length() >= s.length() ? s : newS;
    }
}