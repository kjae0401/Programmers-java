package Level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class quiz21 {
	static HashSet<String> hash = new HashSet<>();
	public int solution(int[][] baseball) {
		// https://programmers.co.kr/learn/courses/30/lessons/42841
		/*
		 * 숫자 야구 (완전탐색)
		 * 숫자 야구 조건에 부합될 수 있는 모든 수를 조합을 이용하여 hashset 변수에 저장한다
		 * 123~987 1~9까지 수 중 한번만 사용하여 만든 3자리 수
		 * 제시해준 숫자와 hash에 저장된 수를 비교한다.
		 * 자리와 숫자 모두 같으면 strike로 저장 자리는 다르나 해당 숫자를 contains하고있으면 ball
		 * 위에서 구한 strike, ball이 제공된 strike, ball과 같은 경우에는 hash에 남겨두고,
		 * 그렇지 않으면 hash에서 제거한다.
		 */
		int answer = 0;
		LinkedList<String> list = new LinkedList<>();
		int check[] = new int[9];
		Permutation(9, 3, list, check);
		
		for(int i=0; i<baseball.length; i++) {
			int strike = baseball[i][1], ball = baseball[i][2];
			Iterator<String> iterator = hash.iterator();
			ArrayList<String> al = new ArrayList<>();
			
			while(iterator.hasNext()) {
				String key = iterator.next();
				int s_strike = 0, b_ball = 0;
				String number = String.valueOf(baseball[i][0]);
				
				for(int j=0; j<3; j++) {
					if (key.charAt(j) == number.charAt(j))
						s_strike++;
				}
				
				for(int j=0; j<3; j++) {
					if (key.contains(String.valueOf(number.charAt(j))) && key.indexOf(number.charAt(j)) != j) {
						b_ball++;
					}
				}
				
				if (!(strike == s_strike && ball == b_ball))
					al.add(key);
			}
			
			for(int j=0; j<al.size(); j++)
				hash.remove(al.get(j));
		}
		answer = hash.size();
		return answer;
	}
	
	public static void Permutation(int n, int r, LinkedList<String> list, int[] check) {
		if(list.size() == r) {
			String temp = "";
			for(String i : list)
				temp = temp + i;
			hash.add(temp);
			return;
		}
		
		for(int i=0; i<n; i++) {
			if (check[i] == 0) {
				list.add(String.valueOf(i+1));
				check[i] = 1;
				Permutation(n, r, list, check);
				check[i] = 0;
				list.removeLast();
			}
		}
	}
}