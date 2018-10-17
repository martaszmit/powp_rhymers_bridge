package edu.kis.vh.nursery.listAndStack;

public class IntLinkedList implements IIntLinkedList {

	private static final int EMPTY_STACK_ERROR = -1;
	Node last;
	int i;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IIntLinkedList#push(int)
	 */
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IIntLinkedList#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IIntLinkedList#isFull()
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IIntLinkedList#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_ERROR;
		return last.value;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IIntLinkedList#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_ERROR;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
