package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndStack.IntArrayStack;

/**
 * @author Marta
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HanoiRhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;
	
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

	int getTotalRejected() {
		return totalRejected;
	}

}
