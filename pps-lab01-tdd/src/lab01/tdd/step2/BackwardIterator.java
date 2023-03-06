package lab01.tdd.step2;

import java.util.List;

public class BackwardIterator extends AbstractCircularIterator {

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
