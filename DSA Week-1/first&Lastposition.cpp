//Binary Search

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans={-1,-1};
        int start=0;
        int last=nums.size()-1;
        
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                last=mid-1;
        }
        else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        start=0;
         last=nums.size()-1;
         //searching in right
        while(start<=last){
           int mid=start+(last-start)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                start=mid+1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
       
        return ans;
    }
    
};


//Brute Force

class Solution 
{
public:
    vector<int> searchRange(vector<int>& nums, int target) 
	{
	   int n=nums.size();
       vector<int> num;
       int first=-1,last=-1,cnt=0;
       for(int i=0;i<n;i++)
       {
          if(nums[i]==target)
             {
               cnt++;
               if(cnt==1)
                 {
                   first=i;
                   last=i;
                   }
              else if(cnt>0 && cnt!=1)
                     last=i;
               }
           }
         num.push_back(first);
         num.push_back(last);
  return num;
  }
};