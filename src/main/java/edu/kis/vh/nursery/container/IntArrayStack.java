package edu.kis.vh.nursery.container;


public class IntArrayStack implements IIntContainer {
    public static final int MAX_NUMBERS_SIZE = 12;
    public static final int MAX_NUMBERS_INDEX = MAX_NUMBERS_SIZE-1;
    public static final int EMPTY_NUMBERS_INDEX = -1;

    private final int[] numbers = new int[MAX_NUMBERS_SIZE];
    private int total = EMPTY_NUMBERS_INDEX;

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_NUMBERS_INDEX;
    }

    @Override
    public boolean isFull() {
        return total == MAX_NUMBERS_INDEX;
    }

    @Override
    public int top() {
        if (isEmpty())
            return ERR_CODE;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return ERR_CODE;
        return numbers[total--];
    }

}
