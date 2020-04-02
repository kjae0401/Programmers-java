package Level1;

public class quiz34 {
	public static long[] solution(int x, int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12954
		/*
		 * x만큼 간격이 있는 n개의 숫자
		 */
		long[] answer = new long[n];
		long temp1;
		temp1 = x;

		for (int i=1; i<=n; i++)
			answer[i-1] = temp1*i;
		
		return answer;
	}
}
