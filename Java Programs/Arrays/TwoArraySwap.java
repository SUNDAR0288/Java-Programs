package Arrays;

import java.util.Arrays;

public class TwoArraySwap {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		if(a.length==b.length)
		{
			for(int i = 0;i<a.length;i++)
			{
				a[i]=a[i]+b[i];
				b[i]=a[i]-b[i];
				a[i]=a[i]-b[i];
			}
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
		}
	}

}
