package mygame.mine_find;

import java.util.Scanner;


public class Launcher {
	Scanner sc = new Scanner(System.in);
	Map easy = new Map(15,20,40);
	User me = new User(easy);
	public static void main(String[] args) {
		new Launcher().start();
	}
	
	void start(){
		View easyView = new View(easy);
		easy.mapMaker();
		
		while(true){
			easyView.viewMaker(me,easy);
			win(); //승패판독기
			if(me.check[me.y][me.x] == 1 && easy.m[me.y][me.x] == 9){ 
				System.out.println("You Lose...");
				System.exit(0);
			}
			String input = sc.nextLine();
			
			switch(input){
				case"w" : // 커서 이동키
					me.moving("w");
					break;
				case "a" :
					me.moving("a");
					break;
				case "s" :
					me.moving("s");
					break;
				case "d" :
					me.moving("d");
					break;
				case "e" :// 선택키
					me.select(easy);
					me.findZero(easy);
					break;
				case "q" : // 깃발키
					me.flag(easy);
					break;
			}
			
			
		}
				
	}
	
	void win(){ // 승리판독기
		boolean winCheck = true;
		winCheck: for(int i = 0; i < easy.m.length; i++){
			for(int j = 0; j < easy.m[i].length; j++){
				if(me.check[i][j] == 0 && easy.m[i][j] != 9){
					winCheck = false;
					break winCheck;
				}
			}
		}
		if(winCheck == true){
			System.out.println("You Win!!");
			System.exit(0);
		}
	}
	
	
	
	
	
}

