package lab01.tdd.step3;

import java.util.Optional;
import java.util.function.Predicate;

public interface CircularList {

    /**
     * Adds an element to the list, namely, after the last inserted one.
     * @param element the element to be added to the list
     */
    void add(final int element);

    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Provides the next element of the list that satisfies a given condition.
     * @return the next element of the list, or an empty optional if the list is empty
     */
    Optional<Integer> filteredNext(Predicate<? super Integer> predicate);

}
