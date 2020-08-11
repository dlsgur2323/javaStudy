package 김인혁;

public class Store {
	String name;
	Product[] products;
	Product[] stocks;
	int[] stock;
	int money;
	int popularity;
	
	Store(String name, int money, int popularity){
		this.name = name;
		this.money = money;
		this.popularity = popularity;
		products = new Product[20];
		stock = new int[20];
		stocks = new Product[10];
	}
	
	void buyProduct(Product p){
		boolean checkNull = false;
		if(money >= p.price2){
			for(int i = 0; i < products.length; i++){
				if(products[i] != null && products[i].name == p.name){
					checkNull = true;
					products[i].count += 1;
					money -= p.price2;
					break;
				}
			}
			if(checkNull == false){
				for(int i = 0; i < products.length; i++){
					if(products[i] == null){
						products[i] = p;
						products[i].count +=1;
						money -= p.price2;
						break;
					} 
					
				}
							
			}
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("=================================\n");
			System.out.println("\t" + p.name + "을 구매했다.");
			System.out.println("\n=================================");
			System.out.println();
			System.out.println();
			System.out.println();
			stop(1000);
			
		} else {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("=================================\n");
			System.out.println("\t소지금이 부족해...");
			System.out.println("\n=================================");
			System.out.println();
			System.out.println();
			System.out.println();
			stop(1000);
		}
	}

	
	private void stop(int interval) {
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	void sellProduct(Product p){
		boolean isTi = false;
		for(int i = 0; i < products.length; i++){
			if(products[i] != null && products[i].name == p.name){
				products[i].count -= 1;
				isTi = true;
				money += p.price1;
				if(products[i].count == 0){
					products[i] = null;
				}
				sortProducts();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.print("\t나 : 여기 ");
				stop(400);
				System.out.println("있습니다.");
				stop(600);
				System.out.print("\t" + p.name + "을(를)");
				stop(400);
				System.out.println(" 팔았다..!");
				stop(600);
				System.out.print("\t소지금 ");
				stop(400);
				System.out.print(" " + p.price1);
				stop(400);
				System.out.println(" 증가!!");
				stop(600);
				if(popularity < 100){
					popularity += 1;
					System.out.println("\t평판 " + 1 + " 증가!!");
				}
				stop(600);
				break;
			}
		}
		if(!isTi){
			youLier();
			popularity -= 10;
		}
	}

	private void youLier() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("\t앗");
		stop(100);
		System.out.print(".");
		stop(100);
		System.out.print(".");
		stop(100);
		System.out.print(".");
		stop(100);
		System.out.print(" ");
		stop(100);
		System.out.print("재");
		stop(100);
		System.out.print("고");
		stop(100);
		System.out.print("가");
		stop(500);
		System.out.print(" ");
		stop(100);
		System.out.print("없");
		stop(500);
		System.out.print("다");
		stop(100);
		System.out.print("!");
		stop(100);
		System.out.print("!\n\n");
		stop(500);
		System.out.print("\t손");
		stop(100);
		System.out.print("님");
		stop(100);
		System.out.print("이");
		stop(100);
		System.out.print(" ");
		stop(100);
		System.out.print("나");
		stop(100);
		System.out.print("가");
		stop(100);
		System.out.print("셨");
		stop(100);
		System.out.print("다");
		stop(100);
		System.out.print(".");
		stop(200);
		if(popularity > 10){
			System.out.print("\t평");
			stop(100);
			System.out.print("판");
			stop(100);
			System.out.print(" ");
			stop(100);
			System.out.print("10");
			stop(100);
			System.out.print(" ");
			stop(100);
			System.out.print("하");
			stop(100);
			System.out.print("락");
			stop(100);
			System.out.print(".");
			stop(100);
			System.out.print(".");
			stop(100);
			System.out.print(".");
			stop(300);
			System.out.println();
			System.out.println();
			System.out.println();		
		} else if(popularity <= 10){
			System.out.print("\t평");
			stop(100);
			System.out.print("판");
			stop(100);
			System.out.print(" ");
			stop(100);
			System.out.print(popularity);
			popularity = 0;
			stop(100);
			System.out.print(" ");
			stop(100);
			System.out.print("하");
			stop(100);
			System.out.print("락");
			stop(100);
			System.out.print(".");
			stop(100);
			System.out.print(".");
			stop(100);
			System.out.print(".");
			stop(300);
			System.out.println();
			System.out.println();
			System.out.println();		
		}
		
		
		
	}

	private void sortProducts() {
		for(int i = 0; i < products.length-1; i++){
			if(products[i] == null && products[i+1] != null){
				Product[] temp = new Product[1];
				temp[0] = products[i];
				products[i] = products[i+1];
				products[i+1] = temp[0];
			}
		}
		
	}
	
	void countProduct(){ //안쓰는거
//		for(int i = 0; i < products.length-1; i++){
//			if(products[i] != null){
//				int count = 1;
//				
//				if(i == 0){
//					for(int j = i+1; j < products.length; j++){
//						if(products[i] == products[j]){
//							count++;
//						}
//					}
//					stocks[0] = products[0];
//					stock[0] = count;
//				} else {
//					for(int j = 0; j < i; j++){
//						if(products[i] == products[j]){
//							break;
//						} else {
//							for(int k = i+1; k < products.length; k++){
//								if(products[i] == products[j]){
//									count++;
//								}
//							}
//							for(int y = 0; y < stock.length; y++){
//								if(stock[y] != 0){
//									stock[y] = count;
//									break;
//								}
//							}
//							for(int x = 0; x < stocks.length; x++){
//								if(stocks[x] != null){
//									stocks[x] = products[i];
//									break;
//								}
//							}
//							
//						}
//						
//					}
//					
//				}
//			}	
//		}
	}
	
	
}











