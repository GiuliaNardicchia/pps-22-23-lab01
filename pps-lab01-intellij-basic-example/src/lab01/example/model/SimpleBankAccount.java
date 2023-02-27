package lab01.example.model;

import java.util.Optional;

/**
 * This class represent a particular instance of a BankAccount.
 * In particular, a Simple Bank Account allows always the deposit
 * while the withdrawal is allowed only if the balance greater or equal the withdrawal amount
 */
public class SimpleBankAccount implements BankAccount {

    private double balance;
    private final AccountHolder holder;

    private Optional<Integer> fee;

    public SimpleBankAccount(final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
        this.fee = Optional.empty();
    }
    @Override
    public AccountHolder getHolder(){
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(final int userID, double amount) {
        if (checkUser(userID)) {
            this.balance += amount - this.getFee();
        }
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance -= amount + this.getFee();
        }
    }

    @Override
    public void setFee(final int fee) {
        this.fee = Optional.of(fee);
    }

    @Override
    public int getFee() {
        return this.fee.orElse(0);
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount;
    }

    private boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
}
