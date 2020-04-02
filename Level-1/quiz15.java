package Level1;

public class quiz15 {
	public String solution(String[] seoul) {
		// https://programmers.co.kr/learn/courses/30/lessons/12919
		/*
		 * 서울에서 김서방 찾기
		 */
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		return answer;
	}
}
