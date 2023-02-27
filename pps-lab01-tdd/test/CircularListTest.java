import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularList;

    @BeforeEach
    void beforeEach() {
        this.circularList = new CircularListImpl();
    }

    @Test
    void testCanBeAddedElements() {
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.add(3);
        assertEquals(3, this.circularList.size());
    }

    @Test
    void testCanBeEmpty() {
        assertTrue(this.circularList.isEmpty());
    }

    @Test
    void testNextElements() {
        this.circularList.add(1);
        this.circularList.add(2);
        this.circularList.add(3);
        assertEquals(Arrays.asList(1,2,3), getNextElements(this.circularList));
    }

    @Test
    void testNextEdgeElement() {
        this.circularList.add(1);
        this.circularList.add(2);
        List<Integer> list = getNextElements(this.circularList);
        list.add(this.circularList.next().get());
        assertEquals(Arrays.asList(1,2,1), list);
    }

    private List<Integer> getNextElements(CircularList circularList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < circularList.size(); i++) {
            list.add(circularList.next().get());
        }
        return list;
    }

}
