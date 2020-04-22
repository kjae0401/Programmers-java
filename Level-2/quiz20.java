package Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class quiz20 {
	public int solution(String[][] clothes) {
		// https://programmers.co.kr/learn/courses/30/lessons/42578
		/*
		 * 위장 (해시)
		 * 해시를 통해 같은 종류의 옷 갯수를 계산한다. -> ArrayList가 아닌 Integer형을 사용해서 갯수만 저장해도됨.
		 * n = 1, (A+1)-1 -> A
		 * n = 2, (A+1)(B+1)-1 -> A+B+AB 옷의 종류가 n개일 때 조합할 수 있는 갯수
		 * n = 3, (A+1)(B+1)(C+1)-1 -> A+B+C+AB+AC+CB+ABC
		 * n = 4, (A+1)(B+1)(C+1)(D+1)-1 -> A+B+C+D+AB+AC+AD+BC+BD+CD+ABC+ABD+ACD+BCD
		 */
		int answer=1;
		HashMap<String, ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();
		
		for(int i=0; i<clothes.length; i++) {
			if (!hash.containsKey(clothes[i][1])) { hash.put(clothes[i][1], new ArrayList<String>()); }
			hash.get(clothes[i][1]).add(clothes[i][0]);
		}
		
		Iterator<String> iterator = hash.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			answer *= (hash.get(key).size()+1);
		}
		answer--;
		return answer;
	}
}