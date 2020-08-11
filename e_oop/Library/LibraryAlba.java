package e_oop.Library;

public class LibraryAlba {
	//도서관 
	// 사서, 알바, 손님, 책, 리스트, 대여증, 반납증
	// 손님이 알바에게 책을 요청
	// 알바는 사서에게 책 리스트를 전달
	// 사서는 책을 알바에게 가져옴
	// 알바는 손님에게 책과 대여증을 줌
	// 손님이 책과 대여증을 알바에게 반납하면 반납증을 줌
	
	
	// 일을 하기 위해 받아야 할 것? 없음?
	// 사서에게 줘야할 것? 책 요청 리스트
	String[] order(){
		System.out.println("찾으시는 책이 있습니까?");
		return new String[]{"어린왕자", "국가론"};
	}
	// 사서에게 받은 책과 함께 대여증(생략)을 손님에게 줌
	// 일을 하기 위해 받아야 할 것? 책
	// 사서에게 줘야할 것? 없음
	void rent(String[] books){
		System.out.println("대여되었습니다.");
	}
	// 손님에게 대여증과 책을 받으면 반납증을 줌
	// 일하기 위해 필요한 것 ? 대여증(생략)? (반납증 생략)
	// 사서에게 줄 것? 책? (생략)
	
	void return1(String[] books){
		System.out.println("반납되었습니다.");
	}

}
