package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

private int totalRejected = 0;

	public HanoiRhymer() {
		super();
	}
	
	public HanoiRhymer(String string) {
		super(string);
	}

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
			totalRejected++;
			else
				super.countIn(in);
	}
}
