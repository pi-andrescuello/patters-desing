import java.util.ArrayList;
import java.util.List;

interface Cloneable {
    Account clone();
}

class Account implements Cloneable{
    public Integer amount = 2400;
    public String firstName = "Andres";
    public String lastName = "Cuello";

    @Override
    public String toString() {
        return "Account{" +
                "amount = " + amount +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Account clone() {
        Account cloned = new Account();
        cloned.amount = this.amount;
        cloned.firstName = this.firstName;
        cloned.lastName = this.lastName;
        return cloned;
    }
}

public class Prototype {
    void getUsers(){
        List<Account> accountList = new ArrayList<>();

        Account account1 = new Account();
        Account account2 = account1.clone();

        accountList.add(account1);
        accountList.add(account2);

        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}