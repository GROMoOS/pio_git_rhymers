package edu.kis.vh.nursery.container;

public class IntLinkedList implements IIntContainer {

	private class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	private Node last;
	private int i=0;

	@Override
	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		this.i++;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int peekaboo() {
		if (isEmpty())
			return ERR_CODE;
		return last.getValue();
	}

	@Override
	public int countOut() {
		if (isEmpty())
			return ERR_CODE;
		int ret = last.getValue();
		last = last.getPrev();
		this.i--;
		return ret;
	}

	@Override
	public int getTotal() {
		return this.i;
	}
}
