package cure;

import java.util.Arrays;

public class StringEqual {
	public static void main(String[] args) {
		String str1 = " jacket";
		String str2 = "j";
		String str3 = new String("j");
		String str4 = new String("j");
		char Array [] = new char[]{'j','a','c','k'};
		String[] Array2 = str1.split("j");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str4 == str3);
		System.out.println(str1.charAt(2));
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.lastIndexOf("t"));
		System.out.println(str1.endsWith("t"));
		System.out.println(str1.isEmpty());
		System.out.println(str1.contains("jack"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str4));
		System.out.println(str1.toCharArray());
		System.out.println(str1.replace("a", "e"));
		System.out.println(Arrays.toString(Array2));
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(1, 3));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.trim());
		System.out.println(clean(" sara sr "));
		

		}
		public static String clean(String str) {
			String str1 = str.trim();
			String str2 = str1.replace(" ", "");
			return str2;
	}
}
