import java.util.Random;

//비정렬 리스트에서 중복문자 제거하기
public class Main {

	public static void remove(MyList list){
		
		char c = ' ';
		int j = 0;
		for(int i = 0; i < list.getSize(); i++){
			c = (char)(list.getNodeAt(i).getData());
			for(j = 1 + i; j < list.getSize(); j++){
				if(c == (char)(list.getNodeAt(j).getData())){
					list.removeAt(j); //지운다
					break;
				}
			}
			
			if(j < list.getSize()){ //다 못돌았으면
				break;
			}
		}
		
		//System.out.println(list.toString());
		
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		MyList list = new MyList();
		
		
		list.pushBack('a');
		list.pushBack('b');
		list.pushBack('c');
		list.pushBack('d');
		list.pushBack('e');
		list.pushBack('f');
		list.pushBack('a');
		
		
	
		Random rand = new Random();
		int idx1 = 0;
		int idx2 = 0;
		for(int i = 0; i < list.getSize(); i++){
			idx1 = rand.nextInt(list.getSize());
			idx2 = rand.nextInt(list.getSize());
			list.swap(list.getNodeAt(idx1), list.getNodeAt(idx2));
		}
		
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.getNodeAt(i).toString() + " ");
		}
		System.out.println();
		
		
		//중복제거..
		remove(list);
		
		

	}

}
