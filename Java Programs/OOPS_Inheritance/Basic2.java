package OOPS_Inheritance;

class GrantFather{
	void property() {
		System.out.println("House & Grove");
	}
}
class Father extends GrantFather{
	void Bike() {
		System.out.println("Bike");
	}
	void Car() {
		System.out.println("Car");
	}
}
class Mom extends Father{
	void Gold() {
		System.out.println("Gold");
	}
	void Cooking() {
		System.out.println("Cooking");
	}
}
class Son extends Mom{
	void Education() {
		System.out.println("Knowleadge");
	}
}

public class Basic2 {

	public static void main(String[] args) {
		Son s1 = new Son();
		s1.property();
		s1.Bike();
		s1.Bike();
		s1.Cooking();
		s1.Gold();
		s1.Education();
	}

}
