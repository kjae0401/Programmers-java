package Level1;

public class quiz22 {
	public int solution(int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12931
		/*
		 * 자릿수 더하기
		 */
		int answer = 0;
		String temp = Integer.toString(n);
		char[] ch = temp.toCharArray();
		
		for(int i=0; i<ch.length; i++) 
			answer += ((int)ch[i] - 48);
		
		return answer;
	}
}
