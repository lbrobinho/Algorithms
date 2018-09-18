public class Solution {

    //count numbers of characters, if there is more than one, it can't be true

    public boolean isPermutationOfPalindrome(String s) {

        int countOdd = 0;

        int[] table = new int[26];

        char[] ch = s.toCharArray();

        for (char c : ch) {

            int x = getCharNumber(c);

            if(x != -1) {
                table[x]++;

                if(table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }

        return countOdd <= 1;
    }

    /* 1. we want to map characters into a array, so we can get the count. So we need to convert 
    character into number a - 1, b - 2, and case is insensitive */
    private int getCharNumber(Character c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);

        if(a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }
}