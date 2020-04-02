package Level1;

public class quiz18 {
	public int solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12925
		/*
		 * 문자열을 정수로 바꾸기
		 */
		int answer = 0;
		if (s.charAt(0) == '-') {
			s = s.substring(1);
			answer = answer - Integer.parseInt(s);
		} else {
			answer = Integer.parseInt(s);
		}
		
		return answer;
	}
}
