package Level2;

import java.util.HashMap;
import java.util.Iterator;

public class quiz44 {
	public int solution(String str1, String str2) {
		// https://programmers.co.kr/learn/courses/30/lessons/17677
		/*
		 * [1차] 뉴스 클러스터링
		 */
		int answer = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		HashMap<Integer, HashMap<String, Integer>> hash = new HashMap<Integer, HashMap<String, Integer>>();
		int size1 = 0, size2 = 0, big = 0, small = 0;
		hash.put(0, new HashMap<String, Integer>());
		hash.put(1, new HashMap<String, Integer>());
		
		for(int i=0; i<(str1.length()-1); i++) {
			if ((str1.charAt(i) >= 97 && str1.charAt(i) <= 122) && (str1.charAt(i+1) >= 97 && str1.charAt(i+1) <= 122)) {
				String key = Character.toString(str1.charAt(i)) + Character.toString(str1.charAt(i+1));
				if (!hash.get(0).containsKey(key)) { hash.get(0).put(key, 1); }
				else { hash.get(0).put(key, hash.get(0).get(key)+1); }
				size1++;
			}
		}

		for(int i=0; i<(str2.length()-1); i++) {
			if ((str2.charAt(i) >= 97 && str2.charAt(i) <= 122) && (str2.charAt(i+1) >= 97 && str2.charAt(i+1) <= 122)) {
				String key = Character.toString(str2.charAt(i)) + Character.toString(str2.charAt(i+1));
				if (!hash.get(1).containsKey(key)) { hash.get(1).put(key, 1); }
				else { hash.get(1).put(key, hash.get(1).get(key)+1); }
				size2++;
			}
		}
		big = (size1 < size2) ? 1 : 0;
		small = (size1 < size2) ? 0 : 1;
		Iterator<String> iterator = hash.get(big).keySet().iterator();
		int and = 0;
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (hash.get(small).get(key) != null && hash.get(big).get(key) != null) {
				and += (hash.get(small).get(key) < hash.get(big).get(key)) ? hash.get(small).get(key) : hash.get(big).get(key);
			}
		}
		if (size1 == 0 && size2 == 0) { answer = 65536; }
		else if (and == 0) { answer = 0; }
		else { answer = (and * 65536) / (size1 + size2-and); }

		return answer;
	}
}