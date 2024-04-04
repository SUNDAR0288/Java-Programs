package Arrays;

import java.util.Arrays;

public class ArraysSpiltTwoArrays {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		int a[] = new int[count];
		int b[] = new int[arr.length-count];
		
		int v=0;
		int v2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				a[v]=arr[i];
				v++;
			}
			else
			{
				b[v2]=arr[i];
				v2++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
