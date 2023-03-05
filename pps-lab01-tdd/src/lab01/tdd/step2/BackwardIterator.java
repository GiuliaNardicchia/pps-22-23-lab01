package lab01.tdd.step2;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BackwardIterator extends CircularBaseIterator {

    public BackwardIterator(final List<Integer> list) {
        super(list);
    }

    protected void reset() {
        this.circularIterator = this.circularList.listIterator(this.circularList.size());
    }

    @Override
    public Integer next() {
        if (!this.circularIterator.hasPrevious()) {
            this.reset();
        }
        return this.circularIterator.previous();
    }
}
