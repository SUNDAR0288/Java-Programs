package LogicalProgram;

public class Anagram {

	public static void main(String[] args) {
		String s1 ="cat";
		String s2 ="act";
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						s2=s2.replaceFirst(""+s1.charAt(i), "");
						break;
					}
				}
			}
			if(s2.length()==0)
			{
				System.out.println("anagram");
			}
			else
				System.out.println("not anagram");
		}
		else
			System.out.println("It's not anagram");

	}

}
