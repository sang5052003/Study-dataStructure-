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
	
	public static boolean check2(String str) {

		boolean[] bArr = new boolean[256]; // ������ �ƽ�Ű �ڵ尪 üũ

		for (int i = 0; i < str.length(); i++) {

			if (bArr[((int) str.charAt(i))] == false) {
				bArr[((int) str.charAt(i))] = true;
				continue;
			}

			return false;
		}

		return true; //���Ϲ��� ����
	}
	
	public static void main(String[] args) {

		int testCase = 0;
		String input = "";

		Scanner in = new Scanner(System.in);

		System.out.print("test Case : ");
		testCase = in.nextInt();
		
		for(int i = 0; i < testCase; i++){
			System.out.print("���ڿ� �Է� : ");
			input = in.next();
			if (check2(input))
			{
				System.out.println("���Ϲ��� ����");
			}
			else
			{
				System.out.println("���Ϲ��� �ִ�");
			}
		}
		
//		for(int i = 0; i < testCase; i++){
//			System.out.print("���ڿ� �Է� : ");
//			input = in.next();
//			if (check(input))
//			{
//				System.out.println("���Ϲ��� ����");
//			}
//			else
//			{
//				System.out.println("���Ϲ��� �ִ�");
//			}
//		}
		
	}

}
