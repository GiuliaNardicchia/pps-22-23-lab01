package lab01.example.model;

public class SimpleBankAccountWithAtm extends SimpleBankAccount implements BankAccount {

    public SimpleBankAccountWithAtm(final AccountHolder accountHolder, final int balance) {
        super(accountHolder, balance);
    }
}
