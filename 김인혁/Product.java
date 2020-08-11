package 김인혁;

public class Product {
	
	String name; //이름
	int price1; //내가 파는가격
	int price2; //내가 사는
	int count;
	
	Product(String name, int price1, int price2, int count){
		this.name = name;
		this.price1 = price1;
		this.price2 = price2;
		this.count = count;
	}
	
	
	
}



class Potion extends Product{
	Potion(String name, int price1, int price2, int count){
		super(name, price1, price2, count);
	}
}	
class Equip extends Product{
	Equip(String name, int price1, int price2, int count){
		super(name, price1, price2, count);
	}
}
class Etc extends Product{
	Etc(String name, int price1, int price2, int count){
		super(name, price1, price2, count);
	}
}















