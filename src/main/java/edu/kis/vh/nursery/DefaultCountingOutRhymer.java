package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listAndStack.IntArrayStack;

/**
 * @author Marta
 * impementacja interfejsu zamiast rozsszerzania klasy ma tę przewagę, że klasa może implementować wiele intefejsów, a rozszerzać tylko jedną klasę. 
 */
public class DefaultCountingOutRhymer implements IIntArrayStack {

	IntArrayStack intArrayStack = new IntArrayStack();

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) { 
		super();
		this.intArrayStack = intArrayStack;
	}

	public DefaultCountingOutRhymer() {
		super();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IIntaArrayStack#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IIntaArrayStack#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IIntaArrayStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return intArrayStack.isFull();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IIntaArrayStack#countOut()
	 */
	@Override
	public int countOut() {
		return intArrayStack.countOut();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IIntaArrayStack#peekaboo()
	 */
	@Override
	public int peekaboo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
