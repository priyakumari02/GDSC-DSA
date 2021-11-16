package Week4;
import java.util.*;

public class SearchInSorted2d {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int target = scn.nextInt();
        scn.close();
        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int[][] arr, int d) {
        // Also accepted approach
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(matrix[i][matrix[0].length-1] < target){
        //             continue;
        //         }else{
        //             if(matrix[i][j] == target){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        
        //More efficient one
        int n = arr.length;
        int p = 0;
        int q = arr[0].length-1;
        while (p < n && q >= 0) {
          if (arr[p][q] < d ) {
            p++;
          }
          else if (arr[p][q] > d ) {
            q--;
          }
          else {
            return true;
          }
        }
        return false;
    }
}
