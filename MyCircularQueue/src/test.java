
public class test {

	public static void main(String[] args) {
		
		//5���� �뷮�� ���� ��ȯť(�����뷮�� 6�̴�, ���̳�带 ����)
		MyCircularQueue q = new MyCircularQueue(5); 
		
		//���������� ��ť 0 ~ 5
		for(int i = 0; i < 5; i++){
			q.enQueue(i);
			System.out.println("front : " + q.getFront());
			System.out.println("rear : " + q.getRear());
		}
		System.out.println("=====");
		
		//ť�� �����͵� toString()
		System.out.println(q.toString());
		System.out.println("=====");
		
		//��ť �׽�Ʈ (�뷮�� �Ѿ)
		for(int i = 0; i < 10; i++){
			System.out.println("dequeue : " + q.deQueue());
			System.out.println("front : " + q.getFront());
			System.out.println("rear : " + q.getRear());
		}
		System.out.println("=====");
		
		q.enQueue(0);
		System.out.println("front : " + q.getFront());
		System.out.println("rear : " + q.getRear());
		System.out.println("=====");
		
		//�뷮�� �Ѿ ��ť
		for (int i = 1; i < 7; i++) {
			q.enQueue(i);
			System.out.println("front : " + q.getFront());
			System.out.println("rear : " + q.getRear());
		}
		System.out.println("=====");
		
		// ť�� �����͵� toString()
		System.out.println(q.toString());
		System.out.println("=====");
		
		System.out.println("dequeue : " + q.deQueue());
		System.out.println("front : " + q.getFront());
		System.out.println("rear : " + q.getRear());
		System.out.println("=====");
		
		System.out.println("dequeue : " + q.deQueue());
		System.out.println("front : " + q.getFront());
		System.out.println("rear : " + q.getRear());
		System.out.println("=====");
		
		
	}

}
