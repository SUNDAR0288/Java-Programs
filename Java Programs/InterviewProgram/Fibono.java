package InterviewProgram;

public class Fibono {

	public static void main(String[] args) {
		int number=10;
		int fib1=0;
		int fib2=1;
		int fib3=fib1+fib2;
		while(number>0) {
			System.out.println(fib1);
			fib1=fib2;
			fib2=fib3;
			fib3=fib1+fib2;
			number--;

	}

}
}
