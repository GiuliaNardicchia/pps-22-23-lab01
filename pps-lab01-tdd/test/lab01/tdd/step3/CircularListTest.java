package lab01.tdd.step3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CircularListTest {

    private CircularList circularList;

    @BeforeEach
    void beforeEach() {
        this.circularList = new CircularListImpl();
    }

    @Test
    void testEmptyFilteredNext() {
        this.circularList.add(0);
        this.circularList.add(1);
        this.circularList.add(2);
        assertEquals(Optional.empty(), this.circularList.filteredNext(i -> i >= 3));
    }

    @Test
    void testFilteredNext() {
        this.circularList.add(0);
        this.circularList.add(1);
        this.circularList.add(2);
        assertEquals(Optional.of(0), this.circularList.filteredNext(i -> i < 2));
    }
}