package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_NUMBERS_SIZE = 12;
    public static final int MAX_NUMBERS_INDEX = MAX_NUMBERS_SIZE-1;
    public static final int ERR_CODE = -1;
    public static final int INDEX_EMPTY = -1;

    private final int[] numbers = new int[MAX_NUMBERS_SIZE];

    private int total = INDEX_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INDEX_EMPTY;
    }

    public boolean isFull() {
        return total == MAX_NUMBERS_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }

}
