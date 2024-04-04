package Recursion;

public class StringReverse {
 
	String reverse(String word)
	{
		if(word.length()==1)
			return word;
		String val = reverse(word.substring(1));
		char val2 = word.charAt(0);
		return val + val2;
	}
	public static void main(String[] args) {
		
		String name = "sundar";
		StringReverse sr = new StringReverse();
		String rev = sr.reverse(name);
		System.out.println("Reverse Word Is "+ rev);
	}

}
