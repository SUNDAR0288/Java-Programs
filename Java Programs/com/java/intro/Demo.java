package com.java.intro;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		int target = 5;
		int arr[] = {9,3,7,4,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+","+j);
					break;
				}
				
				
			}
		}

	}

}
