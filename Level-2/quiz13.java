package Level2;

public class quiz13 {
	public int solution(String name) {
		// https://programmers.co.kr/learn/courses/30/lessons/42860
		/*
		 * 조이스틱 (탐욕법)
		 * BBBAAAAAAB 처럼 오른쪽으로 진행 중 왼쪽으로 가서 마무리할 때 더 적은 조작수를 가질 수 있는 경우가
		 * 존재한다. 이러한 경우는 현재 탐색 위치가 문장 전체 길이의 절반 이상일 때는 해당될 수 없다.
		 */
		int answer = 0, max = 0, cnt = 0;
		
		for(int i=0; i<name.length(); i++) {
			max += ((name.charAt(i) <= 'N') ? (name.charAt(i) - 65) : (91 - name.charAt(i)));
			if (i != name.length()-1) { max++; }
			
			if (name.charAt(i) == 'A') { cnt++; }
			else { cnt = 0; }
		}
		answer = max - cnt;
		
		for(int i=0; i<name.length()/2; i++) {
			max = cnt = 0;
			for(int j=i, loop_cnt=0; loop_cnt<name.length(); j--) {
				if (j < 0) { j += name.length(); }
				max += ((name.charAt(j) <= 'N') ? (name.charAt(j) - 65) : (91 - name.charAt(j)));
				if (j != name.length()-1) { max++; }
				
				if (name.charAt(j) == 'A') { cnt++; }
				else { cnt = 0; }
				
				loop_cnt++;
			}
			max = max + i - cnt;
			answer = (max > answer) ? answer : max;
		}
		
		return answer;
	}
}