public class Q1 {
    public void rotate(int[][] matrix) {
        int half = matrix.length / 2;
        int full = matrix.length;
        //swap
        for (int i = 0; i < full; i++){
            //rows
            for (int j = i; j < full; j++){
                //columns
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        //reverse
        for (int i = 0; i < full; i++){
            for (int j = 0; j < half; j ++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][full - 1 - j];
                matrix[i][full - 1 - j] = tmp;
            }
        }

        
    }
    
}
