package f_oop2;

public class AccessTest {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar); //접근제한이 없어서 어디서나 가능하다.
		am.publicMethod();
		
		System.out.println(am.protectedVar); //같은 패키지 안에 있기 때문에 가능하다.
		am.protecedMethod();
		
		System.out.println(am.defaultVar); // 같은 패키지 안에 있기 때문에 가능하다.
		am.defaultMethod();
		
//		System.out.println(am.privateVar); // 같은 클래스가 아니기 때문에 불가능하다.
//		am.privateMethod();

	}

}
