#include<bits/stdc++.h>

using namespace std;

int main()

{

int t;cin>>t;

for(int k=0;k<t;k++)

{

long max=0,min=0,n,r;cin>>n>>r;long a[n];

for(int j=0;j<n;j++)cin>>a[j];

for(int j=0;j<n;j++)if(a[j]>max)max=a[j];

min=max;

for(int j=0;j<n;j++)if(a[j]<min)min=a[j];

int i;

for( i=0;i<n-1;i++)

{

if(a[i]<=max && a[i]>=min)

{

if(a[i]<=max && a[i]>r)max=a[i];

if(a[i]>=min && a[i]<r)min=a[i];

}

else {cout<<"NO"<<endl;break;}

}

if(i==n-1)cout<<"YES\n";

}

return 0;

}
