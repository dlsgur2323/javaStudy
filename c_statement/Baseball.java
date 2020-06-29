package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 135 세자리의 숫자는 서로 중복되지 않아야함.
		 * 
		 * 123이라고 입력하면 135와 비교해서 스트라이크, 볼, 아웃
		 * 스트라이크 : 숫자와 자릿수 모두 일치하면 스트라이크
		 * 볼 : 숫자는 일치하지만 자리가 다른경우 볼
		 * 아웃 : 숫자로 자릿수도 모두 다른 경우 아웃
		 * 따라서 123 => 1s 1b 1o
		 * 
		 * 247 ==> 0s 2b 10
		 * 741 ==> 0s 1b 2o      2포함 1아니고
		 * 237 --> 0ㄴ 1b 2o     3x
		 * 479 ==> 1s 0b 2o     4x
		 * 482 ==> 1s 2b 0o
		 * 
		 *    abc
		 */
		
		int a;
		int b;
		int c;
		int input;
		
		int aI;
		int bI;
		int cI;
		
		int str = 0;
		int bal = 0;
		int out = 0;
		
		
		do{
			a = (int)(Math.random() * 9 + 1);
			b = (int)(Math.random() * 9 + 1);
			c = (int)(Math.random() * 9 + 1);
		} while(a == b || a == c || b == c);
		System.out.println("정답 : " + a + b + c);
		
		Scanner sc = new Scanner(System.in);

		outer :do{
			System.out.println("세자리 숫자를 고르시오>");
			input = Integer.parseInt(sc.nextLine());
			aI = input / 100;
			bI = input / 10 %10;
			cI = input % 10;
			str = 0;
			bal = 0;
			out = 0;
			if(aI >= 10 || aI == 0){
				System.out.println("잘못된 자리수 입력!!");
			} else if(aI == bI || aI == cI || bI == cI){
				 System.out.println("중복된 숫자 입력!!");
			} else {
				if(aI == a){
					str++;
				}
				if(aI == b || aI == c){
					bal++;
				}
				if(aI != a && aI != b && aI != c){
					out++;
				}
				if(bI == b){
					str++;
				}
				if(bI == a || bI == c){
					bal++;
				}
				if(bI != a && bI != b && bI !=c){
					out++;
				}
				if(cI == c){
					str++;
				}
				if(cI == a || cI == b){
					bal++;
				}
				if(cI != a && cI != b && cI !=c){
					out++;
				}
				if(a == aI && c == cI && b == bI){
					
				} else {
					System.out.println(str + "S " + bal + "B " + out + "O ");
				}
			}
			
		} while(a != aI || b != bI || c != cI);
		System.out.println("정답!");
		
		
		
		
		
		
		
		
		
		
		
	}

}











