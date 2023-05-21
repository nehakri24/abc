import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Model data = new Model();

        System.out.println("Enter Email Id:");
        data.setEmail(sc.nextLine());

        System.out.println("Enter Alternate Email Id:");
        data.setAltEmail(sc.nextLine());

        System.out.println("Enter Capacity:");
        data.setCapacity(sc.nextInt());

        // Generate Password
        data.setPassword(GeneratePassword.generateRandomPassword());

        // Access the account details
        System.out.println("Email: " + data.getEmail());
        System.out.println("Password: " + data.getPassword());
        System.out.println("Mailbox Capacity: " + data.getCapacity());
        System.out.println("Alternate Email: " + data.getAltEmail());
    }
}
