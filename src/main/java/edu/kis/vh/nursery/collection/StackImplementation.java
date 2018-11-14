package edu.kis.vh.nursery.collection;

public interface StackImplementation {
	int EMPTY_STACK = -1;
	boolean isFull();
 
	void push(int i);

	boolean isEmpty();

	int top();

	int pop();
	
 	int getSize();


}
