package edu.kis.vh.nursery.collection;

public interface StackImplementation {
	int EMPTY_STACK = 0;
	int STACK_CAPACITY = 12;
	boolean isFull();
 
	void push(int i);

	boolean isEmpty();

	int top();

	int pop();
	
 	int getSize();


}
