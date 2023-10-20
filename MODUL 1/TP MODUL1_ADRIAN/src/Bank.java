import java.util.ArrayList;

public class Bank {

    ArrayList<Account> bankAccount = new ArrayList<>();

    public void AddAccount(Account newAccount) {
        bankAccount.add(newAccount);
    }

    public void RemoveAccount(String accountName) {
        for (Account account : bankAccount){
            if (account.getAccountName().equals(accountName)) {
                bankAccount.remove(account);
                break;
            }
        }
    }

    public Account GetAccount(String accountName) {
        for (Account account : bankAccount){
            if (account.getAccountName().equals(accountName)) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> GetAllAccount() {
        return bankAccount;
    }

}
