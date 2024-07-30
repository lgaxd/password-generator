import java.util.Random;

public class PasswordGenerator {

    private final int passwordLength;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

    public PasswordGenerator() {

        int min = 8;
        int max = 16;

        this.passwordLength = (int) (Math.random() * ((max - min) + 1)) + min;

    }

    public PasswordGenerator(int passwordLength) {

        this.passwordLength = passwordLength;

    }

    public int getPasswordLength() {

        return this.passwordLength;

    }

    public static String generateRandomPassword(int passwordLength) {

        Random random = new Random();

        StringBuilder randomString = new StringBuilder(passwordLength);

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            randomString.append(CHARACTERS.charAt(index));
        }

        return randomString.toString();

    }

}
