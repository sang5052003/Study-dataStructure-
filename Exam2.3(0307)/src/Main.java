import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		MyList list = new MyList();
		
		//1 ~ 10
		for(int i = 1; i <= 10; i++){
			list.pushBack(i);
		}
		
		System.out.println(list.toString());
		
		//지울노드 찾기(3)
		MyList.Node node = list.findNode(3);
		list.removeJustNode(node);
		
		System.out.println(list.toString());
		
		//7
		node = list.findNode(7);
		list.removeJustNode(node);
		
		System.out.println(list.toString());
		
	}
}
