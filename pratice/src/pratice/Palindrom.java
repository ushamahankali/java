package pratice;

public class Palindrom {

	@SuppressWarnings("unused")
	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1))
				System.out.println("false");
			return false;
		}
		System.out.println("true");
		return true;
	}

	public static void main(String args[]) {
		// Palindrom.isPalindromeString("");
		Palindrom.isPalindromeString("hello");
	}
}