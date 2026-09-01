import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(String name, int initialBalance, String accountType, String password){
        Account acc = new Account(name, initialBalance, accountType, password);
        accounts.add(acc);
        return acc;
    }

    public Account findByAccountNumber(String accountNumber){
        for (Account a: accounts) {
            if (a.getAccountNumber().equals(accountNumber)) return a;
        }
        return null;
    }

    public boolean authenticate(String accountNumber, String password){
        Account a = findByAccountNumber(accountNumber);
        return a != null && a.checkPassword(password);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }
}
