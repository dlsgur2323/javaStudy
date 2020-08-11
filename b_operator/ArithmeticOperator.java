package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, --
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		System.out.println(result);
		//수학공식과 같음 ( 곱하기, 나누기가 덧셈, 뺄셈보다 우선됨)
		//나머지 연산
		result = 10 % 4;
		System.out.println(result);
		
		//5개의 연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		result = 1 + 2;
		System.out.println(result);
		result = 5 - 2;
		System.out.println(result);
		result = 10 * 3;
		System.out.println(result);
		result = 10 / 2;
		System.out.println(result);
		result = 100 % 3;
		System.out.println(result);
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		System.out.println(result);
		
		result += 3;
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		
		//result = result - 2 * 3;
		result -= 2 * 3;
		
		//result = result % 5;
		result %= 5;
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 증가시킨다.
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i; 
		i--;
		
		i = 0;
		System.out.println("++1 = " + ++i);
		i = 0;
		System.out.println("1++ = " + i++);
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
		System.out.println(result2);
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short; // int보다 작은 타입은 int로 형변환 된다.
		System.out.println(result3);
		
		//오버플로우, 언더플로우
		// 표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		//타입을 선택할 때 연산의 범위를 잘 고려해야 한다.
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		long result4 = 123456 + 654321;
		result4 *= 123456;
		result4 /= 123456;
		result4 -= 654321;
		result4 %= 123456;
		System.out.println(result4 + "이거임");
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
		int i1 = 11;
		int i2 = 21;
		int i3 = 35;
		int sum = i1 + i2 + i3;
		System.out.println(sum);
		double avg = (double)sum / 3 ;
		System.out.println(avg);
		
		//반올림
//		avg = Math.round(avg);
//		System.out.println(avg);
		avg = Math.round(avg * 10) / 10.0;
		System.out.println(avg);
		
		//랜덤 
		System.out.println((int)(Math.random() * 20) + 1); // 범위를 지정해주지 않으면 0~1 사이의 값을 불러옴 
		
	}

}















