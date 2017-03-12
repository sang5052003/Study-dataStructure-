
//배열을 활용한 순환큐
public class MyCircularQueue {

	private Object[] dataArr;
	private final int maxSize;
	private int front;//첫번째 인덱스
	private int rear; //마지막 데이터의 다음 인덱스
	private int size;
	
	public MyCircularQueue() {
		this.maxSize = 10;
		this.dataArr = new Object[this.maxSize + 1]; //텅빔과 꽉참의 차이 분별
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}
	
	public MyCircularQueue(int maxSize) {
		this.maxSize = maxSize;
		this.dataArr = new Object[this.maxSize + 1];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}
	
	//enqueue
	public boolean enQueue(Object data){
		
		if(isFull()){
			System.out.println("꽉참!!!");
			return false;
		}

		//full을 검출하는 구현이
		//rear - front == maxSize로 되어있기 때문에
		//front와 rear사이에는 항상 더미노드가 남아있어서(full검출이 가능하다)
		//인덱스maxSize를 써도 상관없다
		if(rear == maxSize){ //실제 용량이 maxSize + 1
			dataArr[rear] = data;
			rear = 0;
		}
		else{ //rear가 this.maxSize인덱스(마지막인데스 이후)면
			dataArr[rear++] = data;
		}
		
		size++;
		
		return true;
	}
	
	//dequeue
	public Object deQueue(){
		
		if(isEmpty()){
			System.out.println("텅빔!!!");
			return null;
		}
		
		Object rtData = null;
		
		//
		if(front == maxSize){
			rtData = dataArr[front];
			front = 0;
		}
		else{
			rtData = dataArr[front++];
		}
		this.size--;
		
		return rtData;
	}
	
	//empty
	private boolean isEmpty(){
		return (front == rear);
	}
	
	//full
	private boolean isFull(){
		
		//순환큐  진입 before상황
		if(front < rear){
			return (rear - front == maxSize);
		}
		else{// if(front >= rear)
			return (rear + 1 == front);
		}
	}
	
	//size
	public int getSize(){
		return size;
	}
	
	public int getFront(){
		return front;
	}
	
	public int getRear(){
		return rear;
	}
	
	@Override
	public String toString() {
		
		String str = "";
		
		for(int i = 0; i < dataArr.length; i++){
			str += dataArr[i] + " ";
		}
		
		return str;
	}
}
