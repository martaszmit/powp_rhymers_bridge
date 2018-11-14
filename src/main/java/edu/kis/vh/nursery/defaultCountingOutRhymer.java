package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackImplementation;

public class defaultCountingOutRhymer {
	
	private final StackImplementation stackImplementation;

	public defaultCountingOutRhymer(StackImplementation stackImplementation) {
		this.stackImplementation = stackImplementation;
	}
	
	public defaultCountingOutRhymer() {
		stackImplementation = new IntLinkedList();
	}
	public int getTotal() {
		return stackImplementation.getSize();
	}
	public void countIn(int in) {
		stackImplementation.push(in);
		
	}
	boolean isFull() {
		return stackImplementation.isFull();
	}
	int peekaboo() {
		return stackImplementation.peekaboo();
	}
	int countOut() {
		return stackImplementation.pop();
	}
	boolean callCheck() {
		return stackImplementation.isEmpty();
	}
}
