package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 */
		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(5);
		System.out.println(returnValue);

		sc.flowTest1();
		
		System.out.println("----------------------------------");
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메소드를 호출해주세요.
		//파라미터가 있는 메소드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메소드는 리턴받은 값을 출력해주세요.
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		System.out.println(cm.method2());
		cm.method3(30);
		System.out.println(cm.method4(54, 2));
	
		System.out.println("----------구분선---------------");
		Calculator cal = new Calculator();
		
	
		System.out.println("결과 : " + cal.rem(cal.sub(cal.div(cal.multi(cal.sum(123456, 654321), 123456), 123456),654321),123456));
		
		
		/*
		 * 과제
		 * 식당 예제와 같은 어떤 대상을 잡아 클래스를 구성해주세요.
		 * 대상이 가진 속성을 변수로 만들어주세요.
		 * 매소드의 내용을 자세히 만들 필요는 없고 파라미터와 리턴타입 위주로 만들어주세요.
		 * 만들어진 클래스를 main메소드에서 사용해주세요.
		 */
	
		
	}

}































