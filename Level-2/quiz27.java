package Level2;

import java.util.Stack;

public class quiz27 {
	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12909
		/*
		 * 올바른 괄호
		 * int 변수 사용하는 것이 효율성 면에서 더 좋을거같음.
		 * 조건이 주어진 반복문에서 break 보단 반복문의 종료 조건을 만들어주는 것이
		 * 효율성 면에서 조금 더 좋다.
		 * i = s.length(); 부분을 break; 로 변경시 효율성 부분에서 통과되지않음.
		 */
		String s = ")()(";
		boolean answer = true;
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == '(') { stack.push('('); }
			else {
                try {
                    if (stack.peek() == '(') { stack.pop(); }
                    else { stack.push(')'); }
                } catch(Exception e) {
                    stack.push(')');
                    i = s.length();
                }
			}
		}
		
		if (!stack.isEmpty()) answer = false;
		
		System.out.println(answer);
	}
}