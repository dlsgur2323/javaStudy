package i_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() :  저장된 모든 키를 Set으로 반환한다.
		 */

		HashMap<String, Object> map = new HashMap<>();
		
		map.put("a", 10);
		map.put("b", "홍길동");
		map.put("c", new Date());
		// hashmap에는 순서가 없다.
		System.out.println(map);
		
		map.put("b", "이순신"); // 덮어써진다.
		
		System.out.println(map);
		
		map.remove("a");
		System.out.println(map);
		Object value = map.get("b");
		System.out.println(value);
		
		Set<String> keys = map.keySet(); //맵에 저장된 모든 키
		
		System.out.println(keys);
		for(String key : keys){
			System.out.println(key + " : " + map.get(key));
		}
		
		//회원 테이블
		//아이디, 비밀번호, 이름, 전화번호
		/*
		 * 아이디		: admin
		 * 비밀번호 	: admin123
		 * 이름		: 관리자
		 * 전화번호	: 010-1234-5678 
		 */
		
		HashMap<String, String> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-5678");
		
		keys = user.keySet();
		for(String key : keys){
			System.out.println(key + " : " + user.get(key));
		}
		HashMap<String, String> user2 = new HashMap<>();
		user2.put("id", "guest");
		user2.put("password", "guest123");
		user2.put("name", "방문자");
		user2.put("tel", "010-1122-3344");
		
		ArrayList<HashMap<String, String>> table = new ArrayList<>();
		table.add(user);
		table.add(user2);
		System.out.println(table);
		
	}

}





















