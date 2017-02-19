public class MyArrayList {
	private int size;
	
	private Object[] elementDataArr;
	private final int maxSize;
	
	public MyArrayList() {
		this.size = 0;
		this.maxSize = 30;
		this.elementDataArr = new Object[this.maxSize]; 
	}
	
	public boolean addLast(Object element){
		this.elementDataArr[this.size++] = element;
		return true;
	}
	
	public boolean add(int idx, Object element){
		
		for(int i = this.size - 1; i >= idx; i--){
			this.elementDataArr[i + 1] = this.elementDataArr[i];
		}
		
		this.elementDataArr[idx] = element;
		this.size++;
		
		return true;
	}
	
	public boolean addFirst(Object element){
		return this.add(0, element);
	}
	
	public String toString(){
		
		String str = "";
		
		for(Object obj : this.elementDataArr){
			str += obj + ", ";
		}
		
		return str;
	}
	
	public Object remove(int idx){
		Object removed = this.elementDataArr[idx];
		
		for(int i = idx + 1; i < this.size; i++){
			this.elementDataArr[i - 1] = this.elementDataArr[i];
		}
			
		this.elementDataArr[--this.size] = null;
		
		return removed;
	}
	
	public Object removeFirst(){
		return this.remove(0);
	}
	
	public Object removeLast(){
		return this.remove(this.size - 1);
	}
	
	public Object get(int idx){
		return this.elementDataArr[idx];
	}
	
	public int getSize(){
		return this.size;
	}
	
	public int indexOf(Object o){
		
		for(int i = 0; i < this.size; i++){
			if(o.equals(this.elementDataArr[i])){
				return i;
			}
		}
		
		return -1;
	}
	
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	public class ListIterator{
		
		private int nextIdx; //현재 탐색 순서를 가르키는 인덱스
		
		public ListIterator() {
			this.nextIdx = 0;
		}
		
		public boolean hasNext(){
			return this.nextIdx < getSize();
		}
		
		public Object next(){
			return elementDataArr[this.nextIdx++];
		}
		
		public boolean hasPrevious(){
			return this.nextIdx > 0;
		}
		
		public Object previous(){
			return elementDataArr[--this.nextIdx];
		}
		
		public void add(Object element){
			MyArrayList.this.add(this.nextIdx++, element);
		}
		
		public void remove(){
			MyArrayList.this.remove(this.nextIdx - 1);
			this.nextIdx--;
		}
	}
}
