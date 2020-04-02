package Level1;

public class quiz7 {
	public String solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12903
		/*
		 * 가운데 글자 가져오기
		 */
		String answer = "";
		
		if ((s.length() % 2) == 0) {
			answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
		} else {
			answer = s.substring(s.length()/2, s.length()/2 + 1);
		}
		
		return answer;
	}
}
