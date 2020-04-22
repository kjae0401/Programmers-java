package Level2;

import java.util.Stack;

public class quiz14 {
	public String solution(String p) {
		// https://programmers.co.kr/learn/courses/30/lessons/60058
		/*
		 * [2020카카오공채] 괄호 변환
		 * 문제를 이해해야함.
		 * (, )의 개수는 항상 같음. '('로 stack이 처음 쌓이게되면 u는 항상 올바른 괄호 문자열이고,
		 * ')'로 시작되면 올바른 괄호 문자열이 아니다.
		 * 이렇게 '('과 ')'의 개수가 같아지는 기점을 기준으로 u, v를 만들어주고,
		 * if 1)stack에 저장된 값이 없으면 u는 올바른 문자열이므로 u + Conversion(v)를 통해 v에 대해서
		 * 다시 조건 탐색을 시행한다. 만약 v가 빈 문자열이면 초기 문자열 p에 대해서 탐색이 완료된 것이므로 u를
		 * 반환해주고 탐색을 종료한다.
		 * if 2)stack에 저장된 값이 존재하면 u는 올바른 괄호 문자열이 아니므로
		 * 문제에서 제시한대로 4-1 첫번째 문자 '(', 4-2 v에 대해 1단계부터 재귀수행 Conversion(v),
		 * 4-3 ')'을 붙임, 4-4 문자열 u의 첫번째와 마지막 문자열을 자른 뒤 나머지 문자열은 괄호 방향을 뒤집어서 붙임.
		 * '(' + Conversion(v) + ')' + temp 을 반환해준다.
		 * temp -> u.substring(1, u.length()-1)에서 나머지 문자열은 괄호 방향이 reverse된 문자열임.
		 */
		String answer = "";
		answer += Conversion(p);

		return answer;
	}
	
	public static String Conversion(String p) {
		int left = 0, right = 0;
		String u = "", v = "";
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<p.length(); i++) {
			if (left > 0 && right > 0 && left == right) { break; }
			else {
				if (p.charAt(i) == '(') {
					left++;
					stack.push('(');
				} else {
					right++;
					
					if (!stack.isEmpty() && stack.peek() == '(') { stack.pop(); }
					else { stack.push(')'); }
				}
				
				u += p.charAt(i);
			}
		}
		v = p.substring(u.length());
		
		if (stack.isEmpty()) {
			if (v.isEmpty()) { return u; }
			else { return u + Conversion(v); }
		} else {
			String temp = "";
			
			for(int i=0; i<u.length(); i++) {
				if (u.charAt(i) == '(') temp += ')';
				else { temp += '('; }
			}
			return '(' + Conversion(v) + ')' + temp.substring(1, temp.length()-1);
		}
	}
}