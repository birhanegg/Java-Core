package javaCore;

public class stringPool {
	public static void main(String[] args) {
		String s1 = "hani";
		String s2 = new String("hani");
		String s3 = "hani";
		String s4 = new String("hani");
		
		//=== vs equal()
		System.out.println("s1==s2: " + (s1 == s2));
		System.out.println("s1==s3: " + (s1 == s3));
		System.out.println("s3==s4: " + (s3 == s4));
		System.out.println("s1.equal(s2): " + s1.equals(s2));
		System.out.println("s1.equal(s3): " + s1.equals(s3));
		System.out.println("s3.equal(s4): " + s3.equals(s4));
	
	}

}
