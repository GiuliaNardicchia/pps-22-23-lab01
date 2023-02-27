package lab01.example.model;

import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest {

    protected final AccountHolder accountHolder;
    protected BankAccount bankAccount;

    SimpleBankAccountTest() {
        this.accountHolder = new AccountHolder("Mario", "Rossi", 1);
    }

    @BeforeEach
    void beforeEach(){
        this.bankAccount = new SimpleBankAccount(this.accountHolder, 0);
    }

    @Test
    void testInitialBalance() {
        assertEquals(0, this.bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        this.bankAccount.deposit(this.accountHolder.getId(), 100);
        assertEquals(this.applyFee(100), this.bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        this.bankAccount.deposit(this.accountHolder.getId(), 100);
        this.bankAccount.deposit(2, 50);
        assertEquals(this.applyFee(100), this.bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        this.bankAccount.deposit(this.accountHolder.getId(), 100);
        this.bankAccount.withdraw(this.accountHolder.getId(), 70);
        int expected = this.applyFee(100) - (70 + this.bankAccount.getFee());
        assertEquals(expected, this.bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        this.bankAccount.deposit(this.accountHolder.getId(), 100);
        this.bankAccount.withdraw(2, 70);
        assertEquals(this.applyFee(100), this.bankAccount.getBalance());
    }

    private int applyFee(final int expected) {
        return expected - this.bankAccount.getFee();
    }
}
