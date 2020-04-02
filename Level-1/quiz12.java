package Level1;

public class quiz12 {
	boolean solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12916
		/*
		 * 문자열 내 p와 y의 개수
		 */
		boolean answer = true;
		int p_cnt=0, y_cnt=0;
		
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				p_cnt++;
			} else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				y_cnt++;
			}
		}
		
		if (p_cnt > y_cnt || y_cnt > p_cnt) answer = false;
		return answer;
	}
}
