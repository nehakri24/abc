import java.util.Random;

public class GeneratePassword {
    // Private method to generate a random password
    public static String generateRandomPassword() {
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        int passwordLength = 10;
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
