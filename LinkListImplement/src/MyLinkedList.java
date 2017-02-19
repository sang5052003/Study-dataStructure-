
public class MyLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public MyLinkedList() {
		this.size = 0;
	}
	
	private class Node{
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString(){
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input){
		Node newNode = new Node(input);
		newNode.next = this.head;
		this.head = newNode;
		this.size++;
		if(this.head.next == null){
			this.tail = this.head;
		}
	}
	
	public void addLast(Object input){
		Node newNode = new Node(input);
		if(this.size == 0){
			this.addFirst(input);
		}
		else{
			this.tail.next = newNode;
			this.tail = newNode;
			this.size++;
		}
	}
	
	private Node getNodeAt(int idx){
		Node x = this.head;
		for(int i = 0; i < idx; i++){
			x = x.next;
		}
		return x;
	}
	
	public void add(int idx, Object input){
		if(idx == 0){
			this.addFirst(input);
		}
		else{
			Node newNode = new Node(input);
			//넣을 인덱스의 이전 노드
			Node temp1 = this.getNodeAt(idx - 1);
			newNode.next = temp1.next;
			temp1.next = newNode;
			this.size++;
			if(newNode.next == null){
				this.tail = newNode;
			}
		}
	}
	
	public String toString(){
		String str = "[]";
		
		if(this.head != null){
			str = "";
			Node curNode = this.head;
			while(curNode != null){
				str += curNode.data + ", ";
				curNode = curNode.next;
			}
		}
		
		return str;
	}
	
	public Object removeFirst(){
		Node temp = this.head;
		this.head = temp.next;
		Object rtData = temp.data;
		temp = null;
		size--;
		return rtData;
	}
	
	public Object remove(int idx){
		if(idx == 0) return this.removeFirst();
		
		Node prev = this.getNodeAt(idx - 1);
		Node delete = prev.next;
		
		prev.next = delete.next;
		
		Object rtData = delete.data;
		if(delete == this.tail){
			this.tail = prev;
		}
		delete = null;
		this.size--;
		return rtData;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public Object getDataAt(int idx){
		return this.getNodeAt(idx).data;
	}
	
	public int indexOf(Object data){
		Node curNode = this.head;
		int idx = 0;
		
		while(!curNode.data.equals(data)){
			curNode = curNode.next;
			idx++;
			
			if(curNode == null) return -1;
		}
		
		return idx;
	}
	
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	public class ListIterator{
		
		private Node lastReturned;
		private Node next;
		private int nextIdx;
		
		public ListIterator() {
			this.next = head;
			this.nextIdx = 0;
		}
		
		public Object next(){
			this.lastReturned = this.next;
			this.next = this.next.next;
			this.nextIdx++;
			return this.lastReturned.data;
		}
		
		public boolean hasNext(){
			return this.nextIdx < getSize();
		}
		
		public void add(Object input){
			Node newNode = new Node(input);
			
			//iter가 최초
			if(this.lastReturned == null){
				head = newNode;
				newNode.next = this.next;
			}
			else{
				this.lastReturned.next = newNode;
				newNode.next = this.next;
			}
				
			this.lastReturned = newNode;
			this.nextIdx++;
			size++;
		}
		
		public void remove(){
			if(nextIdx == 0){
				throw new IllegalStateException();
			}
			
			MyLinkedList.this.remove(this.nextIdx - 1);
			this.nextIdx--;
		}
	}
}
