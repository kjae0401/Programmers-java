package Level1;

public class quiz27 {
	public String solution(int num) {
		// https://programmers.co.kr/learn/courses/30/lessons/12937
		/*
		 * 짝수와 홀수
		 */
		String answer = "";
		
		if (num%2 == 0) { answer = "Even"; }
		else { answer = "Odd"; }
		
		return answer;
	}
}
