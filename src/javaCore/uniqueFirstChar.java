package javaCore;

public class uniqueFirstChar {
	static int unique(String text) {
		for (int j = 0; j < text.length(); j++) {
			boolean signal = true;
			for (int k = 0; k < text.length(); k++) {
				if (text.charAt(j) == text.charAt(k) && j!=k) {
					signal = false;
					break;
				}
			}
			if (signal)
				return j;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(unique("hani"));
		System.out.println(unique("hani has toy"));
		System.out.println(unique("big dream has big value"));
		System.out.println(unique("new cahnge in life"));
		System.out.println(unique("first program"));
		System.out.println(unique("abababab"));
	}
}
