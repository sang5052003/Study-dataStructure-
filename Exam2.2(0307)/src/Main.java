//단방향 리스트에서 뒤에서 k번째 원소 찾기
public class Main {

	public static void findFromBack(int idx, MyList list) {

		MyList.Node firstNode = null;
		MyList.Node secondNode = null;
		
		//idx만큼 첫번째 노드를 이동
		int i = 0;
		for(i = 0; i < idx; i++)
		{
			firstNode = list.getNodeAt(i);
		}
		i--;
		
		//첫번째 노드가 테일까지
		//두번째 노드를 같이 돌림
		int j = 0;
		while(firstNode != list.getNodeAt(list.getSize() - 1)){
			
			firstNode = list.getNodeAt(i++);
			secondNode = list.getNodeAt(j++);
		}
		
		
		System.out.println(secondNode.toString());
	}

	public static void main(String[] args) {

		MyList list = new MyList();
		
		//1 ~ 10
		for (int i = 1; i <= 10; i++) {
			list.pushBack(i);
		}
		
		findFromBack(1, list);
		findFromBack(2, list);
		findFromBack(3, list);
		findFromBack(4, list);
		findFromBack(5, list);
	}

}
