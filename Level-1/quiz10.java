package Level1;

public class quiz10 {
	public long solution(int a, int b) {
		// https://programmers.co.kr/learn/courses/30/lessons/12912
		/*
		 * 두 정수 사이의 합
		 */
		long answer = 0;
		
		if (a < b) { for(int i=a; i<=b; i++) answer += i; }
		else { for(int i=b; i<=a; i++) answer += i; }
		
		return answer;
	}
}
