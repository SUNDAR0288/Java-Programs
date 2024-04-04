package InterviewProgram;

public class PerfectNo2 {

	public static void main(String[] args) {
		int num = 28;
		int sum = 0;
		int a = 1;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum = sum + a;
			}
			a++;
				
		}
		if(sum == num)
			System.out.println("Perfect");
		else
			System.out.println("not perfect");


	}

}
