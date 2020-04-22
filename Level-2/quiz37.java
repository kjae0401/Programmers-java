package Level2;

public class quiz37 {
	public String solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12951
		/*
		 * JadenCase 문자열 만들기
		 */
		String answer="";
		s = s.toLowerCase();
		StringBuffer sb = new StringBuffer(s);
		boolean flag = true;
		
		for(int i=0; i<sb.length(); i++) {
			if (flag && ((sb.charAt(i) >= 97 && sb.charAt(i) <= 122))) {
				sb.setCharAt(i, (char)(sb.charAt(i)-32));
				flag = false;
			} else { flag = false; }
			
			if (sb.charAt(i) == ' ')
				flag = true;
		}
		answer = sb.toString();

		return answer;
	}
}
