package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IIntContainer;
import edu.kis.vh.nursery.container.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    final private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
    }

    public FIFORhymer(IIntContainer intContainer) {
        super(intContainer);
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
