
public class test {

	public static void main(String[] args) {
		
		//5개의 용량을 가진 순환큐(실제용량은 6이다, 더미노드를 위해)
		MyCircularQueue q = new MyCircularQueue(5); 
		
		//순차적으로 엔큐 0 ~ 5
		for(int i = 0; i < 5; i++){
			q.enQueue(i);
			System.out.println("front : " + q.getFront());
			System.out.println("rear : " + q.getRear());
		}
		System.out.println("=====");
		
		//큐의 데이터들 toString()
		System.out.println(q.toString());
		System.out.println("=====");
		
		//데큐 테스트 (용량을 넘어선)
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
		
		//용량을 넘어선 엔큐
		for (int i = 1; i < 7; i++) {
			q.enQueue(i);
			System.out.println("front : " + q.getFront());
			System.out.println("rear : " + q.getRear());
		}
		System.out.println("=====");
		
		// 큐의 데이터들 toString()
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
