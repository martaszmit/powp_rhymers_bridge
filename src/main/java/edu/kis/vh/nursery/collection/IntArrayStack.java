package edu.kis.vh.nursery.collection;

public class IntArrayStack implements StackImplementation {
	private static final int STACK_CAPACITY = 12;
	
	private static final int IS_FULL_RHYMER = 11;
	
	private int[] rhymerArray = new int[STACK_CAPACITY];
	private int total = EMPTY_STACK;
	
 	public int getTotal() {
		return total;
	}

	
 	public boolean isFull() {
		return total == IS_FULL_RHYMER;
	}

	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		if(!isFull())
			rhymerArray[++total] = i;
		
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return total == EMPTY_STACK;
	}
	@Override
	public int top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return EMPTY_STACK;
		}
		return rhymerArray[total];
	}
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return EMPTY_STACK;
		}
		return rhymerArray[total--];

		
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return total;
	}





}
