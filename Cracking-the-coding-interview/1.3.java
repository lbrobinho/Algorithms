public class Solution {

    private String urilify(String input, int trueLength) {

        char[] arr = input.toCharArray();

        //calculate how many extra spaces do we need 
        int space = 0;

        for (int i = 0; i < trueLength; i++) {
            if(arr[i] == ' ') {
                space++;
            }
        }

        //so the length of output string should be 
        int index = trueLength + 2 * space;

        if (trueLength < str.length) str[trueLength] = '\0';
        
        //start to move char
        for (int i = trueLength - 1; i >= 0; i--) {
            if(arr[i] = ' ') {
                arr[index - 1] = '%';
                arr[index - 2] = '0';
                arr[index - 3] = '2';

                index = index - 3;
            } else {

                arr[index - 1] = arr[i];
                index--;
            }
        }

        return new String(arr);
    }
} 