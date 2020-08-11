package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 ㅂ녀수에 저장해서 사용하는 것이다.
		 * - 참조형 타입니다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 * 
		 */
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//배열 초기화시 기본값이 저장된다. int타입의 경우 0, 참조형타입은 null boolean은 false 실수타입은 0  char는 공백?<== 책 참조

		array = new int[]{1, 2, 3, 4, 5};
		 
//		array = {1, 2, 3, 4, 5};
		// 선언과 초기화를 동시에 해야한다.
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		System.out.println("합계" + sum);
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] intArray;
		intArray = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		
		for(int i = 0; i < intArray.length; i++){
			intArray[i] = (int)(Math.random() *100) + 1;
		}
		System.out.println(Arrays.toString(intArray));
		//배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		sum = 0;
		for(int i = 0; i < intArray.length; i++){
			sum += intArray[i];
		}
		System.out.println("합계 : " + sum + "\n" + "평균  : " + (double)sum/intArray.length);
	
		//배열에 저장된 값을 중 최소값과 최대값을 출력해주세요.
		int max = intArray[0];
		int min = intArray[0];
			for(int j = 0; j < intArray.length; j++){
				if(min >= intArray[j]){
					min = intArray[j];
				}
				if(max <= intArray[j]){
					max = intArray[j];
				}
			}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	
		
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
	
		//배열 순서 섞기
		for(int i = 0; i < 100; i++){
			int temp = shuffle[0];
			int a = (int)(Math.random() * shuffle.length);
			shuffle[0] = shuffle[a];
			shuffle[a] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
	
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
//		int[] ranArray = new int[500];
//		for(int i = 0; i < ranArray.length; i++){
//			ranArray[i] = (int)(Math.random() * 10) + 1;
//		}	
//		
//		int count;	
//		for(int i = 1; i <= 10; i++){
//			count = 0;
//			for(int j = 0; j < ranArray.length; j++){
//				if (i == ranArray[j]){
//					count++;
//				}
//			}
//			System.out.print(i + ": " + count +"개" + "     ");
//		
		//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("최대값을 입력해주세요>");
		int max1 = Integer.parseInt(sc.nextLine());
		System.out.println("최소값을 입력해주세요>");
		int min1 = Integer.parseInt(sc.nextLine());
		System.out.println("반복횟수를 입력하세요>");
		int times = Integer.parseInt(sc.nextLine());
//		
//		int[] ranArray = new int[500];
//		for(int i = 0; i < ranArray.length; i++){
//			ranArray[i] = (int)(Math.random() * (max1-min1+1)) + min1;
//		}	
//			
//		int count;	
//		for(int i = min1; i <= max1; i++){
//			count = 0;
//			for(int j = 0; j < ranArray.length; j++){
//				if (i == ranArray[j]){
//					count++;
//				}
//			}
//			System.out.print(i + ": " + count +"개" + "     ");
//		}
		
//		int[] counts = new int[10];
//		for(int i = 1; i <= 500; i++){
//			int rannum = (int)(Math.random()* 10) +1;
//			counts[rannum - 1]++;
//		}
//		 System.out.println(Arrays.toString(counts));
			
		int[] counts = new int[max1-min1+1];
		for(int i = 1; i <= times; i++){
			int rannum = (int)(Math.random() * (max1-min1 +1)) + min1;
			counts[rannum - min1]++;  
		}
		for(int i = 0; i < counts.length; i++){
			System.out.print((i+min1) + ":" + counts[i] + "회  ");
		}
	}

}



















