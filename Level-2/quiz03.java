package Level2;

import java.util.Stack;

public class quiz03 {
	public int[] solution(int[] progresses, int[] speeds) {
		// https://programmers.co.kr/learn/courses/30/lessons/42586
		/*
		 * 기능개발(스택/큐)
		 * 하루에 한개의 기능 배포가아닌 "한번" 배포 가능이다.
		 * 한번 배포 시 여러개의 기능을 배포할 수도 있다.
		 */
		int[] answer = {};
		int value = 0, cnt;
		Stack<Integer[]> stack = new Stack<Integer[]>();
		Integer[] temp;
		
		for(int i=0; i<progresses.length; i++) {
			value = (int) Math.ceil(((double)(100-progresses[i]) / (double)speeds[i]));
			
			if (i == 0) { stack.push(new Integer[] {value, 1}); }
			else {
				if (value <= stack.peek()[0]) {
					temp = new Integer[] {stack.peek()[0], stack.peek()[1]+1};
					stack.pop();
					stack.push(temp);
				} else {
					stack.push(new Integer[] {value, 1});
				}
			}
		}
		
		answer = new int[stack.size()];
		cnt = stack.size() - 1;
		while (!stack.isEmpty()) {
			answer[cnt] = stack.pop()[1];
			cnt--;
		}
		
		return answer;
	}
}
