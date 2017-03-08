public class MyList {

	private Node head;
	private Node tail;
	private int size;

	public MyList() {

		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// 노드생성
	private Node createNode(Object data) {

		Node node = new Node(data);
		return node;
	}

	public void pushBack(Object data) {

		Node newNode = this.createNode(data);

		if (this.head == null) {

			this.head = newNode;
			this.tail = newNode;
		} else {

			this.tail.next = newNode;
			this.tail = newNode;
		}

		this.size++;
	}

	public void pushFront(Object data) {

		Node newNode = this.createNode(data);

		if (this.head == null) {

			this.head = newNode;
			this.tail = newNode;
		} else {

			newNode.next = this.head;
			this.head = newNode;
		}

		this.size++;
	}

	public Node getNodeAt(int idx) {

		if (this.head == null || idx < 0)
			return null;

		Node curNode = this.head;
		while ((idx--) > 0 && curNode != this.tail) {
			curNode = curNode.next;
		}

		return curNode;
	}

	public void insertAfterAt(int idx, Object data) {

		Node newNode = this.createNode(data);

		Node prev = this.getNodeAt(idx);

		newNode.next = prev.next;
		prev.next = newNode;
		if (newNode.next == null) {
			this.tail = newNode;
		}

		this.size++;
	}

	private Node findNode(Object data) {

		Node curNode = this.head;
		while (curNode != null) {

			if (curNode.data.equals(data)) {
				break;
			}

			curNode = curNode.next;
		}

		return curNode;
	}

	public void insertAfter(Object prevData, Object data) {

		Node newNode = this.createNode(data);

		Node prevNode = this.findNode(prevData);
		if (prevNode != null) {
			newNode.next = prevNode.next;
			prevNode.next = newNode;
			if (newNode.next == null) {
				this.tail = newNode;
			}

			this.size++;
		}
	}

	public void removeFront() {

		if (this.head == null)
			return;

		Node delNode = this.head;
		this.head = delNode.next;

		if (this.head == null) { // 새로운 헤드가 널이면
			this.tail = null;
		}

		delNode = null;

		this.size--;
	}

	public void removeBack() {

		if (this.tail == null)
			return;

		Node curNode = this.head;
		while (curNode.next != this.tail && curNode.next != null) {
			curNode = curNode.next;
		}

		if (this.tail == this.head) {
			this.head = null;
			this.tail = null;
			this.size = 0;
			return;
		}

		this.tail = curNode;
		curNode.next = null;

		this.size--;
	}

	public void removeAt(int idx) {

		if (idx < 0)
			return;

		Node delNode = this.getNodeAt(idx);
		if (delNode == null)
			return;

		if (delNode == this.head) {
			this.removeFront();
		} else if (delNode == this.tail) {
			this.removeBack();
		} else {
			Node prev = this.getNodeAt(idx - 1);
			prev.next = delNode.next;
			delNode = null;
		}
		this.size--;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {

		String str = "";
		Node current = this.head;
		while (current != this.tail) {
			str += current.toString();
			current = current.next;
			if (current != this.tail) {
				str += ", ";
			}
		}

		return str;
	}

	public void swap(Node a, Node b) {
		
		Object temp = a.data;
		a.data = b.data;
		b.data = temp;
	}

	// 노드
	public class Node {
		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return this.data.toString();
		}
		
		public Object getData(){
			return this.data;
		}
	}
}
