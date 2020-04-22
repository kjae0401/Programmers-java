package Level2;

public class quiz43 {
	public int solution(int n, int a, int b) {
		// https://programmers.co.kr/learn/courses/30/lessons/12985
		/*
		 * 예상 대진표
		 */
		int answer = 0;
		
		while (n > 1) {
			answer++;
			if ((a-1)/2 == (b-1)/2) { break; }
			else {
				if (a%2 == 0) { a /= 2; } 
				else { a = (a/2) + (a%2); }
				
				if (b%2 == 0) { b /= 2; } 
				else { b = (b/2) + (b%2); }
			}
		}
		
		return answer;
	}
}
