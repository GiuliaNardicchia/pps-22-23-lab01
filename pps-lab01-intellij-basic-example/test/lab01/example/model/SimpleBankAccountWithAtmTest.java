package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;

class SimpleBankAccountWithAtmTest extends SimpleBankAccountTest {

    @Override
    @BeforeEach
    void beforeEach() {
        this.bankAccount = new SimpleBankAccountWithAtm(this.accountHolder, 0);
    }
}