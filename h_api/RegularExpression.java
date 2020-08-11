package h_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^    뒷 문자로 시작
		 * &	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z]: a부터 z가 아닌 것)
		 * {}	앞 문자의 개수({2} : 2개, {2,4}: 2개 이상 4개 이하
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	or연산
		 * \s 	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알바펫이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 */
		
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		//아이디 : 5~20자의 영문 소문자, 숫자와 특수기호_- 만 사용가능 <--네이버
		//아이디 : 5~20자의 영문 소문자, 숫자만 가능
		//전화번호 : 최대 11자리 숫자만 가능
		//이메일 : 가운데에 @ 있어야함
		String id = "dlsgur2323";
		String ph = "01020424672";
		String em = "dlsgur2323@gmail.com";
		
		String idRegex = "[a-z0-9_-]{5,20}";
		String phRegex = "^0[0-9]{2,3}[0-9]{3,4}[0-9]{4}";
		String emRegex = "\\S+@\\S+\\.\\S+";
		
		Pattern idp = Pattern.compile(idRegex);
		Pattern php = Pattern.compile(phRegex);
		Pattern emp = Pattern.compile(emRegex);
		Matcher m1 = idp.matcher(id);
		Matcher m2 = php.matcher(ph);
		Matcher m3 = emp.matcher(em);
		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		
		
		
		
	}

	
	
	
}
























