package e_oop;

public class Static {
	/*
	 * -static을 붙이면 프로그램 실행시 메모리에 올라간다.
	 * -객체생성을 하지 않아도 사용할 수 있다.
	 * -static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * -static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메소드
	 * -static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메소드
	 */
	
	//값을 공유하기 위해 static을 붙인다.
	static int var;
	
	//유틸리티 성향의 메소드인 경우 static을 붙인다.
	// ex) math.random 쓸때 우리는 객체를 생성하지 않았다. 이처럼 자주 사용하는 메소드의 경우
	
	public static void main(String[] args) {
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		철수.saveDateMoney(200000);
		영희.saveDateMoney(200000);
		
		System.out.println("문자열 입력>");
		String str = ScanUtil.nextLine();
		System.out.println(str);
		
		System.out.println("숫자 입력>");
		int num = ScanUtil.nextInt();
		System.out.println(num);
	}
	
	
	
}

class Human{
	
	int account;
	
	void saveMoney(int money){
		account += money;
		System.out.println("통장잔고 : " + account);
	}
	
	static int dateAccount;
	
	void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount);
	}
	
	
}


























