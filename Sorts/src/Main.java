
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
	
	//�ּҰ��� ���ؼ� ����
	public static int[] selectionSort(int[] arr){
		
		int min, i, j, len = arr.length;
		for(i = 0; i < len - 1; i++){ 	  //������ ���� �ε�������(�Ʒ����� j = i + 1 �̹Ƿ�)
			min = i;
			for(j = i + 1; j < len; j++){ //������ �ε�������
				//�ּ� �ε��� ����
				if(arr[min] > arr[j]){ //���� min���� �� ������
					min = j;
				}
			}
			//���� �׸�� �ּҰ��� ����
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
			
			//���� ���� ���ǰ����� ũ�ų� ������(���ĵ� ������) ����
			if(arr[i] >= arr[i - 1]){
				continue;
			}
			
			//�ڿ��ִ� ���� ���� �̾Ƴ���
			value = arr[i];
			
			for(j = i; j >= 1; j--){
				
				//�̾Ƴ� ������ ������ �߰��ϸ� break
				if(arr[j-1] < value){
					break;
				}
				
				arr[j] = arr[j-1]; //�� ĭ �ڷ�
			}
			arr[j] = value; //�̾Ƴ� �� ����
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
