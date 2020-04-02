package Level1;

public class quiz19 {
	public String solution(String s, int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12926
		/*
		 * 시저 암호
		 */
		String answer = "";
		StringBuffer sb = new StringBuffer(s);
		
		for(int i=0; i<sb.length(); i++) {
			if (sb.charAt(i)==' ') {
			} else {
				int c = sb.charAt(i);
				if (c >= 65 && c <= 90) {
					c += n;
					if (c > 90) c -= 26;
				}
				if (c >= 97 && c <= 122) {
					c += n;
					if (c > 122) c -= 26;
				}
				sb.setCharAt(i, (char)c);
			}
		}
		answer = sb.toString();
		return answer;
	}
}
