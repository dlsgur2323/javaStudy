package home_study;

import java.util.Arrays;

public class a_test {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 2~5의 중에 랜덤한 숫자 하나를 뽑는다.
		// 뽑은 숫자로 arr의 각 숫자가 나누어 떨어지는 값을 담은 배열을 만들고 오름차순으로 정렬 
		int ran = (int)(Math.random()*4)+2;
		int count = 0;
		int[] temp = new int[arr.length];
		System.out.println(ran);
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % ran == 0){
				temp[count++] = arr[i];
			}
		}
		
		int[] result = new int[count];
		for(int i = 0; i < count; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		
		
		int dummy;
		boolean changed = false;
		for(int j = 1; j < result.length -1; j++){
			for(int i = 0; i < result.length -j; i++){
				if(result[i] > result[i+1]){
					dummy = result[i+1];
					result[i+1] = result[i];
					result[i] = dummy;
					changed = true;
				}
			}
			if(!changed) break;
		}
		System.out.println(Arrays.toString(result));
		
		//end of main
	}

}
