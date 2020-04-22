package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class quiz16 {
	public String solution(int[] numbers) {
		// https://programmers.co.kr/learn/courses/30/lessons/42746
		/*
		 * 가장 큰 수
		 * Permutation을 사용하려했지만 재귀 함수를 이용하는 것이라 속도가 현저히 떨어짐.
		 * String A+B, B+A 를 비교하여 B+A 가 크다면 스왑해줌.
		 * compare시 조건에 따라 return 0, 1, -1를 제대로 명시하지 않으면 문제가 해결되지 않음.
		 * 모든 수가 0일 때 answer도 "0"이 되어야하지만 answer가 매우 큰 수일 가능성이 크기때문에
		 * Long으로 처리하려 했지만 그마저도 처리가 되지않아서 Double형으로 형변환 후 0이랑 비교하고,
		 * 값이 0이면 answer를 "0"으로 설정해줌.
		 */
		String answer = "";
		String[] array = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++)
			array[i] = String.valueOf(numbers[i]);
		
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1 = o1+o2;
				String s2 = o2+o1;
				
				if (Long.valueOf(s1) < Long.valueOf(s2)) {  return 1; }
				else if (Long.valueOf(s1) > Long.valueOf(s2)){ return -1; }
				else { return 0; }
			}
		};
		
		Arrays.sort(array, comp);
		
		for(int i=0; i<numbers.length; i++)
			answer+= array[i];
		if (Double.parseDouble(answer) == 0) { answer = "0"; }
		return answer;
	}
}