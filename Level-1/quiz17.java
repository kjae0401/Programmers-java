package Level1;

public class quiz17 {
	public String solution(int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12922
		/*
		 * 수박수박수박수박수박수?
		 */
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
		return answer;
	}
}
