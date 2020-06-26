package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		// 탄수화물 중독 테스트 만들기
		Scanner sc = new Scanner(System.in);
		int i = 0;

		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("밥, 빵, 과자, 햄버거 등의 음식을 먹기 시작하면 끝이 없다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("정말 배가 고프지 않더라도 먹을 때가 있다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("책상 속이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고, 일이 손에 안 잡힌다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("빵, 과자, 초콜릿 등 단 음식을 상상만 해도 먹고 싶다는 자극을 많이 받는다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못간다. (Y/N)");
		switch(sc.nextLine()){
		case "y":
			i++;
			break;
		}
		
		if(i <= 3){
			System.out.println("결과 " + i + "개 : " + "탄수화물 중독에 걸릴 위험이 있는 정도.");
		} else if(i >= 3 && i <= 6){
			System.out.println("결과 " + i + "개 : " + "탄수화물 중독 위험");
		} else {
			System.out.println("결과 " + i + "개 : " + "탄수화물 중독으로 볼 수 있음");
		}
		
		
		
	}

}
