import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws Exception {
        SQLite db = new SQLite();
        Scanner sc = new Scanner(System.in);

        boolean continueInput = true;
        while (continueInput) {
            System.out.println("\nEnter new Contact:");

            String name;
            while (true) {
                System.out.print("Name: ");
                name = sc.nextLine();
                if (name != null && !name.isBlank()) break;
                System.out.println("Name cannot be empty. Please enter a valid name.");
            }

            String email;
            while (true) {
                System.out.print("Email Address: ");
                email = sc.nextLine();
                if (email != null && !email.isBlank() && email.contains("@")) break;
                System.out.println("Email must be non-empty and contain '@'. Please enter a valid email.");
            }

            String phone;
            while (true) {
                System.out.print("Phone Number (11 digits): ");
                phone = sc.nextLine();
                if (phone != null && !phone.isBlank() && phone.length() == 11) break;
                System.out.println("Phone number must be 9 digits long and non-empty. Please enter a valid phone number.");
            }

            Contacts contacts = new Contacts(name, email, phone);
            db.insertContacts(contacts);
            System.out.println("Contact saved.");

            System.out.println("\nAll contacts in database:");
            for (Contacts c : db.getAllContacts()) {
                System.out.println(c);
            }

            String ans;
            while (true) {
                System.out.print("\nAdd another contact? (y/n): ");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("y")) {
                    break;
                } else if (ans.equalsIgnoreCase("n")) {
                    continueInput = false;
                    break;
                } else {
                    System.out.println("Please enter 'y' or 'n'.");
                }
            }
        }

        sc.close();
        db.close();
    }
}
