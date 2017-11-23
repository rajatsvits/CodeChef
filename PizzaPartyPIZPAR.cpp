#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int n,i;
    long m;
    cin>>n>>m;
    long a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    sort(a,a+n);
    long x=0;
    for(i=n-1;i>=0;i--)
    {
        //cout<<m<<" "<<a[i]<<" "<<x<<endl;
        if(m>a[i])
        {
            x+=(a[i]*a[i]+a[i]+2)/2;
            m-=a[i];
        }
        else if(m!=0)
        {
            x+=(m*m+m+2)/2;
            m=0;
            break;
        }


    }
    if(i!=-1)
        x+=i;
    cout<<x<<endl;


}
