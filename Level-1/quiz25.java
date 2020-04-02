package Level1;

public class quiz25 {
	public long solution(long n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12934
		/*
		 * 정수 제곱근 판별
		 */
		long answer = 0;
		
		if ((long) Math.sqrt(n) == Math.sqrt(n)) {
			answer = ((long) Math.sqrt(n) + 1) * ((long) Math.sqrt(n) + 1);
		} else {
			answer = -1;
		}
		
		return answer;
	}
}
