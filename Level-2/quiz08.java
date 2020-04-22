package Level2;

import java.util.Stack;

public class quiz08 {
	public int solution(String arrangement) {
		// https://programmers.co.kr/learn/courses/30/lessons/42585
		/*
		 * 쇠막대기 (스택/큐)
		 * () 일때 레이저가 발사된다. 그렇기에 )이전 (에 저장된 숫자가 잘린 막대 왼쪽의 갯수이다.
		 * (((()())(())())) 본 문제의 예제 중 가운데 부분을 예로 들어보면
		 * 레이저가 발사되는 시점인 )문자는 왼쪽의 갯수를, )이후 )의 갯수가 오른쪽 막대의 갯수임을 알 수 있다.
		 * (()())(()) 이 부분의 막대가 붙어서 나와서 헷갈릴 수 있지만 붙어있는 부분과 잘려서 다시 레이저에 의해
		 * 나뉘는 부분을 합해보면 3 + 3 + 3 + 1임을 알 수 있다(맨 뒤의 오른쪽부분은 생략)
		 * 이로인해 이전 문자가 ) 이고 해당 문자도 )이면 answer++을 해주고 pop을 시행
		 * 이전 문자가 (이여서 괄호가 닫히며 레이저가 발사되는 경우에는 answer에 stack에 저장된 숫자를 더해주고 pop해준다.
		 */
		int answer=0;
		Stack<String[]> stack = new Stack<>();
		String prev = "";
		
		for(int i=0; i<arrangement.length(); i++) {
			if (arrangement.charAt(i) == '(') {
				String number = (stack.isEmpty()) ? "0" : String.valueOf(Integer.parseInt(stack.peek()[1]) + 1);
				stack.push(new String[] {"(", number});
			} else {
				if (prev.equals(")")) {
					answer++;
				} else {
					answer += Integer.parseInt(stack.peek()[1]);
				}
				stack.pop();
			}
			
			prev = String.valueOf(arrangement.charAt(i));
		}
		
		return answer;
	}
}