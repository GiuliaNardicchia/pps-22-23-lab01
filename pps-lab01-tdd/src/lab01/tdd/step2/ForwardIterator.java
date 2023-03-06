package lab01.tdd.step2;

import java.util.List;

public class ForwardIterator extends AbstractCircularIterator {

    public ForwardIterator(final List<Integer> list) {
        super(list);
    }

    protected void reset() {
        this.circularIterator = this.circularList.listIterator();
    }
}
