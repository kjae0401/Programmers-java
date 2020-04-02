package Level1;

import java.util.Arrays;

public class quiz36 {
	public int solution(int[] d, int budget) {
		// https://programmers.co.kr/learn/courses/30/lessons/12982
		/*
		 * 예산
		 */
		int answer=0;
		
		Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
			if ((budget -= d[i]) >= 0) { answer++; }
			else { break; }
		}
		
		return answer;
	}
}
