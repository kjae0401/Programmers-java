package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class quiz38 {
	public int[] solution(int N, int[] stages) {
		// https://programmers.co.kr/learn/courses/30/lessons/42889
		/*
		 * 실패율
		 */
		int[] answer = new int[N];
		TreeMap<Integer, Double> tree = new TreeMap<Integer, Double>();
		int temp = stages.length, cnt;
		
		for(int i=1; i<=N; i++) {
			cnt = 0;
			for(int j=0; j<stages.length; j++) {
				if(i == stages[j]) cnt++;
			}
			tree.put(i, (cnt == 0) ? 0 : (double)cnt/temp);
			temp -= cnt;
		}
		HashMap<Integer, Double> hash = new HashMap<Integer, Double>(tree);
		Iterator<Integer> it = sortBytValue(hash).iterator();
		cnt = 0;
		
		while(it.hasNext()) {
			Integer t = it.next();
			answer[cnt++] = t;
		}
		
		return answer;
	}
	
	public static List sortBytValue(final Map map) {
		List<Integer> list = new ArrayList();
		list.addAll(map.keySet());
		
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable) v2).compareTo(v1);
			}
		});
		return list;
	}
}