package edu.kis.vh.nursery;

/**
 * Specifies default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

    public static final int MAX_NUMBERS_SIZE = 12;
    public static final int MAX_NUMBERS_INDEX = MAX_NUMBERS_SIZE-1;
    public static final int ERR_CODE = -1;
    public static final int INDEX_EMPTY = -1;

    private final int[] numbers = new int[MAX_NUMBERS_SIZE];

    private int total = INDEX_EMPTY;

    /**
     * Get value of total.
     * @return total.
     */
    public int getTotal() {
        return total;
    }

    /**
     * If number is not full add value to numbers.
     * @param in value added into numbers array.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if numbers is empty.
     * @return true when numbers is empty.
     */
    public boolean callCheck() {
        return total == INDEX_EMPTY;
    }

    /**
     * Checks if numbers is full.
     * @return true when numbers is full.
     */
    public boolean isFull() {
        return total == MAX_NUMBERS_INDEX;
    }

    /**
     * If numbers is not empty return top number.
     * @return if numbers is empty ERR_CODE,
     *         else top number from numbers.
     */
    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    /**
     * If numbers is not empty return top number and decrease total by 1.
     * @return if numbers is empty ERR_CODE,
     *         else top number from numbers.
     */
    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }

}
