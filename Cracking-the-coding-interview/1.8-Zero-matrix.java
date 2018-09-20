public class Solution {

	public void setZero(int[][] matrix) {

		boolean rowHasZero = false;
		boolean colHasZero = true;

		//check first row and clolumn has zero
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}

		//check rest of matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		//set zero to each row and column
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				setRowZero(matrix, i);
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if(matrix[0][i] == 0) {
				setColZero(matrix, i);
			}
		}

		

		//set first row zero
		if (rowHasZero) {
			setRowZero(matrix, 0);
		}

		//set first column
		if (colHasZero) {
			setColZero(matrix, 0);
		}
    }
    
    private void setColZero(int[][] matrix, int col) {
        for (int i =0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    private void setRowZero(int[][] matrix, int row) {
        
        for (int i =0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }
}