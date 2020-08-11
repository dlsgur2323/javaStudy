package e_oop;

public class Mp3 {
	boolean power; //전원
	int volume; // 볼륨
	int index; //음악인덱스
	
	boolean menu; //메뉴화면
	boolean play; //재생화면
	boolean list; //목록화면
	
	
	final int MAX_VOLUME = 5;
	final int MIN_VOLUME = 0;
	//초기설정
	Mp3(){
		power = false;
		volume = 4;
		menu = false;
		play = false;
		list = false;
		
	}
	
	//전원부
	void power(){
		power = !power;
		System.out.println(power ? "" : "------------------------\n     <<Power Off>>\n------------------------");
	}
	
	//메뉴 (재생, 노래목록)
	void menu(){
		menu = true;
		play = false;
		list = false;
		showVolume();
		System.out.println("--------[메인메뉴]--------\n");
		System.out.println("1.노래재생\t2.노래목록\t3.전원끄기\n");
		System.out.println("------------------------");
		
	}
	
	//재생(랜덤재생)
	void play(Music[] musics, int index){
		menu = false;
		list = false;
		play = true;
		this.index = index;
		showVolume();
		System.out.println("--------[노래재생]--------");
		System.out.println("0.메인메뉴\t\t 3.노래목록");
		System.out.println(this.index+1 + "." +musics[this.index].name + " - " + musics[this.index].singer);
		System.out.println("\t" + musics[this.index].album + "\n");
		System.out.print("0:0" + "\t\t " + musics[this.index].mTime/60 + ":");
		if(musics[this.index].mTime%60 < 10){
				System.out.println("0"+musics[this.index].mTime%60);
		} else {
			System.out.println(musics[this.index].mTime%60);
		}
		System.out.println("1.이전곡 \t\t 2.다음곡" );
		System.out.println("------------------------");
	}
	
	//노래목록
	void list(Music[] musics){
		menu = false;
		list = true;
		play = false;
		showVolume();
		System.out.println("--------[노래목록]--------\n");
		System.out.println("0.메인메뉴");
		for(int i = 0; i < musics.length; i++){
			System.out.println(i+1 + "." + musics[i].name);
		}
		System.out.println();
		System.out.println("------------------------");
	}
		
	//볼륨표시
	void showVolume(){
		System.out.print("\t\t");
		for(int i = MAX_VOLUME - 1; i >= MIN_VOLUME; i--){
			if(i >= volume){
				System.out.print("□");
			}else{
				System.out.print("■");
			}
		}
		System.out.print(" Vo\n");
	}
	//볼륨조절
	void volumeUp(){
			if(volume < MAX_VOLUME){
				volume++;
			}
	}
	void volumeDown(){
			if(MIN_VOLUME < volume){
				volume--;
			}
		}
	
	
	
	public static void main(String[] args) {
		
		Music[] musics = new Music[3];
		Music music1 = new Music("당신을 위하여", "더크로스", "1집 Melody Quus", 243);
		Music music2 = new Music("비처럼 음악처럼", "김현식", "김현식 3집", 273);
		Music music3 = new Music("사랑했지만", "김광석", "김광석 2nd", 268);	
		
		musics[0] = music1;
		musics[1] = music2;
		musics[2] = music3;
		
		Mp3 mp3 = new Mp3();
		System.out.println("--------------\n");
		System.out.println("ON?\n");
		System.out.println("--------------");
		String input = ScanUtil.nextLine();
		if(input.equals("on") && mp3.power == false){
			mp3.power();
			mp3.menu();
			System.out.println(">");
			int select = ScanUtil.nextInt();
			
			while(mp3.power){
				switch(select){
					case 5 : mp3.volumeUp(); break;
					case 6 : mp3.volumeDown(); break;
				}
				if(mp3.menu){ // 메인메뉴 조작
					mp3.menu();
					switch(select){
					case 1 : mp3.play(musics,(int)(Math.random()*3)); break;
					case 2 : mp3.list(musics); break;
					case 3 : mp3.power(); break;
					}
				} else if(mp3.list){
					mp3.list(musics);
					switch(select){
					case 0 : mp3.menu(); break;
					case 1 : mp3.play(musics,select-1); break;
					case 2 : mp3.play(musics,select-1); break;
					case 3 : mp3.play(musics,select-1); break;
					}
				} else if(mp3.play){
					mp3.play(musics,mp3.index);
					switch(select){
					case 0 : mp3.menu(); break;
					case 2 : if(mp3.index < musics.length-1){
								mp3.play(musics,mp3.index+1);
							 	break;
	  						 } else if(mp3.index == 2){
	  							mp3.play(musics,0);
	  							break;
	  						 }
					case 1 : if(mp3.index > 0){
								mp3.play(musics,mp3.index-1);
								break;
							 } else if(mp3.index == 0){
								mp3.play(musics,2);
								break;
							 }	
					case 3 : mp3.list(musics); break;
					}
				}
				
				
				select = ScanUtil.nextInt();
			}
		}
		
		
		
	}
}


class Music{
	String name; //노래이름
	String singer; //가수명
	String album; //앨범명
	int mTime; //곡 시간(초 기준)
	
	Music(String nm, String sin, String al, int mTi){
		name = nm;
		singer = sin;
		album = al;
		mTime = mTi;
	}
}

























