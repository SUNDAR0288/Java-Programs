package LogicalProgram;

public class ArrayGap {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int gap=3;
		int op=3;
		if(gap<arr.length)
		{
			if(op<arr.length)
			{
				for(int i=0;i<op;i++)
				{
					int total=0;
					for(int j=i;j<arr.length;j=j+gap)
					{
						total=total+arr[j];
					}
					System.out.println(total);
				}
			}
			else
			{
				System.out.println("enter op correct");
			}
		}
		else
		{
			System.out.println("enter gap values correct");
		}

	}

}
