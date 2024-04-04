package Pyramid;

public class NumPyramid {

	public static void main(String[] args) {
		int n = 4;
		int spc = n-1;
		int str = 1;
		int m = 1;
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=spc;j++)
			{
				System.out.print(" " + " ");
			}
			for(int k = 1;k<=str;k++)
			{
				if(k%2!=0)
				{
					System.out.print(m +" ");
					m++;
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println(" ");
			m = 1;
			spc--;
			str=str+2;
		}

	}

}
