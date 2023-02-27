package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBankAccountWithAtmTest extends SimpleBankAccountTest {

    private BankAccount bankAccountWithAtm;

    @BeforeEach
    void beforeEach() {
        this.bankAccountWithAtm = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

}