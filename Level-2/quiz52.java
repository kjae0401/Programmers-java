package Level2;

public class quiz52 {
	public String solution(int n, int t, int m, int p) {
		// https://programmers.co.kr/learn/courses/30/lessons/17687
		/*
		 * [3차] n진수 게임
		 */
		String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		String answer = "";
		int cnt = 0, div=0, p_cnt=0;
		p--;
		
		while (answer.length() < t) {
			String temp = "";
			div = cnt;
			
			if (div == 0) { temp = "0"; }
			else {
				while (div > 0) {
					temp = array[(div%n)] + temp;
					div /= n;
				}
			}
			
			for(int i=0; i<temp.length(); i++) {
				if (answer.length() == t) break;
				if ((p_cnt%m) == p) {
					answer += temp.charAt(i);
				}
				p_cnt++;
			}
			cnt++;
		}
		
		return answer;
	}
}