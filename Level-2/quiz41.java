package Level2;

public class quiz41 {
	public int solution(int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12980
		/*
		 * 점프와 순간이동
		 */
		int ans = 0;
		
		while (n > 0) {
			if (n%2 == 0) { n /= 2; }
			else {
				n -= 1;
				ans++;
			}
		}
		
		return ans;
	}
}
