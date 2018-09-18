public class Solution {

    public boolean oneEditAway(String s1, String s2) {

        if (s1.length() == s2.length()) {return checkReplace(s1, s2);}

        if (s1.length() == s2.length() + 1) {return checkInsertionOrRemove(s2, s1);}

        if (s1.length() == s2.length() - 1) {return checkInsertionOrRemove(s1, s2);}

        return false;
    }

    private boolean checkReplace(String s1, String s2) {

        boolean foundDifferent = false;

        for (int i = 0; i < s1.length(); i++) {

            if(s1.charAt(i) != s2.charAt(i)) {

                if(foundDifferent) {
                    return false;
                } else {
                    foundDifferent = true;
                }
            }
        }

        return true;
    }

    private boolean checkInsertionOrRemove(String s1, String s2) { //s2 is longer string 

        int index1 = 0;
        int index2 = 0;

        while (index1 < s1.length() && index2 < s2.length()) {

            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }

        return true;
    }
}