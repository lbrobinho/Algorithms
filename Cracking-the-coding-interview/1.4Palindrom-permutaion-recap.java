public class Solution {

    public boolean isPermutaion(String s) {

        int countOdd = 0;
        int[] letter = new int[26];

        for (int i = 0; i < s.length(); i++) {

            if (getNumericNumber(s.charAt(i)) != -1) {
                int index = getNumericNumber(s.charAt(i));

                letter[index]++;

                if (letter[index] % 2 != 0) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }

        return countOdd <= 1;
    }

    private int getNumericNumber(char c) {
        int x = Character.getNumericValue(c);

        if (Character.getNumericValue('a') <= x && x <= Character.getNumericValue('z')) {
            return x - Character.getNumericValue('a');
        }

        return -1;
    }
}