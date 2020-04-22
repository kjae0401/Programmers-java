package Level2;

public class quiz11 {
	public int solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/60057
		/*
		 * [2020카카오공채]문자열 압축
		 */
		int answer = 0;
		String rcev = "";
		int min = s.length();
		
		for(int i=1; i<=(s.length()/2); i++) {
			int cnt = 1;
			String temp = "";
			rcev = s.substring(0, 0+i);

			for(int j=i; j<s.length(); j+=i) {
				try {
					if (rcev.equals(s.substring(j, j+i))) {
						cnt++;
					} else {
						if (cnt > 1) {
							temp = temp + cnt + rcev;
						} else {
							temp = temp + rcev;
						}
						rcev = s.substring(j, j+i);
						cnt = 1;
					}
				} catch(Exception e) { rcev += s.substring(j); }
			}
			if (cnt > 1) { temp += (cnt+rcev); }
			else { temp += rcev; }
			min = (temp.length() <= min) ? temp.length() : min;
		}
		answer = min;
		return answer;
	}
}
