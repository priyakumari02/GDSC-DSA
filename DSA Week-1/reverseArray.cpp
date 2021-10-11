#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cout<<"Enter the size of array -" ;
    cin>>n;
     cout<<"Enter the value of d -" ;
    cin>>d;
    int arr[n];
    rotateArr(arr,d,n);
    reverseArr(arr,d,n);
    return 0;
}