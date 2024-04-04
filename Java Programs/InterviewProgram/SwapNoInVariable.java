package InterviewProgram;

public class SwapNoInVariable {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);

	}

}
