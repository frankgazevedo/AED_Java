package entities;

public class IteratorLinkedList<TIPO> {
	private Node<TIPO> node;
	
	public IteratorLinkedList(Node<TIPO> node) {
		this.node = node;
	}
	
	public Boolean hasNext() {
		if(node.getNext() == null)
			return false;
		else
			return true;
	}
	
	public Node<TIPO> getNext(){
		node = node.getNext();
		return node;		
	}
}
