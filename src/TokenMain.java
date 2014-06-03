import java.security.SecureRandom;

public class TokenMain {

	public static final String A_TO_Z = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {

		for (int i = 10; i < 100; i++) {
			System.out.println(generateSecureRandomAlphaNumericString(30));
		}

	}

	public static String generateSecureRandomAlphaNumericString(int len) {
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(A_TO_Z.charAt(secureRandom.nextInt(A_TO_Z.length())));
		return sb.toString();
	}
}
