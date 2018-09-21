public class Solution {

	public boolean isUnique(String s) {

		//corner case 
		if (s == null || s.length() == 0) {
			return true;
		}

		if (s.length() > 128) {
			return false;
		}

		//create array to store character
		int[] letter = new int[128];

		//iterate string and store aomunts to array, once array[index] > 1, return false 
		for (int i = 0; i < s.length(); i++) {

				int index = s.charAt(i);

				letter[index]++;

				if (letter[index] > 1) {
					return false;
				}
			
		}

		return true;
	}
}