//�ܹ��� ����Ʈ���� �ڿ��� k��° ���� ã��
public class Main {

	public static void findFromBack(int idx, MyList list) {

		MyList.Node firstNode = null;
		MyList.Node secondNode = null;
		
		//idx��ŭ ù��° ��带 �̵�
		int i = 0;
		for(i = 0; i < idx; i++)
		{
			firstNode = list.getNodeAt(i);
		}
		i--;
		
		//ù��° ��尡 ���ϱ���
		//�ι�° ��带 ���� ����
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
