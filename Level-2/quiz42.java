package Level2;

import java.util.HashSet;

public class quiz42 {
	public int[] solution(int n, String[] words) {
		// https://programmers.co.kr/learn/courses/30/lessons/12981
		/*
		 * 영어 끝말잇기
		 */
		int[] answer = {0, 0};
		int cnt = 1;
		String prev = words[0];
		HashSet<String> hash = new HashSet<String>();
		hash.add(prev);
		boolean flag = false;
		
		while (cnt < words.length) {
			if(prev.charAt(prev.length()-1) == words[cnt].charAt(0) && !hash.contains(words[cnt])) {
				prev = words[cnt];
				hash.add(words[cnt]);
				cnt++;
			}
			else {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			answer[0] = (cnt % n) + 1;
			answer[1] = (cnt / n) + 1;
		}
		
		return answer;
	}
}