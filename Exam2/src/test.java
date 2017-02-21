import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test {
	
	public static boolean check(String str1, String str2){ 
		
		if(str1.length() != str2.length()){
			return false;
		}
		
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
			
			if(j >= str2.length()){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean check2(String str1, String str2){
		
		if(str1.length() != str2.length()){
			return false;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] != arr2[i]){
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
			System.out.print("문자열 1번 입력 : ");
			str1 = in.next();
			
			System.out.print("문자열 2번 입력 : ");
			str2 = in.next();
			
			if(check2(str1, str2)){
				System.out.println("순열임");
			}
			else{
				System.out.println("순열 아니다");
			}
			
		}

	}
}
