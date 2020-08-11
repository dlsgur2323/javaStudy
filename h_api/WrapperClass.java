package h_api;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * - boolean : Boolean
		 * - char	 : Character
		 * - byte	 : Byte
		 * - short	 : Short
		 * - int	 : Integer
		 * - long	 : Long
		 * - float	 : Float
		 * - double	 : Double
		 * 
		 */
		
		Integer iw = new Integer(20);
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit");
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		int parseInt = Integer.parseInt("20");
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(new Integer(10));
		list.add(10); //오토박싱 : 기본형타입이 wrapper클래스로 자동 변환
		
		
		Integer integer = list.get(0);
		int i = list.get(0); //언박싱 : wrapper클래스가 기본형타입으로 자동 변환
		
		
		
		
	}

}





















