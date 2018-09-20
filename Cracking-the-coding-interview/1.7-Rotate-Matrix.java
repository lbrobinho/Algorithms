public class Solution {

    public void rotateMatrix(int[][] matrix) {

        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {

            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;

                //save top
                int top = matrix[first][i];

                //Move left to top
                matrix[first][i] = matrix[last - offset][first];

                //Move bottom to left
                matrix[last - offset][first] = matrix[last][last - offset];

                //move right to bottom
                matrix[last][last - offset] = matrix[i][last];

                //move top to right
                matrix[i][last] = top;
            }
        }
    }
}