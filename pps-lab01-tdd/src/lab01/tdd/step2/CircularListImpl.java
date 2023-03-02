package lab01.tdd.step2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularListImpl implements CircularList {

    private final List<Integer> circularList = new ArrayList<>();

    @Override
    public void add(int element) {
        this.circularList.add(element);
    }

    @Override
    public int size() {
        return this.circularList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.circularList.isEmpty();
    }

    @Override
    public Iterator<Integer> forwardIteration() {
        return this.circularList.listIterator();
    }

    @Override
    public Iterator<Integer> backwardIteration() {
        return null;
    }

    @Override
    public void reset() {

    }
}
