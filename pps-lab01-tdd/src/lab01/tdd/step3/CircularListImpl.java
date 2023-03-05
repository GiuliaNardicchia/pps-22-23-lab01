package lab01.tdd.step3;

import lab01.tdd.step2.BackwardIterator;
import lab01.tdd.step2.ForwardIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CircularListImpl implements CircularList {

    private final List<Integer> circularList = new ArrayList<>();

    @Override
    public void add(int element) {
        this.circularList.add(element);
    }

    @Override
    public boolean isEmpty() {
        return this.circularList.isEmpty();
    }

    @Override
    public Optional<Integer> filteredNext(Predicate<? super Integer> predicate) {
        return this.isEmpty() ? Optional.empty() : this.circularList.stream().filter(predicate).findFirst();
    }

}
