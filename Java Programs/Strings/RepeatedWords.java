package Strings;

public class RepeatedWords {

	public static void main(String[] args) {
		String str = "hi sam and vam . sam and vam is brothers . john is elder brother";
		String s[] = str.split(" "); 
		int n = 0;
		for(int i = 0;i<s.length;i++)
		{
			
			for(int j = i;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					n++;
					if(n>1)
						System.out.println(s[i]+ " repeated word no of: "+n);
				}
				
			}
			n=0;
		}

	}

}
