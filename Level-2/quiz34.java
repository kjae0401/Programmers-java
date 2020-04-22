package Level2;

import java.util.Arrays;

public class quiz34 {
	public int solution(int[] A, int[] B) {
		// https://programmers.co.kr/learn/courses/30/lessons/12941
		/*
		 * 최솟값 만들기
		 */
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<A.length; i++) {
			answer = answer + (A[i] * B[B.length-1-i]);
		}
		
		return answer;
	}
}
