package Level2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class quiz48 {
	static HashSet<String> hs;
	static int cnt;
	
	public int solution(String[][] relation) {
		// https://programmers.co.kr/learn/courses/30/lessons/42890
		/*
		 * 후보키
		 * 비트 마스크, 조합을 사용해서 풀이가 가능하다.
		 * 해당 코드는 조합을 이용하여 푼 것이다.
		 * 뽑을 수 있는 경우의 수를 도출하고, 도출한 값을 relation에 대입해서 하나의 문자열을 만든다.
		 * ex) 0 1 2 -> 0, 1, 2, 01, 02, 12 / 6개의 경우의 수 str += relation[i++][옆에서 도출한 수]
		 * HashSet을 통해 각 경우에서 값의 중복이 있는지 contains를 이용하여 찾는다.
		 * 중복이 존재하지않으면 최소성을 만족하는 경우의 수의 숫자들이 해당 경우의 숫자들에 포함되는지 여부를 확인,
		 * 포함되지않는다면 해당 경우는 최소성과 유일성을 만족하므로 전역변수로 선언한 HashSet에 해당 경우를 저장해준다.
		 * nCr <r = 1~n> 시행해주면된다.
		 */
		int answer = 0;
		LinkedList<Integer> list = new LinkedList<>();
		
		cnt = 0;
		hs = new HashSet<>();
		
		for(int i=1; i<=relation[0].length; i++) {
			Combination(list, relation[0].length, i, 0, relation, i);
		}

		answer = cnt;
		return answer;
	}
	
	public static void Combination(LinkedList<Integer> list, int n, int r, int index, String[][] relation, int ori) {
		if(r==0) {
			HashSet<String> temp = new HashSet<>();
			boolean flag = true;
			String number = "";
			
			for(int j : list)
				number += j;
			
			for(int i=0; i<relation.length && flag; i++) {
				String str = "";
				
				for(int j : list)
					str += ("!"+relation[i][j]+"!");
					
				if (!temp.contains(str)) { temp.add(str); }
				else { flag = false; }
				
			}
			
			if (flag) {
				Iterator<String> iterator = hs.iterator();
				boolean chk = true;
				
				while(iterator.hasNext()) {
					String compare = iterator.next();
					int t_n = 0;
					
					for(int i=0; i<number.length(); i++) {
						for(int j=0; j<compare.length(); j++) {
							if (number.charAt(i) == compare.charAt(j)) t_n++;
						}
					}
					
					if (t_n == compare.length()) {
						chk = false;
						break;
					}
				}

				
				if (chk) {
					hs.add(number);
					cnt++;
				}
			}

			return;
		}
		if(index==n) return;
		
		list.add(index);
		Combination(list,n,r-1,index+1, relation, ori);
		list.removeLast();
		Combination(list,n,r,index+1, relation, ori);
	}
}