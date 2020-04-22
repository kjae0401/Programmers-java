package Level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class quiz28 {
	public int[] solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/64065
		/*
		 * 튜플
		 */
		String temp = s.substring(1, s.length()-1);
		String[] array = temp.split("\\{");
		int[] answer = new int[array.length-1];
		HashMap<Integer, HashSet<Integer>> hash = new HashMap<>();
		int first = -1;
		
		for(int i=1; i<array.length; i++) {
			if (i != (array.length-1)) { array[i] = array[i].substring(0, array[i].length()-2); }
			else { array[i] = array[i].substring(0, array[i].length()-1); }
			
			StringTokenizer st = new StringTokenizer(array[i], ",");
			int cnt = st.countTokens();
			hash.put(cnt, new HashSet<Integer>());
			
			while(st.hasMoreTokens()) {
				int key = Integer.parseInt(st.nextToken());
				hash.get(cnt).add(key);
				if (cnt == 1) first = key;
			}
		}
		
		for(int i=1; i<=hash.size(); i++) {
			if (i == 1) { answer[i-1] = first; }
			else {
				for(int j=0; j<answer.length; j++)
					hash.get(i).remove(answer[j]);
				Iterator<Integer> iterator = hash.get(i).iterator();
				
				while(iterator.hasNext())
					answer[i-1] = iterator.next();
			}
		}
		return answer;
	}
}