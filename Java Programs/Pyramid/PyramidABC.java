package Pyramid;

public class PyramidABC {

	public static void main(String[] args) {
		
		int n=5;
		int str=1;
		int spc=n-1;
		for(int i=0;i<n;i++)
		{
			char ch=97;
			for(int j=0;j<spc;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=0;k<str;k++)
			{
				if(k<str/2)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(ch+" ");
					ch--;
				}
			}
			str=str+2;
			spc--;
			System.out.println();
		}

	}

}
