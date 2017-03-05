
public class Main {
	public static void main(String[] args) {

		MyList list = new MyList();
		for(int i = 0; i < 3; i++){
			list.pushBack(i);
		}
		
		for(int i = 0; i < 3; i++){
			list.pushFront(i + 10);
		}
		
		System.out.println(list.getSize());
		for(int i = 0; i < list.getSize(); i++){
			System.out.println(list.getNodeAt(i).toString());
		}
		
		list.removeFront();
		for(int i = 0; i < list.getSize(); i++){
			System.out.println(list.getNodeAt(i).toString());
		}
		
		list.removeBack();
		for(int i = 0; i < list.getSize(); i++){
			System.out.println(list.getNodeAt(i).toString());
		}
		
		list.removeAt(2);
		for(int i = 0; i < list.getSize(); i++){
			System.out.println(list.getNodeAt(i).toString());
		}
		
		
	}
}
