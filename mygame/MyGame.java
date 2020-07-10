package mygame;

import e_oop.ScanUtil;

public class MyGame {

	public static void main(String[] args) {
		Maps homeTown = new Maps("시작마을", 150, 45);
		homeTown.mapMakerHomeTown(homeTown);
		Character c = new Character("주인공", homeTown);
		while(true){
			homeTown.showMap(homeTown, c);
			String input = ScanUtil.nextLine();
			
			if(input.equals("w")){
				c.move(input, homeTown,c);
			} else if(input.equals("a")){
				c.move(input, homeTown,c);
			} else if(input.equals("s")){
				c.move(input, homeTown,c);
			} else if(input.equals("d")){
				c.move(input, homeTown,c);
			}
			
			
		}
		
	}

}
