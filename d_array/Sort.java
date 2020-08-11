package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 정렬
		 * - 석차 구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()* 100) +1 ;
			
		}
		System.out.println(Arrays.toString(arr));
//		printRank(arr);//석차구하기 //컨트롤+1 + 엔터 누르면 만들어진다.
//		selectSort(arr);//선택정렬
//		bubbleSort(arr);//버블정렬
		insertSort(arr);//삽입정렬
		System.out.println(Arrays.toString(arr));
	}

	private static void insertSort(int[] arr) {
		//두번째 숫자부터 앞에 있는 모든 숫자들과 비교해서 큰수는 한칸씩 뒤로 밀고 빈공간에 남은 수를 삽입
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = 0;
			for(j = i-1; j >= 0; j--){
				if(arr[j] > temp){
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = temp;  //위의 for문이 한번 끝나면 j-- 된게 그대로 간다. 그래서 결국 여기서의 j는 -1이다.
		}
	}

	private static void bubbleSort(int[] arr) {
		//큰 수를 뒤로 보낼거다. 순서대로 붙어있는 두개의 숫자를 비교하여 서로 자리를 바꿔준다.
		for(int i = 1; i < arr.length; i++){
			int temp = 0;
			for(int j = 0; j < arr.length-i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(temp == 0) break;
			System.out.println(i + "회차");
		}
	}

	private static void selectSort(int[] arr) {
		//오름차순으로 정렬을 할거에요 (작은수부터 큰수로~ 단, if 문 밖에서 순서를 바꿔주도록!)
		for(int i = 0; i < arr.length -1; i++){
			int min = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	private static void printRank(int[] arr) {
		int[] rank = new int[arr.length];
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]) rank[i]++;
			}
		}
		for(int i = 0; i < rank.length; i++){
		System.out.println(rank[i] + "등 : " + arr[i] + "점");
		}
	}
	
	
}










