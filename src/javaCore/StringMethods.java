package javaCore;

public class StringMethods {

	public static void main(String[] args) {

		String str1 = "Hani and welela ";
		String str2="or";
		// lenth()
		System.out.println(str1.length());
		// trim()
		System.out.println(str1.trim().length());
		// chartAt()
		System.out.println(str1.charAt(3));

		// con
		System.out.println(str1.concat("welcome"));

		System.out.println(str1.concat("welcome"));
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		char [] strArray = str1.toCharArray();
		
		for (char c : strArray) {
			System.out.println(c);
		}
		
		System.out.println(str1.replace("and", str2));
		//substring
		
		System.out.println(str1.substring(0, 4));
	}

}
