package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;

public class defaultCountingOutRhymer {
	
	private final IntLinkedList intLinkedList;

	public defaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}
	
	public defaultCountingOutRhymer() {
		intLinkedList = new IntLinkedList();
	}
	public int getTotal() {
		return intLinkedList.getSize();
	}
	public void countIn(int in) {
		intLinkedList.push(in);
		
	}
	boolean isFull() {
		return intLinkedList.isFull();
	}
	int peekaboo() {
		return intLinkedList.peekaboo();
	}
	int countOut() {
		return intLinkedList.pop();
	}
	boolean callCheck() {
		return intLinkedList.isEmpty();
	}
}
