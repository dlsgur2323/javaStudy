package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식){}	: 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if(조건식){} : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else{}			: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		Scanner sc = new Scanner(System.in);		
		int a = 1;

		if(a ==1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		if(a == 1){
			System.out.println("a가 1인 경우에 하고싶은 것");
		} else if(a == 2){
			System.out.println("a가 2인 경우에 하고싶은 것");
		} else if(a == 3){
			System.out.println("a가 3인 경우에 하고싶은 것");
		} else{
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		//조건을 한묶음으로 사용하기 위해서는 반드시 else if 를 사용해야 한다.
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}
		else if(a < 10){
			System.out.println("a가 20보다 작다.");
		}
		
		//시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 50;
		
		if(score >= 60){
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		//성적에 등급을 부여하는 프로그램을 작성해주세요.
		score = 50;
		String grade = null;
//		System.out.println("점수 입력>");
//		score = Integer.parseInt(sc.nextLine());
		if(score > 100 || score < 0){
			System.out.println("잘못된 점수 입력.");			
		} else {
			if(score >= 90 && score <= 100){
			grade = "A";
			} else if(score >= 80){
			grade = "B";
			} else if(score >= 70){
			grade = "C";
			} else if(score >= 60){
			grade = "D";
			} else if(score >= 50){
			grade = "E";
			} else {
			grade = "F";
			}
			System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		}
		
		score = 100;
		grade = null;
		
		if (score >= 90) {
			grade = "A";
			if (score >= 97) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 67) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else if (score >= 50) {
			grade = "E";
			if (score >= 57) {
				grade += "+";
			} else if (score <= 53) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		if (score > 100 || score < 0) {
			System.out.println("잘못된 점수");
		} else {
			System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		}
	
		/*
		 * switch문
		 * - switch(int/String){case: break;)
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		a = 1;
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		case 3:
			System.out.println("a가 3인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("a가 1,2,3이 아닌 경우에 하고싶은 것");
		}
		
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것");
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("b가 \"a\", \"b\"가 아닌 경우에 하고싶은 것");
		}
		
		//주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		switch(month){
		case 3 :
		case 4 :
		case 5 :
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월의 계절은 " + season + "입니다.");

		// 자동완성 : ctrl + space
	
		score = 95;
		grade = null;
		switch(score / 10){
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default :
			grade = "F";
			break;
		}
		System.out.println(score + "점의 등급은 " + grade + "입니다.");
		
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		int num1;
//		System.out.println("숫자를 입력하세요>");
//		num1 = Integer.parseInt(sc.nextLine());
//		switch(num1){
//		case 0:
//			System.out.println("0 입니다.");
//			break;
//		default :
//			System.out.println("0이 아닙니다.");
//		}
		
//		System.out.println(num1 == 0 ? "0 입니다." : "0이 아닙니다.");  <== 이것도 가능함.
		
		
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요/
		
//		System.out.println("숫자를 입력하세요>");
//		num1 = Integer.parseInt(sc.nextLine());
////		if(num1 % 2 == 0){
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
		
//		switch(num1 % 2){
//		case 0:
//			System.out.println("짝수입니다.");
//			break;
//		default :
//			System.out.println("홀수입니다.");
//		}
		
//		System.out.println(num1 % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.

//		System.out.println("국어>");
//		int grade1 = Integer.parseInt(sc.nextLine());
//		System.out.println("영어>");
//		int grade2 = Integer.parseInt(sc.nextLine());
//		System.out.println("수학>");
//		int grade3 = Integer.parseInt(sc.nextLine());
//		System.out.println("총점 : " + (grade1 + grade2 + grade3));
//		double avg = (double)(grade1 + grade2 + grade3) / 3;
//		avg = Math.round(avg*100) / 100.0;
//		System.out.println("평균 : " + avg);
//		if (avg >= 90) {
//			grade = "A";
//			if (avg >= 97) {
//				grade += "+";
//			} else if (avg <= 93) {
//				grade += "-";
//			}
//		} else if (avg >= 80) {
//			grade = "B";
//			if (avg >= 87) {
//				grade += "+";
//			} else if (avg <= 83) {
//				grade += "-";
//			}
//		} else if (avg >= 70) {
//			grade = "C";
//			if (avg >= 77) {
//				grade += "+";
//			} else if (avg <= 73) {
//				grade += "-";
//			}
//		} else if (avg >= 60) {
//			grade = "D";
//			if (avg >= 67) {
//				grade += "+";
//			} else if (avg <= 63) {
//				grade += "-";
//			}
//		} else if (avg >= 50) {
//			grade = "E";
//			if (avg >= 57) {
//				grade += "+";
//			} else if (avg <= 53) {
//				grade += "-";
//			}
//		} else {
//			grade = "F";
//		}
//		if (avg > 100 || avg < 0) {
//			System.out.println("잘못된 점수");
//		} else {
//			System.out.println("등급 : " + grade);
//		}
		
		// 숫자 3개를 입력받아 오름차순으로 출력해주세요.
		System.out.println("숫자1>");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자2>");
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자3>");
		int n3 = Integer.parseInt(sc.nextLine());
		if(n1 >= n2){
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if(n1 >= n3){
			int temp = n1;
			n1 = n3;
			n3 = temp;
		}
		if(n2 >= n3){
			int temp = n2;
			n2 = n3;
			n3 = temp;
		}
		System.out.println(n1 + " " + n2 + " " + n3);
	}

}










