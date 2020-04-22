package Level2;

public class quiz35 {
	public int solution(int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12945
		/*
		 * 피보나치의 수
		 * 보통은 재귀함수를 사용하여 문제를 해결하지만 성능면에서 좋지않다.
		 */
		int mod = 1234567;
		int answer=0;
		int f0=0, f1=1;
		
		for (int i=2; i<=n; i++) {
			answer = (f0 + f1) % mod;
			f0 = f1;
			f1 = answer;
		}
		
		return answer;
	}
}