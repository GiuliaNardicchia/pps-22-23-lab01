package lab01.tdd.step2;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class AbstractCircularIterator implements Iterator<Integer> {

    protected final List<Integer> circularList;
    protected ListIterator<Integer> circularIterator;

    public AbstractCircularIterator(final List<Integer> list) {
        this.circularList = list;
        this.reset();
    }

    abstract void reset();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (!this.circularIterator.hasNext()) {
            this.reset();
        }
        return this.circularIterator.next();
    }
}
