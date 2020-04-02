package Level1;

public class quiz21 {
	public String solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12930
		/*
		 * 이상한 문자 만들기
		 * 문장 맨 앞, 맨 뒤 공백 문자가 들어가는 경우까지 체크가능해야함.
		 */
		s = s.toLowerCase();
		String answer = "";
		char[] arr = s.toCharArray();
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == ' ') {
				cnt = 0;
				answer += arr[i];
				continue;
			}
			if (cnt%2 == 0) {
				arr[i] -= 32;
				cnt++;
			} else { cnt--; }
			answer += arr[i];
		}
		return answer;
	}
}
