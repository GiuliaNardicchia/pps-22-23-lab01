package lab01.tdd.step2;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForwardIterator extends CircularBaseIterator {

    public ForwardIterator(final List<Integer> list) {
        super(list);
    }

    protected void reset() {
        this.circularIterator = this.circularList.listIterator();
    }
}
