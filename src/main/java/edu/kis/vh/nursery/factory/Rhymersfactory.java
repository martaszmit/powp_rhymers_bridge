package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.IIntArrayStack;

public interface Rhymersfactory {

	public IIntArrayStack getStandardRhymer();

	public IIntArrayStack getFalseRhymer();

	public IIntArrayStack getFifoRhymer();

	public IIntArrayStack getHanoiRhymer();

}
