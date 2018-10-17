package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndStack.IntArrayStack;

public class FifoRhymer extends DefaultCountingOutRhymer {

	public IIntArrayStack temp = new DefaultCountingOutRhymer();

	public FifoRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FifoRhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
		// TODO Auto-generated constructor stub
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
