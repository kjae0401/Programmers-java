package Level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quiz14 {
	public boolean solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12918
		/*
		 * 문자열 다루기 기본
		 */
		boolean answer=true;
		Pattern p1 = Pattern.compile("^[0-9]{4}{6}$");
		Matcher m = p1.matcher(s);
		
		if(m.find()) {
			answer = true;
		} else {
			answer = false;
		}
		
		return answer;
	}
}
