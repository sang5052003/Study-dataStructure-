
public class Main {

	public static int[] bubbleSortImproved(int[] arr){
		int len = arr.length;
		boolean swapped = true;
		for(int i = len - 1; i >= 0 && swapped; i--){
			swapped = false;
			for(int j = 0; j < i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
		}
		
		return arr;
	}
	
	//최소값을 구해서 정렬
	public static int[] selectionSort(int[] arr){
		
		int min, i, j, len = arr.length;
		for(i = 0; i < len - 1; i++){ 	  //마지막 이전 인덱스까지(아래에서 j = i + 1 이므로)
			min = i;
			for(j = i + 1; j < len; j++){ //마지막 인덱스까지
				//최소 인덱스 검출
				if(arr[min] > arr[j]){ //현재 min보다 더 작으면
					min = j;
				}
			}
			//현재 항목과 최소값을 스왑
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}
	
	//
	public static int[] insertSort(int[] arr){
		
		int i, j, value, len = arr.length;
		for(i = 1; i < len; i++){
			
			//뒤의 값이 앞의값보다 크거나 같으면(정렬되 있으면) 진행
			if(arr[i] >= arr[i - 1]){
				continue;
			}
			
			//뒤에있는 작은 값을 뽑아낸다
			value = arr[i];
			
			for(j = i; j >= 1; j--){
				
				//뽑아낸 값보다 작은값 발견하면 break
				if(arr[j-1] < value){
					break;
				}
				
				arr[j] = arr[j-1]; //한 칸 뒤로
			}
			arr[j] = value; //뽑아낸 값 삽입
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {6, 3, 7, 2, 5, 1, 9, 4, 8};
		arr = bubbleSortImproved(arr);
		for(int n : arr){
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.println("==================");
		
		
		int[] arr2 = {6, 3, 7, 2, 5, 1, 9, 4, 8};
		arr2 = selectionSort(arr2);
		for(int n : arr2){
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.println("==================");
		
		int[] arr3 = {6, 3, 7, 2, 5, 1, 9, 4, 8};
		arr3 = insertSort(arr3);
		for(int n : arr3){
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.println("==================");

	}

}
