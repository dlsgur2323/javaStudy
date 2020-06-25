package a_variable;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		//클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
		
		//한줄 주석 : ctrl + shift + c
//		한줄 주석
//		한줄 주석
//		한줄 주석
//		한줄 주석
		/*범위 주석 : ctrl + shift + /(해제 : \)*/
		/*범위주석
		 * ㅇㅁㅈㅇㅁㅈ
		 * ㅇㅈㅁㅇ
		 */
		/*
		 * 데이터의 종류
		 *  - 정수 : 10, -5
		 *  - 실수 : 3.14, -1.5
		 *  - 문자 : 'a', '3'
		 *  - 논리 : true, false
		 *  
		 *  프로그래밍 언어의 기준으로 데이터의 종류를 나눠 놓은것 : 자료형 (data type)
		 *  
		 *  기본형 타입
		 *  - 정수 : byte(1), short(2) int(4), long(8)
		 *  - 실수 : float(4), double(8)
		 *  - 문자 : char(2)
		 *  - 논리 : boolean(1)
		 *  
		 *  변수를 만들때 타입을 사용한다.
		 *  데이터를 다룰때 일반적으로 변수라는 그릇에 담아서 사용한다.
		 */
		
		//변수 : 하나의 데이터를 담을 수 있는 그릇
		int name; // 변수 선언 : 변수를 만드는 것
		double name2; //한 블럭 안에서 변수의 이름은 중복될 수 없다.
		// 다른 블럭 안에서는 같은 이름을 사용할 수 있다. (블럭 = 중괄호{})
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		name = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		name2 = 2.5; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30; //보통 선언과 초기화를 동시에 한다.
		long l = 40L; //접미사 L을 뒤에 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.
		char c = '한'; // 따옴표안에 한글자만 넣어야 한다. (여러글자는 "문자열")
		boolean b = true; //true, false
		
		// 8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		byte B = 3;
		short S = 5;
		int I = 56;
		long L = 507L;
		float F = 1.3f;
		double D = 43.56;
		char C = '오';
		boolean Bo = false;
		
		System.out.println(name);
		//실행 단축키 : ctrl + f11
		
		name = 100;
		System.out.println(name);
		
		//위에서 만든 8개의 변수에 새로운 값을 저장하고 출력해주세요.
		B = 11;
		System.out.println(B);
		S = 22;
		System.out.println(S);
		I = 333;
		System.out.println(I);
		L = 4444L;
		System.out.println(L);
		F = 5.5f;
		System.out.println(F);
		D = 66.66;
		System.out.println(D);
		C = 'A';
		System.out.println(C);
		Bo = true;		
		System.out.println(Bo);
		
		/*
		 * 타입의 선택 기준
		 * 
		 * 정수
		 *  - byte, short : 메모리를 절약해야 할때   (byte : +_128, short +_30000 정도   *실제 실험결과 byte : 127까지 shor : 32767)
		 *  - int : 기본 (컴퓨터는 기본 4byte로 계산하기 때문에 가장 빠르고 적당함.) (int +_20억)
		 *  - long : int의 범위를 벗어날 때 (900경?)
		 *  
		 *  실수 (정확한 값이 아닌 근사값을 저장함)
		 *  - float : 메모리를 절약해야 할때 (앞에서부터 7자리의 숫자까지 정확함)
		 *  - double : 기본 (15자리까지 정확함)
		 */
		
		//문자열 ('' : 문자, " " : 문자열)
		String str = "문자 여러개...";
		System.out.println(str);
		
		//형변환 (타입변경)
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환(type casting)이라 한다.
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		big = small; //표현범위가 작은 쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
		
		/*
		 * 명명규칙
		 * - 영문 & 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다. (자바에서 사용하는 특별한 단어, 진한글씨)
		 * - [낙타식 표기법을 사용한다.(mySmapleVariable)]
		 * - [클래스명의 첫글자는 대문자로 한다. (MySampleClass)]
		 */
		
		/*
		 * 상수
		 * - 처음 담긴 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 * - 상수임을 알리기 위해 일반적으로 이름을 대문자로만 적어준다.
		 * - 단어 사이 구분을 '_' 로 한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; //컴파일 에러 발생
		
		//출력
		System.out.print("줄바꿈을 하지 않는다.");
		System.out.print("줄바꿈을 하지 않는다.\n");
		System.out.println("줄바꿈을\t한다." + name);
		System.out.printf("문자열 : %s, 숫자 : %d\n", "Hello", 10); //출력 포맷을 지정한다.
		System.out.println("" + C + (100 + 100));
		System.out.println("문자열" + C + name);
		String _char = "B";
		System.out.println(_char + name);
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		//import 단축키 : ctrl + shift + o 
//		System.out.println("아무거나 입력해주세요>");
//		String str2 = sc.nextLine();
//		System.out.println(str2);
		//입력을 받게되면 사용자가 입력 할 때까지 프로그램이 멈추게 된다.
		//내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.
		
//		int nextInt = sc.nextInt();
//		double nextDouble = sc.nextDouble();
		//이런것도 사용할 수 있지만 버그로 인해 사용하지 않는다.
		
//		System.out.println("int 입력>");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!");
		// 위 처럼 하면 버그가 발생
		
//		System.out.println("int 입력>");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.println(number);
		//위 처럼 해야 버그가 발생하지 않음
		
		//자신의 이름을 저장할 변수를 선언해주세요.
		String myName;
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
		System.out.println("이름을 입력해주세요>");
		myName = sc.nextLine();
		System.out.println(myName);
		//자신의 나이를 저장할 변수를 선언해주세요.
		int myAge;
		
		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
		System.out.println("나이를 입력해주세요>");
		myAge = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름 : " + myName + " / 나이 : " + myAge);
		
	}

}
