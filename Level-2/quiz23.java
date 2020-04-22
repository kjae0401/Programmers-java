package Level2;

import java.util.LinkedList;

public class quiz23 {
	static int cnt=0;
	public int solution(int[] numbers, int target) {
		// https://programmers.co.kr/learn/courses/30/lessons/43165
		/*
		 * 타겟 넘버
		 */
		int answer = 0;
		LinkedList<Integer> list = new LinkedList<>();
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++)
			sum += numbers[i];
		if (sum == target) { answer = 1; }
		else {
			for(int i=0; i<numbers.length; i++) {
				Combination(list, numbers.length, i, 0, sum, numbers, target);
			}
		}
		answer = cnt;
		return answer;
	}
	
	public static void Combination(LinkedList<Integer> list, int n, int r, int index, int sum, int[] numbers, int target) {
		if (r==0) {
			for(int i : list) {
				sum -= (2 * numbers[i]);
			}
			if (sum == target) cnt++;
			return;
		}
		if (index==n) return;
		
		list.add(index);
		Combination(list, n, r-1, index+1, sum, numbers, target);
		list.removeLast();
		Combination(list, n, r, index+1, sum, numbers, target);
	}
}