package h_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date today = new Date(); //현재 날짜
		System.out.println(today);
		
		//날짜 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS"); // HH : 24시간,  hh : 12시간
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd(E) hh:mm:ss a");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열 -> 날짜
		String str = "1987년 05월 01일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str);
			
			System.out.println(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance(); //싱글톤 패턴 - 객체를 하나만 생성
		
		
		cal.setTime(new Date());
		cal.set(2020, 6, 19);// 2020/07/19(월은 0부터 시작)
		System.out.println(cal.getTime());
		
		//날짜계산
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		cal.add(Calendar.HOUR, 4);
		cal.add(Calendar.MINUTE, 10);
		cal.add(Calendar.SECOND, -15);
		
		System.out.println(sdf3.format(cal.getTime()));
		
		
	}

	
	
	
}



























