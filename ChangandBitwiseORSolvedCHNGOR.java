


import java.util.Scanner;
public class BitwiseOr {
	private static Scanner sc;



	public static void main(String[] args) {
		BitwiseOr obj = new BitwiseOr();
		int t;
		sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0)//You can control speed with an arrow!
			/*int x = 100;

while( 0 <-------------------- x )
{
   printf("%d ", x);
}
90 80 70 60 50 40 30 20 10
126
*/
		{   
		  long n,i,sum=0;
		    n = sc.nextInt();
		     int a[] = new int[(int) n];
		    for(i=0;i<n;i++)
		    	a[(int) i]=sc.nextInt();
		    for(i=0;i<n;i++)
		    {
		        sum=obj.func(sum,a[(int) i]);
		    }
		    System.out.println(sum);
		}
		
	}

	
	
	long func(long  z,long  m)
	{
		long c;
		c=z|m;
		return c;
	}
}
