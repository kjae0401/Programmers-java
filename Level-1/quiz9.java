package Level1;

import java.util.ArrayList;
import java.util.Collections;

public class quiz9 {
	public int[] solution(int[] arr, int divisor) {
		// https://programmers.co.kr/learn/courses/30/lessons/12910
		/*
		 * 나누어 떨어지는 숫자 배열
		 */
		int[] answer= {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i] % divisor) == 0) list.add(arr[i]);
		}
		
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			Collections.sort(list);
			answer = new int[list.size()];
			for(int i=0; i<answer.length; i++) {
				answer[i] = list.get(i);
			}
		}
		
		return answer;
	}
}
