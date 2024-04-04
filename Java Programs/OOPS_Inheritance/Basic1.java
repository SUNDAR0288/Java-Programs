package OOPS_Inheritance;

class Teacher
{
	void teach()
	{
		System.out.println("Teach");
	}
}
class Department
{
	Teacher t = new Teacher();
}
class College
{
	Department dep = new Department();
}

public class Basic1 {

	public static void main(String[] args) {
		College col = new College();
		col.dep.t.teach();

	}

}
