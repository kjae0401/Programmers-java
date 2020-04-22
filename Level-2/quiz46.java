package Level2;

import java.util.LinkedList;

public class quiz46 {
	public int solution(int cacheSize, String[] cities) {
		// https://programmers.co.kr/learn/courses/30/lessons/17680
		/*
		 * [1차] 캐시
		 * LRU 알고리즘
		 */
		int answer = 0;
		LinkedList<String> link = new LinkedList<String>();
		
		if (cacheSize == 0) { answer = 5 * cities.length; }
		else {
			link.add(cities[0].toLowerCase());
			answer += 5;
			
			for(int i=1; i<cities.length; i++) {
				boolean hit = false;
				
				for(int j=0; j<link.size(); j++) {
					if (link.get(j).equals(cities[i].toLowerCase())) {
						link.add(link.remove(j));
						hit = true;
						break;
					}
				}
				
				if (hit) { answer++; }
				else {
					answer += 5;
					if (link.size() != cacheSize) { link.add(cities[i].toLowerCase()); }
					else {
						link.remove(0);
						link.add(cities[i].toLowerCase());
					}
				}
			}
		}
		return answer;
	}
}