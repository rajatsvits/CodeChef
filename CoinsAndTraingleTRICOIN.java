package practice;

import java.util.Scanner;

public class CoinsAndTraingle {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		//String s=Integer.toString(t);
		
		while(t>0)
		{
			long p= sc.nextLong();
			long x=0,i=1;
			while(p>0&&p-i>=0)
			{
				x++;
				p-=i;
				i++;
			}
			System.out.println(x);
			t--;
		}
	}
}
