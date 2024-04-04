package InterviewProgram;

public class PrimeNO {

	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		while(start<end)
		{
			int num = start;
			int a = 2;
			while(a <= num/2)
			{
				if(num % a == 0)
				{
					break;
				}
			a++;
			}
			if(a > num/2)
			{
				System.out.println(num);
			
			}
		start++;
		}

	}

}
