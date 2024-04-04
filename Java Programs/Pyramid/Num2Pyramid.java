package Pyramid;

public class Num2Pyramid {

	public static void main(String[] args) {
		int n = 5;
		int spc = n-1;
		int str = 1;
		int a = 1;
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<spc;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k = 0;k<str;k++)
			{
				System.out.print(a +" ");
				a++;
			}
			System.out.println();
			spc--;
			str=str+2;
			a=1;
		}
		int m = 5;
		int spc1 = n - 5;
		int str1 = 9;
		int b = 1;
		for(int i = 0;i<m;i++)
		{
			for(int j = 0;j<spc1;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k = 0;k<str1;k++)
			{
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
			spc1++;
			str1 = str1-2;
			b = 1;
		}

	}

}
