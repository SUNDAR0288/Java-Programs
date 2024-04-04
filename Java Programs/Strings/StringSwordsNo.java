package Strings;

import java.util.Arrays;

public class StringSwordsNo {

	public static void main(String[] args) {
		String str = "i love you di";
		String []arr = str.split(" ");
		int []arr1 = new int[arr.length];
		
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i] = arr[i].length();
		}
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1) );
		
		for(int i = 0;i<arr1.length;i++)
		{
			for(int j = 0;j<arr.length;j++)
			{
				if(arr1[i]==arr[j].length())
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
