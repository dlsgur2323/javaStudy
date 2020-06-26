package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		String oper;
		System.out.println("숫자를 입력해 주세요>");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("연산자를 입력해 주세요>");
		oper = sc.nextLine();
		System.out.println("숫자를 입력해 주세요>");
		num2 = Integer.parseInt(sc.nextLine());
		int result = oper.equals("+") ? num1 + num2 
				: oper.equals("-") ? num1 - num2 
						: oper.equals("*") ? num1 * num2 
								: oper.equals("/") ? num1 / num2 
										:num1 % num2;
		System.out.println("결과\n" + num1 + " " + oper + " " +  num2 + " = " + result);
		
	}

}
