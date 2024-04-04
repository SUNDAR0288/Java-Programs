package Strings;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String str = "sundar";
		char []ch = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		str = " ";
		for(int i = ch.length-1;i>=0;i--)
		{
			str = str + ch[i];
		}
		System.out.println(str);

	}

}
