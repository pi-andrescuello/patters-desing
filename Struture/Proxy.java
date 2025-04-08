package Struture;

interface IAccountBank {
    String addDinner(float amount);
    String extractDinner(float amount);
    float getDinner();
}

class AccountBank {
    private float balance;

    public AccountBank(float balance) {
        this.balance = balance;
    }

    public void add(float amount) {
        balance += amount;
    }

    public boolean extract(float amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public float getBalance() {
        return balance;
    }
}

class AccountBankProxy implements IAccountBank {
    private AccountBank realAccount;

    public AccountBankProxy(AccountBank account) {
        this.realAccount = account;
    }

    @Override
    public String addDinner(float amount) {
        realAccount.add(amount);
        return "Added. New balance: " + realAccount.getBalance();
    }

    @Override
    public String extractDinner(float amount) {
        if (realAccount.extract(amount)) {
            return "Extracted. New balance: " + realAccount.getBalance();
        }
        return "Insufficient funds.";
    }

    @Override
    public float getDinner() {
        return realAccount.getBalance();
    }
}


public class Proxy {
    public void accountBank(){
        AccountBank accountBank = new AccountBank(0);
        AccountBankProxy accountBankProxy = new AccountBankProxy(accountBank);
        accountBankProxy.addDinner(4500);

        String resultOperation = accountBankProxy.extractDinner(500);
        System.out.println(resultOperation);
    }
}