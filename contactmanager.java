// ContactManager.java
import java.util.ArrayList;
import java.util.Scanner;

public class contactmanager {
    public static void main(String[] args) {
        // Store contacts using ArrayList
        ArrayList<String> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("📋 Welcome to the Contact Manager!");

        // Infinite loop to keep the program running
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1: // Add a contact
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    contacts.add(name);
                    System.out.println("✅ Contact added: " + name);
                    break;

                case 2: // View all contacts
                    System.out.println("\n📄 Contact List:");
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println((i + 1) + ". " + contacts.get(i));
                        }
                    }
                    break;

                case 3: // Delete a contact
                    System.out.print("Enter contact number to delete: ");
                    int index = scanner.nextInt();
                    if (index >= 1 && index <= contacts.size()) {
                        String removed = contacts.remove(index - 1);
                        System.out.println("❌ Contact deleted: " + removed);
                    } else {
                        System.out.println("❌ Invalid index!");
                    }
                    break;

                case 4: // Exit the program
                    System.out.println("👋 Exiting Contact Manager...");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }
}
