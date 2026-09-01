import java.util.Objects;

public class Account {
    private static int nextAccountNumber = 1000000000; // simple auto-increment starting value

    private final String accountNumber;
    private String name;
    private int balance;
    private String accountType;
    private String password;

    // Constructor generates an account number automatically
    public Account(String name, int initialBalance, String accountType, String password) {
        setName(name);
        setAccountType(accountType);
        setPassword(password);
        this.balance = Math.max(0, initialBalance);
        this.accountNumber = String.valueOf(nextAccountNumber++);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public void setAccountType(String accountType) {
        if (accountType == null || accountType.isBlank()) {
            throw new IllegalArgumentException("Account type cannot be null or blank.");
        }
        this.accountType = accountType;
    }

    public void setPassword(String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or blank.");
        }
        this.password = password;
    }

    public boolean checkPassword(String pw) {
        return Objects.equals(this.password, pw);
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            return false; // insufficient funds
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Account[name=%s, accountNumber=%s, balance=%d, type=%s]", name, accountNumber, balance, accountType);
    }
}
