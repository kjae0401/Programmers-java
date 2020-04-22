package Level2;

import java.util.Arrays;

public class quiz18 {
	public int solution(int[] citations) {
		// https://programmers.co.kr/learn/courses/30/lessons/42747
		/*
		 * H-Index (정렬)
		 */
		int answer=0;
		
		Arrays.sort(citations);
		
		for(int i=(citations.length-1); i>=0; i--) {
			if (answer <= citations[i]) {
				answer++;
			} else {
				break;
			}
		}
		
		return answer;
	}
}