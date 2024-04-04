package Arrays;

public class TwoArraySwapToThridArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int c[] = new int[a.length+b.length];
		
		for(int i = 0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		
		for(int j = 0;j<b.length;j++)
		{
			c[a.length+j] = b[j];
		}
		
		for(int i = 0;i<c.length;i++)
		{
			for(int j = i;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int item = c[i];
					c[i] = c[j];
					c[j] = item;
				}
			}
			System.out.print(c[i]);
		}

	}

}
