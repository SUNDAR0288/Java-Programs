package InterviewProgram;

public class ArraysReverse {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int i=0, j=arr.length-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i=i+1;
			j=j-1;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}

	}

}
