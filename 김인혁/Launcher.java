package 김인혁;

import e_oop.ScanUtil;

public class Launcher {
	
	Potion hp;
	Potion mp;
	Equip weapon;
	Equip armor;
	Etc leater;
	
	public static void main(String[] args) {
		new Launcher().start();
		
		
	}

	private void start() {
		showStart(); //시작화면
		String input = ScanUtil.nextLine();
		
		if(input.equals("1")){ //시작
			hp = new Potion("체력포션", 300, 250, 1);
			mp = new Potion("마나포션", 300, 250, 1);
			weapon = new Equip("철검", 1500, 1200, 1);
			armor = new Equip("철제 방어구", 3000, 2500, 1);
			
			showIntro();
			Store my = new Store("나작스", 2000, 40);
			my.products[0] = hp;
			my.products[0].count = 1;
//			my.products[1] = hp;
//			my.products[2] = hp;
			my.products[1] = mp;
			my.products[1].count = 1;
//			my.products[4] = mp;
//			my.products[5] = mp;
			my.products[2] = weapon;
			my.products[3] = armor;
			
			while(true){
				showStore(my);
				input = ScanUtil.nextLine();
				switch(input){
				case "1" : //개장
					Waiting(my);
					System.out.println("\n\n\n\t임대료로 소지금 100 감소");
					my.money -= 100;
					break;
				case "2" : //구매
					goMerchant();
					showMerchant(my);
					input = ScanUtil.nextLine();
					merchant : while(true){
						switch(input){
						case "0" : //돌아가기
							System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
							System.out.println("=================================\n");
							System.out.println("\t돌아가자...");
							System.out.println("\n=================================");
							System.out.println();
							System.out.println();
							System.out.println();
							stop(1000);
							comeback();
							break merchant;
						case "1" : //체력포션
							my.buyProduct(hp);
							break;
						case "2" : //마나포션
							my.buyProduct(mp);
							break;
						case "3" : //무기
							my.buyProduct(weapon);
							break;
						case "4" : //방어구
							my.buyProduct(armor);
							break;
						}
						showMerchant(my);
						input = ScanUtil.nextLine();
					}
					break;
				case "3" : //물품확인
//					my.countProduct();
					showStock(my);
					input = ScanUtil.nextLine();
					switch(input){
						case "0" : //돌아가기
							break;
					}
					break;
				case "4" : //종료
					System.out.println("\t종료되었습니다...");
					System.exit(0);
					break;
				}
			}
		/////// 아래는 종료하는 구간입니다. ////////////
		} else if(input.equals("2")){ //종료
			System.out.println("\t종료되었습니다...");
			System.exit(0);
		}
		
	}

private void goMerchant() {
	for(int i = 0; i < 3; i++){
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("\t도매점 가는 중");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.println();	
	}
		
}

private void comeback() {
	for(int i = 0; i < 3; i++){
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("\t돌아가는 중");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.println();	
	}
}

