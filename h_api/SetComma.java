package h_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여주세요.
		//1,000,000
		System.out.println("숫자를 입력하세요>");
		String num = ScanUtil.nextLine();
		
		String result ="";
		for(int i = 0; i < num.length(); i++){
			if(((num.length()-1) - i) %3 == 0 && i != num.length()-1){
				result += num.charAt(i) + ",";
			} else {
				result += num.charAt(i);
			}
		}
		System.out.println(result);
		
		// 선생님은 (num.length()-1) - i) 대신에 count를 쓰셨다.
	}

}










