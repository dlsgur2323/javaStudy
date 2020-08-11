package e_oop;

public class TV {

	//채널을 변수로 만든다.
	//tv를 껐다 켰다도 변수로 만든다.
	//음량조절도 변수로 만든다.
	boolean power; //전원
	int channel; //채널
	int volume; //음량
	
	//각 변수들을 변경하는 메소드가 필요하다.
	//전원 : 누르면 켜지고 누르면 꺼지고
	//불린값이 true면 켜지고 false면 꺼지고 ==> on => power true, off => power false
	// str 값을 계속 넥스트 라인으로 받는다?
	{
		power = false;
		channel = 1;
		volume = 1;
	}
	void power(String str){
		if(str.equals("on") && power == false){
			power = true;
			System.out.println("Power On");
		} else if(str.equals("off")){
			power = false;
			System.out.println("Power Off");
		}
	}
	
	// int타입 숫자가 입력되면 channel 값을 newch로 변경
	void channel(int newch){
		if(newch <=100 && newch >= 1){
			channel = newch;
			System.out.println("ch." + channel);
		} else {
			System.out.println("올바르지 않은 채널");
		}
	}
	// >, < 입력시 채널 하나씩 증감
	void channel(String ch){
		if(ch.equals(">") || ch.equals("<")){
			if(ch.equals(">")){
				if(channel == 100){
					channel = 1;
				} else {
					channel++; 			
				}
			} else if(ch.equals("<")){
				if(channel == 1){
					channel = 100;
				} else {
					channel--;			
				}
			}
			System.out.println("ch." + channel);
		}	
	}
	void volume(String vo){
		if(vo.equals("+") || vo.equals("-")){
			if(vo.equals("+")){
				if(volume == 100){
				} else {
					volume++; 			
				}
			} else if(vo.equals("-")){
				if(volume == 1){
				} else {
					volume--;			
				}
			}
			System.out.println("볼륨 : " + volume);
		}
	}
	
	//채널 : 직접 숫자를 눌러서 설정 하는 방법도 있고 하나씩 올리고 내리는 방법도 있다.
	//음략 : 하나씩 올리고 내리는 방법이 있다.
	public static void main(String[] args) {
		TV tv = new TV();
		System.out.println("on?");
		String str = ScanUtil.nextLine();
		tv.power(str);
		System.out.println("현재 채널 : " + tv.channel + "	현재 음량 : " + tv.volume);
		while(tv.power){
			System.out.println("채널 변경 : n(숫자입력) 또는 >, < / 음량변경 : +, - / 종료 : off");
			str = ScanUtil.nextLine();
			if(str.equals("n")){
				System.out.println("원하는 채널 입력 (0 입력시 취소)");
				int ch = ScanUtil.nextInt();
				if(ch == 0){
					continue;
				} else {
					tv.channel(ch);					
				}
			} else {
				tv.channel(str);
				tv.volume(str);		
				tv.power(str);				
			}
		System.out.println();	
		}

	}
	
}






//과제
// 임의의 사물을 대상으로 클래스를 만들어주세요 tv같은
// 사물이 가지고 있는 속성을 변수로 만들고,
// 변수와 관계된 동작들을 메소드로 만들어주시면 됩니다.














