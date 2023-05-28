package entities;

public class Node<TIPO> {
	
	private TIPO value;
	private Node<TIPO> next;
	
	public TIPO getValue() {
		return value;
	}
	public void setValue(TIPO value) {
		this.value = value;
	}
	public Node<TIPO> getNext() {
		return next;
	}
	public void setNext(Node<TIPO> next) {
		this.next = next;
	}	
}