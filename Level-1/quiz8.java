package Level1;

import java.util.ArrayList;

public class quiz8 {
	public int[] solution(int []arr) {
		// https://programmers.co.kr/learn/courses/30/lessons/12906?language=java
		/*
		 *  같은 숫자는 싫어
		 */
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0, j=0; i<arr.length; i++) {
			if (i == 0) { list.add(arr[i]); }
			else {
				if (list.get(j) == arr[i]) { continue; }
				else {
					list.add(arr[i]);
					j++;
				}
			}
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}