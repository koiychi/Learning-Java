import java.util.Scanner;

public class ATM_Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        boolean running = true;
        while (running) {
            System.out.println("\n=== Welcome to the Simple Bank ===");
            System.out.println("1) Create an account");
            System.out.println("2) Login");
            System.out.println("0) Exit");
            System.out.print("> ");

            String choice = input.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.print("Name: ");
                    String name = input.nextLine().trim();
                    System.out.print("Initial deposit (integer): ");
                    int deposit = 0;
                    try {
                        deposit = Integer.parseInt(input.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, setting initial deposit to 0.");
                    }
                    System.out.print("Account type (e.g., Savings): ");
                    String type = input.nextLine().trim();
                    System.out.print("Password (PIN): ");
                    String pw = input.nextLine().trim();

                    Account newAcc = bank.createAccount(name, deposit, type, pw);
                    System.out.println("Account created. Account number: " + newAcc.getAccountNumber());
                    break;

                case "2":
                    System.out.print("Account number: ");
                    String accNum = input.nextLine().trim();
                    System.out.print("Password: ");
                    String pass = input.nextLine().trim();

                    if (!bank.authenticate(accNum, pass)) {
                        System.out.println("Invalid account number or password.");
                        break;
                    }

                    Account logged = bank.findByAccountNumber(accNum);
                    System.out.println("Logged in as " + logged.getName());

                    boolean loggedIn = true;
                    while (loggedIn) {
                        System.out.println("\n--- Account Menu ---");
                        System.out.println("1) Show balance");
                        System.out.println("2) Deposit");
                        System.out.println("3) Withdraw");
                        System.out.println("0) Logout");
                        System.out.print("> ");
                        String sub = input.nextLine().trim();
                        switch (sub) {
                            case "1":
                                System.out.println("Balance: " + logged.getBalance());
                                break;
                            case "2":
                                System.out.print("Amount to deposit: ");
                                try {
                                    int amt = Integer.parseInt(input.nextLine().trim());
                                    logged.deposit(amt);
                                    System.out.println("Deposited. New balance: " + logged.getBalance());
                                } catch (Exception e) {
                                    System.out.println("Invalid amount.");
                                }
                                break;
                            case "3":
                                System.out.print("Amount to withdraw: ");
                                try {
                                    int amt = Integer.parseInt(input.nextLine().trim());
                                    boolean ok = logged.withdraw(amt);
                                    if (ok) System.out.println("Withdrawal successful. New balance: " + logged.getBalance());
                                    else System.out.println("Insufficient funds.");
                                } catch (Exception e) {
                                    System.out.println("Invalid amount.");
                                }
                                break;
                            case "0":
                                loggedIn = false;
                                break;
                            default:
                                System.out.println("Unknown option.");
                        }
                    }
                    break;

                case "3":
                    System.out.println("All accounts in bank:");
                    for (Account a : bank.getAccounts()) {
                        System.out.println(a);
                    }
                    break;

                case "0":
                    running = false;
                    break;

                default:
                    System.out.println("Unknown option.");
            }
        }

        input.close();
        System.out.println("Goodbye.");
    }
}
