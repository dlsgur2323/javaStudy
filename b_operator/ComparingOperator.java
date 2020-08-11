package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교 : equals()
		 */
		
		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean 이다.
		System.out.println(b);
		b = 10 <= 20 -15; //산술연산 후 비교연산을 수행한다.
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "123";
		b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다.
		System.out.println(b);
		
		//string의 내용을 비교하기 위헤서는 equals()메소드를 사용한다.
		
		b = str1.equals(str2);
		System.out.println(b);
		b = !str1.equals(str2);
		System.out.println(b);
		
		// int 타입의 x와 y 변수를 만들고, 다음의 문장들을 코드로 작성해주세요.
		int x = 6;
		int y = 2;
		// 1. x가 y보다 크다.
		System.out.println("구분선");
		boolean _b = x > y;
		System.out.println(_b);
		// 2. x는 y 보다 작거나 같다.
		_b = x <= y;
		System.out.println(_b);
		// 3. x + 5 와 y는 같다.
		_b = x + 5 == y;
		System.out.println(_b);
		// 4. x는 3의 배수이다.
		_b = (x % 3) == 0;
		System.out.println(_b);
		// 5. y는 홀수이다.
		_b = y % 2 == 1;
		System.out.println(_b);
		// 6. x와 3y는 다르다.
		_b = x != 3 * y;
		System.out.println(_b);
		// 7. "병수"와 "데이터"는 같다.
		_b = "병수".equals("데이터");
		System.out.println(_b);
		// 8. "기본형"과 "참조형"은 다르다.
		_b = !"기본형".equals("참조형");
		System.out.println(_b);
	}

}







