package InterviewProgram;

public class PerfectNo {

	public static void main(String[] args) {
		int num = 28;
		int a = 1;
		int sum = 0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);

	}

}
