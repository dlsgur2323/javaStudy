package i_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * boolean add(Object obj)			: 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * Object set(int index, object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.(수정/덮어쓰기)
		 * Object get(int inedx) : 지정된 위치의 객체를 반환한다.
		 * int size() : 저장된 객체의 수를 반환한다.
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList();
		sample.add("abc");
		sample.add(100);
		
		sample.add(new Scanner(System.in));
		
		//제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다.
		//따라서 제네릭의 사용이 권장된다.
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
//		list.add("abc");
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1, 40); //1번 인덱스부터 뒤로 밀고 값을 저장한다.
		System.out.println(list);
		
//		list.add(7, 50); //현재 있는 인덱스 순서를 건너뛰고 없는 공간에 넣으려 하면 예외가 발생한다.
		
		Integer before = list.set(2, 50); //2번 인덱스의 값을 저장하고 기존 값을 반환한다.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		list.get(2);
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
//		for(int i = 0; i< list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			
//			list.remove(i);
//		}
		//값을 제거할때는 뒤에서부터 제거해야 한다.
		for(int i = list.size()-1 ; i >= 0; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
	
		}
		System.out.println(list);
		
		//list에 1부터 100까지 랜덤값 10개 지정해주세요.
		for(int i = 0; i < 10; i++){
			list.add((int)(Math.random()*100) +1);
		}
		System.out.println(list);
		
		//list에 저장된 값을 합계와 평균을 구해주세요.
		int sum =0;
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		System.out.println("합계 : " + sum + " / 평균 : " + (double)sum/list.size());
		
		//list에서 최소값과 최대값을 구해주세요.
		int min = 0;
		int max = 0;
		for(int j = 1; j < list.size(); j++){
			if(list.get(min) > list.get(j)){
				min = j;
			}
			if(list.get(max) < list.get(j)){
				max = j;
			}
		}
		System.out.println("최소값 : " + list.get(min) + " / 최대값 : " + list.get(max));
		
		//list를 오름차순으로 정렬해주세요.
		//최소값을 찾아서 맨앞으로 (선택정렬?)
//		for(int i = 0; i < list.size()-1; i++){
//			min = i;
//			for(int j = i+1; j < list.size(); j++){
//				if(list.get(min) > list.get(j)){
//					min = j;
//				}
//			}
//			list.set(min, list.set(i, list.get(min)));
//		}
		
//		System.out.println(list);
		//삽입정렬
		for(int i = 1; i < list.size(); i++){
			int temp = list.get(i);
			int j = 0;
			for(j = i-1; j>=0; j--){
				if(temp < list.get(j)){
					list.set(j + 1, list.get(j));
				} else {
					break;
				}
			}
			list.set(j + 1, temp);
		}
		System.out.println(list);
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list2.add(list);
		list.add(40);
		list.add(50);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> li = list2.get(i);
			for(int j = 0; j < li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		Integer integer2 = list2.get(0).get(1);
		System.out.println(integer2);
	}

}
















