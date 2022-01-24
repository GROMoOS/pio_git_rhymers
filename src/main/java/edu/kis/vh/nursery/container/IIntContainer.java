package edu.kis.vh.nursery.container;

public interface IIntContainer {
    int ERR_CODE = 0;

    void countIn(int i);

    boolean isEmpty();

    boolean isFull();

    int peekaboo();

    int countOut();

    int getTotal();
}
