package Week4;

public class RotateImage {
    class Solution {
        public void rotate(int[][] matrix) {
            //First transpose it and then reverse the columns
            
            for(int i=0; i<matrix.length; i++){
                for(int j=i; j<matrix.length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            
            for(int i=0; i<matrix.length; i++){
                int li = 0;
                int ri = matrix[0].length-1;
                while(li<ri){
                    int temp = matrix[i][li];
                    matrix[i][li] = matrix[i][ri];
                    matrix[i][ri] = temp;
                    li++;
                    ri--;
                }
            }
        }
    }
}
