package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.IIntArrayStack;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public IIntArrayStack getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public IIntArrayStack getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public IIntArrayStack getFifoRhymer() {
		return new FifoRhymer();
	}

	@Override
	public IIntArrayStack getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
