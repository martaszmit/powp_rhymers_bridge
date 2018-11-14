package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
 public class ListRhymerFactory implements Rhymersfactory {
 	@Override
	public defaultCountingOutRhymer GetStandardRhymer() {
		return new defaultCountingOutRhymer("list");
	}
 	@Override
	public defaultCountingOutRhymer GetFalseRhymer() {
		return new defaultCountingOutRhymer("array");
	}
 	@Override
	public defaultCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer("list");
	}
 	@Override
	public defaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer("list");
	}
 }