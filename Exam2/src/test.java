import java.util.Scanner;

public class test {
	
	public static boolean check(String str1, String str2){ 
		
		int i, j = 0;
		char char1 = ' ';
		char char2 = ' ';
		for(i = 0; i < str1.length(); i++){
			char1 = str1.charAt(i);
			for(j = 0; j < str2.length(); j++){
				char2 = str2.charAt(j);
				if(char1 == char2){
					break;
				}
			}
			
			if(j > str2.length()){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		int testCase = 0;
		String str1 = "";
		String str2 = "";

		Scanner in = new Scanner(System.in);

		System.out.print("test Case : ");
		testCase = in.nextInt();

		for (int i = 0; i < testCase; i++) {
			System.out.print("���ڿ� 1�� �Է� : ");
			str1 = in.next();
			
			System.out.print("���ڿ� 2�� �Է� : ");
			str2 = in.next();
			
			if(check(str1, str2)){
				System.out.println("������");
			}
			else{
				System.out.println("���� �ƴϴ�");
			}
			
		}

	}
}