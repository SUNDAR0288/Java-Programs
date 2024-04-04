package InterviewProgram;

import java.util.Scanner;

public class PrimeNo2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=in.nextInt();
		int i=2;
		for(;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
