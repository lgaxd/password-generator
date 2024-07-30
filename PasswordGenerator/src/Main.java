public class Main {

    public static void main(String[] args) {

        PasswordGenerator generator = new PasswordGenerator();

        String password = PasswordGenerator.generateRandomPassword(generator.getPasswordLength());

        System.out.println("Generated Password: " + password);

    }
}