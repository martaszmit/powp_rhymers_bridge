package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	IntArrayStack intArrayStack = new IntArrayStack();

	public defaultCountingOutRhymer(IntArrayStack intArrayStack) {
		super();
		this.intArrayStack = intArrayStack;
	}

	public defaultCountingOutRhymer() {
		super();
	}

	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}

	public int peekaboo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
