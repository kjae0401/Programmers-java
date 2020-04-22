package Level2;

public class quiz32 {
	public int solution(int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12924
		/*
		 * 숫자의 표현
		 */
		int answer=1;
		
		for(int i=1; i<=((n/2)+1); i++) {
			int temp=0;
			
			for(int j=i; j<=((n/2)+1); j++) {
				temp += j;
				
				if (temp == n) { answer++; }
				else if (temp > n) { break; }
			}
		}
		
		return answer;
	}
}
