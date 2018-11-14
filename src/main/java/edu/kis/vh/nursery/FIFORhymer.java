package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.StackImplementation;

public class FIFORhymer extends defaultCountingOutRhymer {

	private final defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer("list");
	public FIFORhymer(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}


	public FIFORhymer() {
		super();
	}
	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
	
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
