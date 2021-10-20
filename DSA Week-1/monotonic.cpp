class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        int inc=1;
        int dec=1;
        int arr[nums.size()];
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]>nums[i+1]){
                inc=0;
            }
            if(nums[i]<nums[i+1]){
                dec=0;
            }
        }
        
        return inc||dec;
    }
};