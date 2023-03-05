package lab01.tdd.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private final List<Integer> circularList = new ArrayList<>();
    private int index;
    private boolean isNext;

    CircularListImpl() {
        this.isNext = true;
    }

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
        if (!this.isNext) {
            this.index = this.index + 1;
            this.isNext = true;
        }
        return this.isEmpty() ? Optional.empty() : Optional.of(this.circularList.get(this.getNextIndex()));
    }

    private int getNextIndex() {
        if (this.index > this.size()-1) {
            this.reset();
        }
        return this.index++;
    }

    @Override
    public Optional<Integer> previous() {
        if (this.isNext) {
            this.index = this.index - 1;
            this.isNext = false;
        }
        return this.isEmpty() ? Optional.empty() : Optional.of(this.circularList.get(this.getPreviousIndex()));
    }

    private int getPreviousIndex() {
        this.index = this.index - 1;
        if (this.index < 0) {
            this.index = this.size()-1;
        }
        return this.index;
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
