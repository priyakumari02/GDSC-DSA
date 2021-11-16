package Week4;

public class SearchInSorted2dii {
    public boolean searchMatrix(int[][] arr, int target) {
        if(arr[0][0] > target){
            return false;
        }
        
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m-1;
        if(arr[n-1][m-1] < target){
                return false;
        }
        
        while(i<n && j>=0){
            
            if(arr[i][j] == target ){
                return true;
            }
            if(arr[i][j] < target){
                i++;
            }else if(arr[i][j] > target){
                j--;
            }
        }
        return false;
    }
}
