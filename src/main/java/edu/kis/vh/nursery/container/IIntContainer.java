package edu.kis.vh.nursery.container;

public interface IIntContainer {
    int ERR_CODE = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
