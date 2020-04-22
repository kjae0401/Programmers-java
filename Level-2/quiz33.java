package Level2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class quiz33 {
	public String solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12939
		/*
		 * 최댓값과 최솟값
		 */
		String answer="";
		StringTokenizer st = new StringTokenizer(s, " ");
		int[] array = new int[st.countTokens()];
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			array[cnt++] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		answer = array[0] + " " + array[array.length-1];
		
		return answer;
	}
}
