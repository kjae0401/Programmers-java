package Level2;

import java.util.Stack;

public class quiz01 {
	public int[] solution(int[] prices) {
		// https://programmers.co.kr/learn/courses/30/lessons/42584
		/*
		 * 주식거래 (스택/큐)
		 * 주식 마지막 날이 아닌 이상 주식 유지일은 최소 +1 이다.
		 * 스택에 저장된 값보다 값이 큰 경우는 주식이 떨어진 경우이다.
		 * 스택에 저장된 값보다 값이 작은 경우는 주식이 유지된 경우이며, 저장된 일 수를 day에 더해준다.
		 */
		int[] answer = new int[prices.length];
		Stack<Integer[]> stack = new Stack<Integer[]>();
		
		for(int i=(prices.length-2); i>=0; i--) {
			int day = 0;
			
			while (!stack.isEmpty() && stack.peek()[0] >= prices[i]) {
				day += stack.pop()[1];
			}
			
			stack.push(new Integer[] {prices[i], day+1});
			answer[i] = day+1;
		}
		
		return answer;
	}
}