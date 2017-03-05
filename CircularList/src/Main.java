import java.util.Scanner;

public class Main {
	
	public void task(int n, int m){
		
		int idxM = m - 1;
		
		MyList list = new MyList();
		
		for(int i = 1; i <= n; i++){
			list.pushBack(i);	
		}
		//System.out.println(list.toString());
		
		int count = 0;
		MyList.Node node = null;
		int nodeIdx = 0;
		int len = list.getSize();
		System.out.print("<");
		while(len != count){
			node = list.getNodeAtWith(nodeIdx, idxM);
			System.out.print(node.toString());
			if(count < len - 1){
				System.out.print(", ");
			}
			nodeIdx = list.findNodeIdx(node.getData());
			list.removeAtWith(nodeIdx);
			
			count++;
		}
		System.out.println(">");
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		Main main = new Main();
		
		main.task(n, m);
	}
	
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

				this.head.next = this.tail;
				this.tail.next = this.head;

			} else {

				Node head = this.head;
				this.tail.next = newNode;
				this.tail = newNode;
				newNode.next = head;
				this.head = head;
			}

			this.size++;
		}

		public Node getNodeAt(int idx) {

			if (this.head == null || idx < 0)
				return null;

			int curIdx = idx;

			Node curNode = this.head;
			while ((curIdx--) > 0 && curNode != this.tail) {
				curNode = curNode.next;
			}

			if (curNode == this.head && idx != 0) {
				return null;
			}

			if (curNode == this.tail && idx != this.size - 1) {
				return null;
			}

			return curNode;
		}

		//
		public Node getNodeAtWith(int idx) {

			if (this.head == null || idx < 0)
				return null;

			int curIdx = idx;

			Node curNode = this.head;
			while ((curIdx--) > 0) {
				curNode = curNode.next;
			}

			return curNode;
		}
		
		//
		public Node getNodeAtWith(int start, int idx) {

			if (this.head == null || idx < 0)
				return null;

			int curIdx = idx;

			Node curNode = this.head;
			for(int i = 0; i < start; i++){
				curNode = curNode.next;
				//System.out.println("start");
			}
			
			while ((curIdx--) > 0) {
				curNode = curNode.next;
				//System.out.println(curIdx);
			}

			return curNode;
		}
		
		public int findNodeIdx(Object data){
			
			int idx = 0;
			
			Node curNode = this.head;
			while(curNode != this.tail){
				
				if(curNode.data.equals(data)){
					break;
				}
				idx++;
				curNode = curNode.next;
				//System.out.println("idx " + idx);
			}
			
			return idx;
		}

		public void removeAtWith(int idx) {

			if (idx < 0)
				return;

			Node delNode = this.getNodeAtWith(idx);
			if (delNode == null)
				return;

			if (delNode == this.head) {
				this.removeFront();
			} else if (delNode == this.tail) {
				this.removeBack();
			} else {
				Node prev = this.getNodeAtWith(idx - 1);
				prev.next = delNode.next;
				delNode = null;
			}
			this.size--;
		}

		public void insertAfterAt(int idx, Object data) {

			Node newNode = this.createNode(data);

			Node prev = this.getNodeAt(idx);

			if (prev == this.tail) {
				this.pushBack(data);
				newNode = null;
				return;
			}

			newNode.next = prev.next;
			prev.next = newNode;

			this.size++;
		}

		private Node findNode(Object data) {

			Node curNode = this.head;
			while (curNode != null && curNode != this.tail) {

				if (curNode.data.equals(data)) {
					break;
				}

				curNode = curNode.next;
			}

			if (curNode == this.tail) {
				if (!curNode.data.equals(data)) {
					return null;
				}
			}

			return curNode;
		}

		public void insertAfter(Object prevData, Object data) {

			Node newNode = this.createNode(data);

			Node prevNode = this.findNode(prevData);
			if (prevNode != null) {

				if (prevNode == this.tail) {
					this.pushBack(data);
					newNode = null;
					return;
				}

				newNode.next = prevNode.next;
				prevNode.next = newNode;

				this.size++;
			}
		}

		public void removeBack() {

			if (this.tail == null)
				return;

			if (this.tail == this.head) {
				this.head = null;
				this.tail = null;
				this.size = 0;
				return;
			}

			Node curNode = this.head;
			while (curNode.next != this.tail) {
				curNode = curNode.next;
			}

			Node oldTail = this.tail;
			curNode.next = this.head;
			this.tail = curNode;
			oldTail = null;

			this.size--;
		}

		public void removeFront() {

			if (this.head == null)
				return;

			if (this.tail == this.head) {
				this.head = null;
				this.tail = null;
				this.size = 0;
				return;
			}

			Node oldHead = this.head;
			this.tail.next = oldHead.next;
			this.head = this.tail.next;
			oldHead = null;

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

		public String toString() {

			String s = "";
			for (int i = 0; i < this.size; i++) {
				s += this.getNodeAt(i).toString() + " ";
			}

			return s;
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
}
