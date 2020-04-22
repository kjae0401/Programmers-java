package Level2;

import java.util.HashMap;
import java.util.LinkedList;

public class quiz15 {
	static HashMap<Long, Void> hash = new HashMap<>();
	static int cnt = 0;
	public int solution(String numbers) {
		// https://programmers.co.kr/learn/courses/30/lessons/42839
		/*
		 * 소수 찾기 (완전정렬)
		 */
		int answer=0;
		char[] array = numbers.toCharArray();
		int[] check = new int[array.length];
		LinkedList<Integer> list = new LinkedList<Integer>();
				
		for(int i=1; i<=array.length; i++)
			Permutation(array.length, i, list, check, array);
		
		answer = cnt;
		return answer;
	}
	
	public static void Permutation(int n, int r, LinkedList<Integer> list, int[] check, char[] array) {
		if(list.size() == r) {
			String temp = "";
			for(int i : list)
				temp = temp + array[i];
			Long t = Long.parseLong(temp);
			if (!hash.containsKey(t)) {
				hash.put(t, null);
				boolean flag = true;
				if (t <= 1) return;
				for(int i=2; i<t; i++) {
					if (t%i == 0) {
						flag = false;
						break;
					}
				}
				if (flag) cnt++;
			}
			return;
		}
		
		for(int i=0; i<n; i++) {
			if (check[i] == 0) {
				list.add(i);
				check[i] = 1;
				Permutation(n, r, list, check, array);
				check[i] = 0;
				list.removeLast();
			}
		}
	}
}
