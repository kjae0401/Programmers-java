package Level1;

import java.util.HashMap;
import java.util.Iterator;

public class quiz2 {
	public String solution(String[] participant, String[] completion) {
		// https://programmers.co.kr/learn/courses/30/lessons/42576
		/*
		 * 완주하지 못한 선수
		 */
        String answer = "";
        HashMap<String, Integer> data = new HashMap<String, Integer>();
		for(int i=0; i<participant.length; i++) {
			if (data.containsKey(participant[i])) {
				data.put(participant[i], data.get(participant[i])+1);
			} else {
				data.put(participant[i], 1);
			}
		}
		
		for(int i=0; i<completion.length; i++) {
			if (data.get(completion[i]) > 1) {
				data.put(completion[i], data.get(completion[i])-1);
			} else {
				data.remove(completion[i]);
			}
		}
		
		Iterator<String> keys= data.keySet().iterator();
		while(keys.hasNext()) {
			answer = keys.next();
		}
        return answer;
    }
}
