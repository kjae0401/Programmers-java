package Level1;

public class quiz13 {
	public String solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12917
		/*
		 * 문자열 내림차순으로 배치하기
		 * char 배열을 만들어 Arrays.sort 함수 사용하는 방법도 가능
		 */
		String answer="";
		StringBuilder ss = new StringBuilder(s);
		
		for(int i=0; i<ss.length(); i++) {
			for(int j=0; j<ss.length()-i-1; j++) {
				if(ss.charAt(j) < ss.charAt(j+1)) {
					char c = ss.charAt(j);
					ss.setCharAt(j, ss.charAt(j+1));
					ss.setCharAt(j+1, c);
				}
			}
		}
		answer = ss.toString();
		return answer;
	}
}
