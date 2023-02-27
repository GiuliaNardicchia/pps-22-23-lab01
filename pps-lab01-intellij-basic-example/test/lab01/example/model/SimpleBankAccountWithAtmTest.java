package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBankAccountWithAtmTest extends SimpleBankAccountTest {

    @Override
    @BeforeEach
    void beforeEach() {
        this.bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

}