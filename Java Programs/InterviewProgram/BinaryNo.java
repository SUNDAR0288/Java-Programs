package InterviewProgram;

public class BinaryNo {

	public static void main(String[] args) {
		int num = 10;
		String bin = " ";
		while(num>0)
		{
			int t = num%2;
			bin = t + bin;
			num = num/2;
		}
		System.out.println(bin);

	}

}
