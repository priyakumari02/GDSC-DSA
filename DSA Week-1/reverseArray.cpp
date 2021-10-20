using namespace std;

int main() {
	int t,n;
	cin>>t;
	while(t--)
	{
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;++i)
	    {
	        cin>>arr[i];
	    }
	   // for(int i=n-1;i>=0;--i)
	   // {
	   //     cout<<arr[i]<<" ";
	   // }
	   for(int i=0;i<n/2;i++){
	       int temp=arr[n-i-1];
	       arr[n-i-1]=arr[i];
	       arr[i]=temp;
	   }
	   for(int i=0;i<n;i++)
	        cout<<arr[i]<<" ";
	    cout<<endl;
	}
	return 0;
}