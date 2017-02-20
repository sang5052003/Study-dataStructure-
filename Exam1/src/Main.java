import java.util.Scanner;

public class Main {

	public static boolean check(String input){
		
		char first = ' ';
		char second = ' ';
		
		for (int i = 0; i < input.length(); i++) {
			first = input.charAt(i);
			for (int j = i + 1; j < input.length(); j++) {
				second = input.charAt(j);
				if (second == first){
					return false;
				}
			}
		}
					
		return true;
	}
	
	public static void main(String[] args) {

		int testCase = 0;
		String input = "";

		Scanner in = new Scanner(System.in);

		System.out.print("test Case : ");
		testCase = in.nextInt();
		
		for(int i = 0; i < testCase; i++){
			System.out.print("문자열 입력 : ");
			input = in.next();
			if (check(input))
			{
				System.out.println("동일문자 없음");
			}
			else
			{
				System.out.println("동일문자 있다");
			}
		}
		
	}

}
