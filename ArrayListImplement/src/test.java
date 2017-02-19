
public class test {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		
		for(int i = 0; i < 5; i++){
			list.addLast(i);
		}
		
		list.addFirst(9);
		
		list.add(2, 2000);
		
		System.out.println(list.indexOf(2000));
		
		System.out.println(list.toString());
		
		MyArrayList.ListIterator iter = list.listIterator();

		
		
		while(iter.hasNext()){
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
		while(iter.hasPrevious()){
			System.out.print(iter.previous() + ". ");
		}
		
		
		
		
		
		
	}

}
