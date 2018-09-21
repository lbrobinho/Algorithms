
public class Solution {

	public boolean isPermutation(String s1, String s2) {

		//corner case 
		if (s1.length() != s2.length()) {
			return false;
		}

        //create array to store character
        int[] letter = new int[128];

        //count how many char in s1
        for (int i =0; i < s1.length(); i++) {
            int index = s1.charAt(i);

            letter[index]++;
        }

        //count how many char in s2
        for (int i =0; i < s2.length(); i++) {
            int index = s2.charAt(i);

            letter[index]--;

            if (letter[index] < 0) {
                return false;
            }
        }

        return true;
	}
}