package Strings;

public class Strings2Reverse {

	public static void main(String[] args) {
		String str = "love and heart";
		String []arr = str.split(" ");
		str = " ";
		for(int i = 0;i<arr.length;i++)
		{
			String s = arr[i];
			for(int j = s.length()-1;j>=0;j--)
			{
				str = str + s.charAt(j);
			}
			str = str + " ";
		}
		System.out.println(str);

	}

}
