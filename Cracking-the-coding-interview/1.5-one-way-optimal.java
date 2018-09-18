public class Solution {

    public boolean oneEditAway(String first, String second) {

        //s2 is longer String 
        String s1 = first.length() <= second.length() ? first : second;
        String s2 = first.length() <= second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index1 < s1.length() && index2 < s2.length()) {

            if (s1.charAt(index1) != s2.charAt(index2)) {
                
                if (foundDifference) {
                    return false;
                }

                foundDifference = true;

                if (s1.length() == s2.length()) {
                    index1++; //On replace, move shorter pointer
                }

            } else {
                index1++; // if match, move shorter pointer
            }
            index2++;   //always move longer pointer
        }

        return true;
    }

}

/* Time complexity = O(n) n is length of shorter String 
    Space Complexity = O(1) no extra space used */