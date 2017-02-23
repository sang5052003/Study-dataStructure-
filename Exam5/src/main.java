import java.util.ArrayList;
import java.util.List;

public class main {

	//
	public static int[][] test(int[][] nArr) {
		
		int[][] rtArr = new int[nArr.length][nArr[0].length];
		
		//최초 길이 기억
		int x = 0;
		int y = nArr.length - 1;
		
		//행 열 에서 인덱스마다 변경 할 값
		int row = x;
		int column = y;
		
		//n^2 복잡..
		for(int i = 0; i < nArr.length; i++){
			for(int j = 0; j < nArr[i].length; j++){
			
				//인덱스변경해서 다른 배열에 대입
				rtArr[i + row++][j + column--] = nArr[i][j];
				
			}
			
			//한줄 내려가면 시작 대입 값 변경
			row = --x;
			column = --y;
		}
		
		return rtArr;
	}
	
	public static Object[][] test2(Object[][] objArr) {
		
		Object[][] rtArr = new Object[objArr.length][objArr[0].length];
		
		//최초 길이 기억
		int x = 0;
		int y = objArr.length - 1;
		
		//행 열 에서 인덱스마다 변경 할 값
		int row = x;
		int column = y;
		
		//n^2 복잡..
		for(int i = 0; i < objArr.length; i++){
			for(int j = 0; j < objArr[i].length; j++){
			
				//인덱스변경해서 다른 배열에 대입
				rtArr[i + row++][j + column--] = objArr[i][j];
				
			}
			
			//한줄 내려가면 시작 대입 값 변경
			row = --x;
			column = --y;
		}
		
		return rtArr;
	}

	public static void print(int[][] nArr) {

		for(int i = 0; i < nArr.length; i++){
			for(int j = 0; j < nArr[i].length; j++){
				System.out.print(nArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==========");
		System.out.println();
	}
	
	public static void print2(Object[][] objArr) {

		for(int i = 0; i < objArr.length; i++){
			for(int j = 0; j < objArr[i].length; j++){
				System.out.print(objArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==========");
		System.out.println();
	}

	public static void main(String[] args) {

		int[][] nArr1 = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
				};

		print(test(nArr1));
		
		//
		int[][] nArr2 = { 
				{  1,  2,  3,  4 },
				{  5,  6,  7,  8 },
				{  9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
				};

		print(test(nArr2));
		
		
		//
		int[][] nArr3 = { 
				{  1,  2 },
				{  3,  4 }
				};

		print(test(nArr3));
		
		
		//
		Object[][] nArr4 = { 
				{ 'a', 'b', 'c' },
				{ 'd', 'e', 'f' },
				{ 'g', 'h', 'i' }
				};

		print2(test2(nArr4));

	}

}
