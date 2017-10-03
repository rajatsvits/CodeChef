package septemberLunchTime;

import java.util.Scanner;

public class CookOff {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int x =0;
			if(sc.hasNextInt())
				x= sc.nextInt();
			
			String a []=new String[x];
			for(int i=0;i<x;i++)
			{
				//if(sc.hasNextInt())
				a[i] = sc.next();
			}
			int c=0,q=0,y=0,z=0,w=0,r=0,f=0;
			for(int i=0;i<x;i++)
			{
				if(w==0&&a[i].equals("cakewalk"))
				{
					c++;
					w=1;
				}
				if(q==0&&a[i].equals("simple"))
				{
					c++;
					q=1;
				}
				if(y==0&&a[i].equals("easy"))
				{
					c++;
					y=1;
				}
				if(z==0&&(a[i].equals("easy-medium")||(a[i].equals("medium"))))
				{
					c++;
					z=1;
				}
				if(r==0&&(a[i].equals("hard")||a[i].equals("medium-hard")))
				{
					c++;
					r=1;
				}
				if(c==5&&w==1&&y==1&&z==1&&r==1&&q==1)
				{
					f=1;
					System.out.println("Yes");
					break;
				}
			}
			if(f==0)
				System.out.println("No");
			
			t--;
		}
	}
}
