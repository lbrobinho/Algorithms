public class Solution {

    public boolean ifRotation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return fasle;
        }
        
        String s = s1 + s1;

        return isSubString(s, s2);
    }
}