
//�迭�� Ȱ���� ��ȯť
public class MyCircularQueue {

	private Object[] dataArr;
	private final int maxSize;
	private int front;//ù��° �ε���
	private int rear; //������ �������� ���� �ε���
	private int size;
	
	public MyCircularQueue() {
		this.maxSize = 10;
		this.dataArr = new Object[this.maxSize + 1]; //�ֺ��� ������ ���� �к�
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
			System.out.println("����!!!");
			return false;
		}

		//full�� �����ϴ� ������
		//rear - front == maxSize�� �Ǿ��ֱ� ������
		//front�� rear���̿��� �׻� ���̳�尡 �����־(full������ �����ϴ�)
		//�ε���maxSize�� �ᵵ �������
		if(rear == maxSize){ //���� �뷮�� maxSize + 1
			dataArr[rear] = data;
			rear = 0;
		}
		else{ //rear�� this.maxSize�ε���(�������ε��� ����)��
			dataArr[rear++] = data;
		}
		
		size++;
		
		return true;
	}
	
	//dequeue
	public Object deQueue(){
		
		if(isEmpty()){
			System.out.println("�ֺ�!!!");
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
		
		//��ȯť  ���� before��Ȳ
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
