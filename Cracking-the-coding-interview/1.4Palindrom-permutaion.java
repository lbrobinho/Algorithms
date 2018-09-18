public class Solution {

    //count numbers of characters, if there is more than one, it can't be true

    public boolean isPermutationOfPalindrome(String s) {

        int[] table = frequencyTable(s);

        return checkMaxOneOdd(table);
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

    /* 2. Mapping char and get how many times each char appears */
    private int[] frequencyTable(String s) {

        char[] ch = s.toCharArray();

        int[] table = new int[26];
        for (char c : ch) {

            int x = getCharNumber(c);

            if (x != -1) {
                table[x]++;
            }
        }

        return table;
    }

    /* 3. check that no more than one character is odd */
    private boolean checkMaxOneOdd(int[] table) {

        boolean foundOdd = false;

        for (int count : table) {

            if (count % 2 == 1) {
                if(foundOdd) {
                    return false;
                } 

                foundOdd = true;
            }
        }

        return true;
    }
}