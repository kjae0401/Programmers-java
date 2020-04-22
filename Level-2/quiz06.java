package Level2;

import java.util.Stack;

public class quiz06 {
	public int[] solution(int[] heights) {
		// https://programmers.co.kr/learn/courses/30/lessons/42588
		/*
		 * 탑 (스택/큐)
		 */
		int[] answer = new int[heights.length];
		Stack<Integer[]> stack = new Stack<Integer[]>();
		stack.push(new Integer[] {(heights.length-1), heights[heights.length-1]});
				
		for(int i=(answer.length-2); i>=0; i--) {
			while(!stack.isEmpty()) {
				System.out.print(stack.peek()[1] + " ");
				
				if(heights[i] > stack.peek()[1]) {
					answer[stack.peek()[0]] = i+1;
					stack.pop();
				} else {
					stack.push(new Integer[] {i, heights[i]});
					break;
				}
				
				if (stack.isEmpty()) {
					stack.push(new Integer[] {i, heights[i]});
					break;
				}
			}
		}
		
		return answer;
	}
}
