package edu.kis.vh.nursery;


import edu.kis.vh.nursery.container.IIntContainer;
import edu.kis.vh.nursery.container.IntLinkedList;

public class DefaultCountingOutRhymer {
    private IIntContainer intContainer;

    public DefaultCountingOutRhymer(){
        this.intContainer = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IIntContainer intContainer) {
        this.intContainer = intContainer;
    }

    public void countIn(int in) {  intContainer.push(in); }

    public boolean callCheck() {
        return intContainer.isEmpty();
    }

    public boolean isFull() {
        return intContainer.isFull();
    }

    public int peekaboo() {
        return intContainer.top();
    }

    public int countOut() {
        return intContainer.pop();
    }
}
