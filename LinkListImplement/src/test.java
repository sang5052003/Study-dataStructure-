
public class test {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		for(int i = 0; i < 5; i++){
			list.addLast(i);	
		}
		System.out.println(list.toString());
		
		System.out.println(list.removeFirst());
		System.out.println(list.toString());
		
		System.out.println(list.remove(2));
		System.out.println(list.toString());
		
		System.out.println(list.indexOf(4));
		
		MyLinkedList.ListIterator iter = list.listIterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + ". ");
		}
	}
}
