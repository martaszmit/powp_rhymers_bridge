package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private int listSize;
	
	public boolean isFull() {
		return false;
	}

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
		listSize++;
	}

	public boolean isEmpty() {
		return last == null;
	}


	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		listSize--;
		return ret;
	}
	public int getsize() {
		return listSize;
	}

}
