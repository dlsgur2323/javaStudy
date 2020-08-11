package e_oop.Library;

import java.util.Arrays;

public class Librarian {

	public static void main(String[] args) {
		LibraryAlba la = new LibraryAlba();

		String[] order = la.order();
		System.out.println(Arrays.toString(order));
		
		System.out.println("책 찾는 중..... 완료!");
		String[] books = {"어린왕자", "국가론"};
		
		la.rent(books);
		la.return1(books);
		
	}

}
