package lab01.tdd.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private final List<Integer> circularList = new ArrayList<>();
    private int index;

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
    public Optional<Integer> next() {
        return this.isEmpty() ? Optional.empty() : Optional.of(this.circularList.get(this.getNextIndex()));
    }

    private int getNextIndex() {
        return Math.floorMod(this.index++, this.size());
    }

    @Override
    public Optional<Integer> previous() {
        return this.isEmpty() ? Optional.empty() : Optional.of(this.circularList.get(this.getPreviousIndex()));
    }

    private int getPreviousIndex() {
        return this.size() - 1 - this.getNextIndex();
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
