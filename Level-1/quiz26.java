package Level1;

import java.util.Arrays;

public class quiz26 {
	public int[] solution(int[] arr) {
		// https://programmers.co.kr/learn/courses/30/lessons/12935
		/*
		 * 제일 작은 수 제거하기
		 */
		int[] answer = {};
		int[] temp = new int[arr.length];
		int min = 0;
		
		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			for(int i=0; i<arr.length; i++) {
				temp[i] = arr[i];
			}
			Arrays.sort(temp);
			min = temp[0];
			answer = new int[arr.length-1];
			
			for(int i=0, j=0; i<arr.length; i++) {
				if (min == arr[i]) { }
				else {
					try {
						answer[j++] = arr[i];
					} catch(Exception e) {}
				}
			}
		}
		
		return answer;
	}
}
