package lab01.tdd.step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CircularListTest {

    private CircularList circularList;

    @BeforeEach
    void setUp() {
        this.circularList = new CircularListImpl();
    }

    @Test
    void testForwardIteration() {
        this.circularList.add(0);
        this.circularList.add(1);
        this.circularList.add(2);
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> listIterator = this.circularList.forwardIteration();
        list.add(listIterator.next());
        list.add(listIterator.next());
        list.add(listIterator.next());
        assertEquals(Arrays.asList(0,1,2), list);
    }
}