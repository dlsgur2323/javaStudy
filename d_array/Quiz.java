package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		quiz1();//거스름돈 동전 갯수 구하기
//		quiz2();//그래프 그리기
//		quiz3();//같은 숫자는 싫어
		quiz4();//나누어 떨어지는 숫자 배열
	}

	private static void quiz4() {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		/* 
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 오름차순 정렬하여 출력해주세요. 숫자는 중복 될 수 있음.
		 * 5
		 * [5, 10, 15, 20, 25]
		 */
		int[] temp = new int[arr.length];
		int count = 0;
		int ran = (int)(Math.random()* 4)+2;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % ran == 0){
			temp[count++] = arr[i];
			}
		}
		arr = new int[count];
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp[i];
		}
		System.out.println(ran);
		System.out.println(Arrays.toString(arr));
		
		int dummy = 0;
		boolean changed = false;
		for(int j = 1; j < count -1; j++){
			for(int i = 0; i < count - j; i++){
				if(arr[i] > arr[i+1]){
					dummy = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = dummy;
					changed = true;
				}
			}
			if(!changed) break;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void quiz3() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) +1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어 주세요.
		 * [1, 3, 3, 2, 1, 4, 5, 5, 1, 3]
		 * [1, 3, 2, 4, 5]
		 */
		int[] temp = new int[arr.length];
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			boolean same = false;
			for(int j = 0; j < i; j++){
				if(temp[j] == arr[i]){
					same = true;
					break;
				}
			}
			if(!same){ //중복된 숫자가 하나도 없는 경우에만 count가 되기 때문에 temp의 주소는 count++로 할 수 있따.
				temp[count++] = arr[i];
			}
		}
		int[] del = new int[count];
		for(int i= 0; i < count; i++){
			del[i] = temp[i];
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(del));
	}

	
	
	private static void quiz2() {
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) +1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 발생된 각 숫자의 갯수만큼 *을 사용해 그래프를 그려주세요.
		 * 1 : ***3
		 * 2 : **** 4
		 * 3 : ** 2
		 */
		for(int i = 1; i < 6; i++){
			int count = 0;
			for(int j = 0; j < arr.length; j++){
				if(arr[j] == i){
					count++;
				}
			}
			System.out.print(i + " : ");
			for(int k = 1; k <= count; k++){
				System.out.print("*");
			}
			System.out.print(count + "\n");
		}
		
	}
	

	private static void quiz1() {
		int money = (int)(Math.random() * 500) *10;
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("거스름돈 : " + money);
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * ex)
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		for(int i = 0; i < coin.length; i++){
			System.out.println(coin[i] + "원 : " + money/coin[i] +"개");
			money %= coin[i];		
		}
	}
	
	
	
	
	
	
	
	
	
}









