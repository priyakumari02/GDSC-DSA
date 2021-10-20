// { Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template in C++

class Solution
{
public:
    // Function to return the position of the first repeating element.
    int firstRepeated(int arr[], int n)
    {
        int max = n;
        int k = 0;

        // find the max to get two array of index max
        for (int i = 0; i < n;)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            ++i;
        }
        // initialize two arrays with zero
        int a[max + 1] = {};
        int b[max + 1] = {};

        // assign values to a and b
        for (int i = 0; i <n;)
        {
            if (a[arr[i]])
            {
                b[arr[i]] = 1;
                k = 1;
            }
            else
            {
                a[arr[i]] = i + 1;
            }
             ++i;
        }

        // if(k==0){

        //  return -1;
        // }
        // else{
        if (k == 1)
        {

            int min = max + 1;
            for (int i = 0; i < max + 1; i++)
            {
                if (a[i] && b[i] && min > a[i])
                {
                    min = a[i];
                }
            }
            return min;
        }
        return -1;
    }
// }
}
;
int main()
{
    // int arr[] = { 7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1 };
    // int arr[]={5,4,3,3};
    int arr[]={1 ,5 ,3 ,4 ,3 ,5 ,6};
    // int arr[] = {1, 2, 3, 4};
    int n = sizeof(arr) / sizeof(arr[0]);
    Solution *v = new Solution();
    int x = v->firstRepeated(arr, n);
    cout << x;
    return 0;
}
