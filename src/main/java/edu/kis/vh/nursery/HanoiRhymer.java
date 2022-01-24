package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IIntContainer;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer() {
	}

	public HanoiRhymer(IIntContainer intContainer) {
		super(intContainer);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
