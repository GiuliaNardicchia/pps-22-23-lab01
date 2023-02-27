package lab01.example.model;

public class SimpleBankAccountWithAtm extends SimpleBankAccount implements BankAccount {

    public static final int FEE_AMOUNT = 1;

    public SimpleBankAccountWithAtm(final AccountHolder accountHolder, final int balance) {
        super(accountHolder, balance);
        this.setFee(FEE_AMOUNT);
    }
}
