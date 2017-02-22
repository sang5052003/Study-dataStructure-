import java.util.ArrayList;
import java.util.List;

public class main {

	public static String test(String str){
		
		char[] charArr = str.toCharArray();
		
		String rt = "";
		int i = 0;
		int num = 1;
		for(i = 1; i < charArr.length; i++){
			
			if(charArr[i - 1] != charArr[i]){

				//System.out.println(charArr[i - 1]);
				rt += charArr[i - 1];
				rt += num;
				num = 1;

			}
			else{
				//System.out.println(num);
				num++;
			}
		}
		rt += charArr[i - 1];
		rt += num;
		
		System.out.println("길이 비교 전 " + rt);
		if(rt.length() >= str.length()){
			rt = str;
		}
		
		return rt;
	}
	
	public static void main(String[] args) {
		
		String str = "aabccccccccaaa";
		System.out.println("길이 비교 후 " + test(str) + "\n");
		
		str = "abcaa";
		System.out.println("길이 비교 후 " + test(str) + "\n");
		
		str = "ffffffa";
		System.out.println("길이 비교 후 " + test(str) + "\n");
		
		str = "bfffffaaaaa";
		System.out.println("길이 비교 후 " + test(str) + "\n");

	}

}
