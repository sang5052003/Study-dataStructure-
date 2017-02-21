import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static String test(String str){
		
		char[] charArr = str.toCharArray();
		
		//길이, 숫자 구하기
		int lastIdx = charArr.length - 1;
		char c = charArr[lastIdx];
		List<Character> list = new ArrayList<>();
		while(c != ','){
			list.add(c);
			c = charArr[--lastIdx];
		}
		
		//길이뒤집기
		String s = "";
		for(int i = list.size() - 1; i >= 0 ; i--){
			 s += list.get(i).toString();
		}
		int len = Integer.parseInt(s);
		
		//공백 인덱스 치환
		list.clear();
		for(int i = 0; i < len; i++){
			c = charArr[i];
			if(c == ' '){
				list.add('%');
				list.add('2');
				list.add('0');
			}
			else{
				
				list.add(c);
			}
		}
		
		//문자열로
		s = "";
		for(int i = 0; i < list.size(); i++){
			s += list.get(i);
		}
		
		return s;
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str = "mr john smith  ,13";
		
		System.out.println(test(str));
	}

}
