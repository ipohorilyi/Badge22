package PossibleInterviewQuestion;

import java.security.SecureRandom;

public class Password3Digits {
    // Method to generate a random alphanumeric password of a specific length
    public static String generateRandomPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String charsUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String charsLow = "abcdefghijklmnopqrstuvwxyz";
        final String nums = "0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance

        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(charsUp.length());
            sb.append(charsUp.charAt(randomIndex));
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {
        int len = 3;
        System.out.println(generateRandomPassword(len));
    }
}
