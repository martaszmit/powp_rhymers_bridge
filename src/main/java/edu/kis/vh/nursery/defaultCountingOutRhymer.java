package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.StackImplementation;

public class defaultCountingOutRhymer {
	
	private StackImplementation stackImplementation;
	
	public defaultCountingOutRhymer() {
		this("array");
	}
	public defaultCountingOutRhymer(String string) {
		switch(string) {
		  case "array":
          	stackImplementation = new IntArrayStack();
              break;
          case "list":
          	stackImplementation = new IntLinkedList();
              break;
          default:
              System.out.println("Brak parametru");
              break;
		}
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

	int countOut() {
		return stackImplementation.pop();
	}
	boolean callCheck() {
		return stackImplementation.isEmpty();
	}
}