	private void showMerchant(Store store) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("           == 나만의 작은 스토어 ==");
		System.out.println("┌───────────────────────────────────────┐");
		System.out.print("│");
		System.out.print("              양심없는 도매상                      ");
		System.out.print("    \t│");
		System.out.println("가게명 : " + store.name);
		System.out.print("│          \t\t\t\t│");
		System.out.println("소지금 : " + store.money);
		System.out.print("│");
		System.out.print("            무엇을 사가면 좋을까...      ");
		System.out.print("    \t│");
		System.out.println("평판  : " + store.popularity);
		System.out.println("│          \t\t\t\t│");
		System.out.print("│");
		System.out.print("  0. 돌아간다.");
		System.out.print("    \t\t\t│\n");
		System.out.print("│");
		System.out.print("  1. " + hp.name + " / " + hp.price2 + "원");
		System.out.print("    \t\t\t│\n");
		System.out.print("│");
		System.out.print("  2. " + mp.name + " / " + mp.price2 + "원");
		System.out.print("    \t\t\t│\n");
		System.out.print("│");
		System.out.print("  3. " + weapon.name + " / " + weapon.price2 + "원");
		System.out.print("    \t\t\t│\n");
		System.out.print("│");
		System.out.print("  4. " + armor.name + " / " + armor.price2 + "원");
		System.out.print("    \t\t\t│\n");
		System.out.println("│          \t\t\t\t│");
		System.out.println("└───────────────────────────────────────┘");	
	}

	private void showStock(Store store) { //재고확인
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("           == 나만의 작은 스토어 ==");
		System.out.println("┌───────────────────────────────────────┐");
		System.out.print("│");
		System.out.print("                 재고확인                        ");
		System.out.print("    \t│");
		System.out.println("가게명 : " + store.name);
		System.out.print("│          \t\t\t\t│");
		System.out.println("소지금 : " + store.money);
		System.out.print("│");
		System.out.print("              남은 재고가...        ");
		System.out.print("    \t│");
		System.out.println("평판  : " + store.popularity);
		
		for(int i = 0; i < store.products.length; i++){
			if(store.products[i] != null){
				if(store.products[i].name == weapon.name){
					System.out.print("│   ");
					System.out.print(store.products[i].name);
					System.out.print("     \t------- " + store.products[i].count + "개");
					System.out.print(" \t\t│\n");
				} else {
					System.out.print("│   ");
					System.out.print(store.products[i].name);
					System.out.print(" \t------- " + store.products[i].count + "개");
					System.out.print(" \t\t│\n");
				}
			} else {
				continue;
			}
		}
		System.out.print("│");
		System.out.print("                             0. 돌아가기");
		System.out.print("\t│\n");
		System.out.println("└───────────────────────────────────────┘");
	}

	private void Waiting(Store store) {//개장하여 손님을 기다리는 중
		//스탑 사용해서 손님 기다리는 중... --> 출력 while문 for문??
		//기다리면서 주기적으로(스탑) 확률적으로 손님 들어옴 --> 매스랜덤(평판이 높을수록 높은확률) --> if
			//if 손님이 오면(손님객체 생성) 손님이 원하는 물품을 띄우고 대사 띄움 --> ??? 주세요
			//인풋 받고 1.판다  2.안판다. --> if
				//if 판다 --> 물품이 진짜 있는지 확인, 없으면 평판 크게 하락하고 손님 퇴장
				// 있으면 대사 " 네 여기 있습니다." 하고 판매, 소지금상승 평판 상승
				// if 안판다 --> 손님이 당황해 하며 평판 하락
		//위의 과정 반복 (약 5번의 손님 기회 부여)
		for(int i = 0; i < 5; i++){
			int percent = 50;
			if (store.popularity >= 80 && store.popularity < 100){
				percent = 80;
			} else if (store.popularity >= 70 && store.popularity < 80){
				percent = 70;
			} else if (store.popularity >= 60 && store.popularity < 70){
				percent = 60;
			} else if (store.popularity >= 50 && store.popularity < 60){
				percent = 50;
			} else if(store.popularity >= 40 && store.popularity < 50){
				percent = 40;
			} else if (store.popularity >= 30 && store.popularity < 40){
				percent = 30;
			} else if (store.popularity >= 20 && store.popularity < 30){
				percent = 20;
			} else if (store.popularity >= 0 && store.popularity < 20){
				percent = 10;
			}
			int random = (int)(Math.random()*100);
			if(random >= percent){
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.print("\t손님");
				stop(500);
				System.out.print(" 기다리는 중");
				stop(400);
				System.out.print(".");
				stop(400);
				System.out.print(".");
				stop(400);
				System.out.print(".");
				System.out.println();
				stop(400);
				
			} else if(random < percent){
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.print("\t손님");
				stop(500);
				System.out.println("이 오셨다..!");
				stop(500);
				System.out.print("\t나 : ");
				System.out.print("어");
				stop(100);
				System.out.print("서");
				stop(100);
				System.out.print("오");
				stop(100);
				System.out.print("세");
				stop(100);
				System.out.print("요");
				stop(100);
				System.out.print("!");
				stop(600);
				showYourNeeds(store);
			}
		}
	}
	

	private void showYourNeeds(Store store) {
		int ran = (int)(Math.random()*10);
		int input;
		switch(ran){
		case 0 : case 2 : case 6 :
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("=================================\n");
			System.out.println("\t 손님 : " + hp.name + " 하나만 주세요");
			System.out.println();
			System.out.println("\t 1.판다 \t2.안판다");
			System.out.println("\n=================================");
			System.out.println();
			System.out.println();
			System.out.println();
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				store.sellProduct(hp);
				break;
			case 2:
				showSorry(store);		
				break;
			}
			break;
		case 1 : case 9 : case 3 :
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("=================================\n");
			System.out.println("\t 손님 : " + mp.name + " 하나만 주세요");
			System.out.println();
			System.out.println("\t 1.판다 \t2.안판다");
			System.out.println("\n=================================");
			System.out.println();
			System.out.println();
			System.out.println();
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				store.sellProduct(mp);
				break;
			case 2:
				showSorry(store);
				break;
			}
			break;
		case 4 : case 8 :
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("=================================\n");
			System.out.println("\t 손님 : " + armor.name + " 하나만 주세요");
			System.out.println();
			System.out.println("\t 1.판다 \t2.안판다");
			System.out.println("\n=================================");
			System.out.println();
			System.out.println();
			System.out.println();
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				store.sellProduct(armor);
				break;
			case 2:
				showSorry(store);
				break;
			}
			break;
		case 5 : case 7 :
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("=================================\n");
			System.out.println("\t 손님 : " + weapon.name + " 하나만 주세요");
			System.out.println();
			System.out.println("\t 1.판다 \t2.안판다");
			System.out.println("\n=================================");
			System.out.println();
			System.out.println();
			System.out.println();
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				store.sellProduct(weapon);
				break;
			case 2:
				showSorry(store);
				break;
			}
			break;
		}
		System.out.println();
		
	}

	private void showSorry(Store store) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("\t나 : 죄송합니다");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.print(".");
		stop(200);
		System.out.print(".\n\n");
		stop(400);
		System.out.print("\t손");
		stop(200);
		System.out.print("님");
		stop(200);
		System.out.print("이");
		stop(200);
		System.out.print(" ");
		stop(200);
		System.out.print("나");
		stop(200);
		System.out.print("가");
		stop(200);
		System.out.print("셨");
		stop(200);
		System.out.print("다");
		stop(200);
		System.out.print(".");
		stop(400);
		if(store.popularity > 5){
			System.out.print("\t평");
			stop(200);
			System.out.print("판");
			stop(200);
			System.out.print(" ");
			stop(200);
			System.out.print("5");
			stop(200);
			System.out.print(" ");
			stop(200);
			System.out.print("하");
			stop(200);
			System.out.print("락");
			stop(200);
			System.out.print(".");
			stop(200);
			System.out.print(".");
			stop(200);
			System.out.print(".");
			stop(400);
			System.out.println();
			System.out.println();
			System.out.println();
			store.popularity -= 5;
		} else if(store.popularity < 5){
			System.out.print("\t평");
			stop(200);
			System.out.print("판");
			stop(200);
			System.out.print(" ");
			stop(200);
			System.out.print(store.popularity);
			stop(200);
			System.out.print(" ");
			stop(200);
			System.out.print("하");
			stop(200);
			System.out.print("락");
			stop(200);
			System.out.print(".");
			stop(200);
			System.out.print(".");
			stop(200);
			System.out.print(".");
			stop(400);
			System.out.println();
			System.out.println();
			System.out.println();
			store.popularity = 0;
		}
	}

	private void showStore(Store store) {// 상점에서의 화면
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("           == 나만의 작은 스토어 ==");
		System.out.println("┌───────────────────────────────────────┐");
		System.out.print("│          \t\t\t\t│");
		System.out.println("가게명 : " + store.name);
		System.out.print("│");
		System.out.print("              무엇을 할까?        ");
		System.out.print("    \t│");
		System.out.println("소지금 : " + store.money);
		System.out.print("│          \t\t\t\t│");
		System.out.println("평판  : " + store.popularity);
		System.out.print("│");
		System.out.print("  1.개장하기");
		System.out.print("  2.구매하기 ");
		System.out.print("  3.재고확인 ");
		System.out.print("  4.게임종료 ");
		System.out.println("\t│");
		System.out.println("│          \t\t\t\t│");
		System.out.println("└───────────────────────────────────────┘");
	}

	private void showIntro() { //시작하면 나오는 인트로
		//대충 상점을 열게된 이야기
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("                ");
		System.out.print("대");
		stop(300);
		System.out.print("충");
		stop(300);
		System.out.print(" ");
		stop(300);
		System.out.print("상");
		stop(300);
		System.out.print("점");
		stop(300);
		System.out.print("을");
		stop(300);
		System.out.print(" ");
		stop(300);
		System.out.print("열");
		stop(300);
		System.out.print("게");
		stop(300);
		System.out.print("된");
		stop(300);
		System.out.print(" ");
		stop(300);
		System.out.print("스");
		stop(300);
		System.out.print("토");
		stop(300);
		System.out.print("리");
		stop(300);
		System.out.print(".");
		stop(300);
		System.out.print(".");
		stop(300);
		System.out.print(".");
		stop(1500);
		System.out.println("\n\n\n");
	}

	private void stop(int interval) {
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

	private void showStart() { //  테두리,게임이름 ,게임시작 버튼, 종료 버튼
		System.out.println("┌───────────────────────────────┐");
		for(int i = 0; i < 5; i++){
			if(i == 0){
				System.out.print("│");
				System.out.print("      == 나만의 작은 스토어 ==");
				System.out.println("\t│");
			} else if(i == 3){
				System.out.print("│");
				System.out.print("\t1.게임시작");
				System.out.print("\t  2.종료 ");
				System.out.println("  \t│");
			} else {
				System.out.println("│    \t\t\t\t│");
			}
		}
		System.out.println("└───────────────────────────────┘");
		
		
	}

	
}
























