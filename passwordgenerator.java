import java.security.SecureRandom;

public class PasswordGenerator {
  public static void main(String[] args) {
    final int PASSWORD_LENGTH = 8;

    String password = generatePassword(PASSWORD_LENGTH);

    System.out.println(password);
  }

  public static String generatePassword(int length) {
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]|,./?><";

    SecureRandom rnd = new SecureRandom();
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append(characters.charAt(rnd.nextInt(characters.length())));
    }
    return sb.toString();
  }
}
