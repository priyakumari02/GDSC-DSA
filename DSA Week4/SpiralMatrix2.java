package Week4;

public class SpiralMatrixii {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] arr = new int[n][n];
            
            int count = 1;
            int minr = 0;
            int maxr = n-1;
            int minc = 0;
            int maxc = n-1;
            while(count <= n*n ){
                for(int i=minc; i<=maxc && count <= n*n; i++){
                    arr[minr][i] = count++;
                 
                }
                minr++;
                for(int j=minr; j<=maxr && count <= n*n; j++){
                    arr[j][maxc] = count++;
                    
                }
                maxc--;
                for(int i = maxc; i>=minc && count <= n*n; i--){
                    arr[maxr][i] = count++;
                
                }
                maxr--;
                for(int j=maxr; j>=minr && count <= n*n; j--){
                    arr[j][minc] = count++;
                    
                }
                minc++;
            }
            
            return arr;
        }
    }
}
