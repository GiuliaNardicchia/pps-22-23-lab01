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
        Iterator<Integer> iterator = this.circularList.forwardIteration();
        list.add(iterator.next());
        list.add(iterator.next());
        list.add(iterator.next());
        assertEquals(Arrays.asList(0,1,2), list);
    }

    @Test
    void testBackwardIteration() {
        this.circularList.add(0);
        this.circularList.add(1);
        this.circularList.add(2);
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = this.circularList.backwardIteration();
        list.add(iterator.next());
        list.add(iterator.next());
        list.add(iterator.next());
        assertEquals(Arrays.asList(2,1,0), list);
    }

    @Test
    void testModificationException() {
        this.circularList.add(0);
        this.circularList.add(1);
        this.circularList.add(2);
        Iterator<Integer> iterator = this.circularList.backwardIteration();
        iterator.next();
        this.circularList.add(3);
        assertThrows(ConcurrentModificationException.class, () -> iterator.next());
    }
}