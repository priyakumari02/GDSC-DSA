package Week4;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            if(same(mat, target)){
                return true;
            }
            for(int i=1; i<=4; i++){
                int[][] matrix = rotatebetter(mat);
                if(same(matrix, target)){
                    return true;
                }
                mat = matrix;
            }
            return false;
        }
        
        public boolean same(int[][] arr, int[][] target ){
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    if(arr[i][j] != target[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
        
        public int[][] rotate(int[][]arr){
            int[][] mat = new int[arr.length][arr[0].length];
            
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    mat[i][j] = arr[i][j];
                }
            }
            for(int i=0; i<arr.length; i++){
                for(int j=i; j<arr.length;j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for(int i=0; i<mat.length; i++){
                int li = 0;
                int ri = mat[0].length-1;
                
                while(li<ri){
                    int temp = mat[i][ri];
                    mat[i][ri] = mat[i][li];
                    mat[i][li] = temp;
                    li++;
                    ri--;
                }
            }
            return mat;
        }
        public int[][] rotatebetter(int[][] arr){
            int[][] matrix = new int[arr.length][arr[0].length];
            int n = arr.length;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    matrix[j][n-i-1] = arr[i][j];
                }
            }
            return matrix;
        }
    }
}
