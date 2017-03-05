
public class Excute {
	public static void main(String[] args) {
		
		MyListOrigin list = new MyListOrigin();
		
		System.out.println("size : " + list.getSize());
		
		for(int i = 0; i < 3; i++){
			list.pushBack(i);
		}
		
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		list.insertAfterAt(1, 100);
		
		list.insertAfter(100, 1000);
		
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		list.removeBack();
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		list.removeFront();
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		list.removeAt(3);
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		//
		System.out.println("============");
		list.removeFront();
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		list.removeFront();
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		list.removeFront();
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		list.removeFront();
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
	}
}
