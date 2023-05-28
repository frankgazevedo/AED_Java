package entities;

public class LinkedList<TIPO> {

	private Node<TIPO> first;
	private Node<TIPO> last;
	private Integer length;

	public LinkedList() {
		this.setLength(0);
	}

	public Node<TIPO> getFirst() {
		return first;
	}

	public void setFirst(Node<TIPO> first) {
		this.first = first;
	}

	public Node<TIPO> getLast() {
		return last;
	}

	public void setLast(Node<TIPO> last) {
		this.last = last;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Boolean isEmpty() {
		if (this.getFirst() == null && this.getLast() == null)
			return true;
		return false;
	}

	public void addNodeEndingList(TIPO newValue) {
		Node<TIPO> node = new Node<TIPO>();

		node.setValue(newValue);

		// if the Linked List are empty
		if (this.isEmpty()) {
			this.setFirst(node);
			this.setLast(node);
		} else { // adding node ever in the end of Linked List
			this.getLast().setNext(node);
			this.setLast(node);
		}

		this.setLength(getLength() + 1); // decreasing the list size
	}

	public void addNodeBeginningList(TIPO newValue) {
		Node<TIPO> node = new Node<TIPO>();

		node.setValue(newValue);

		// if the Linked List are empty
		if (this.isEmpty()) {
			this.setFirst(node);
			this.setLast(node);
		} else { // adding node ever in the beginning of Linked List
			node.setNext(getFirst());
			this.setFirst(node);
		}

		this.setLength(getLength() + 1); // increasing the list size
	}

	public void removeNode(TIPO value) {
		Node<TIPO> before = null;
		Node<TIPO> current = this.getFirst();

		for (int i = 0; i < this.getLength(); i++) {
			if (current.getValue().equals(value)) {
				if (current == this.getFirst() && current == this.getLast()) { // or if (this.getLength == 1)
					this.setFirst(null);
					this.setLast(null);
				} else if (current == this.getFirst()) { // removing the first node
					this.setFirst(current.getNext());
					current.setNext(null);
				} else if (current == this.getLast()) { // removing the last node
					this.setLast(before);
					before.setNext(null);
				} else { // removing the middle node
					before.setNext(current.getNext());
					current = null;
				}
				this.setLength(getLength() - 1); // decreasing the list size
				break;
			}
			before = current;
			current = current.getNext();
		}
	}

	public Node<TIPO> get(Integer index) {
		Node<TIPO> current = this.getFirst();

		for (int i = 0; i < index; i++) {
			if (current.getNext() != null) {
				current = current.getNext();
			}
		}
		return current;
	}
	
	public IteratorLinkedList<TIPO> getIterator(){
		return new IteratorLinkedList<>(this.getFirst());
	}
}
