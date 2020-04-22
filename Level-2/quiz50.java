package Level2;

import java.util.ArrayList;
import java.util.HashMap;

public class quiz50 {
	public int[] solution(String msg) {
		// https://programmers.co.kr/learn/courses/30/lessons/17684
		/*
		 * [3차] 압축
		 */
		int[] answer = {};
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<26; i++) {
			String temp = String.valueOf((char) (65+i));
			hash.put(temp, i+1);
		}
		
		int cnt = 0;
		String prev = "";
		while (cnt < msg.length()) {
			try {
				prev = prev + String.valueOf(msg.charAt(cnt));
				String temp = prev + String.valueOf(msg.charAt(cnt+1));
				if (!hash.containsKey(temp)) {
					hash.put(temp, hash.size()+1);
					al.add(hash.get(prev));
					prev = "";
				}
			} catch (Exception e) { al.add(hash.get(prev)); }
			cnt++;
		}
		
		answer = new int[al.size()];
		for(int i=0; i<answer.length; i++)
			answer[i] = al.get(i);
		
		return answer;
	}
}