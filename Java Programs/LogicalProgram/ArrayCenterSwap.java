package LogicalProgram;

import java.util.Arrays;

public class ArrayCenterSwap {

	public static void main(String[] args) {
		int arr[]= {50,10,30,20,70,40,60};
		Arrays.sort(arr);
		//10 20 30 40 50 60 70
		
		for(int i=1;i<arr.length;i=i+2)
		{
			int item=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=item;
	
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}

	}

}
