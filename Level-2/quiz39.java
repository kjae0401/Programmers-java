package Level2;

import java.util.Stack;

public class quiz39 {
	public int solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12973
		/*
		 * 짝지어 제거하기
		 * 스택을 사용하지 않으면 시간 초과 문제가 생긴다.
		 */
		int answer = 0;
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else {
				if (stack.peek() == s.charAt(i)) { stack.pop(); }
				else { stack.push(s.charAt(i)); }
			}
		}
		
		if (stack.isEmpty()) answer = 1;
		return answer;
	}
}
