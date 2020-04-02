package Level1;

public class quiz39 {
	public int solution(String dartResult) {
		// https://programmers.co.kr/learn/courses/30/lessons/17682
		/*
		 * 다트 게임
		 * 다트 점수가 10인 경우, *, #가 여러개인 경우를 생각해야함
		 */
		int answer = 0;
		StringBuffer sb = new StringBuffer(dartResult);
		int[] score = {0,0,0};
		
		for(int i=0, j=0; i<sb.length(); ) {
			System.out.println(i);
			score[j] = sb.charAt(i) - 48;
			
			if (score[j] == 1 && sb.charAt(i+1) == '0') {
				score[j] = 10;
				i++;
			}
			
			if (sb.charAt(i+1) == 'S') { ; }
			else if (sb.charAt(i+1) == 'D') { score[j] *= score[j]; }
			else if (sb.charAt(i+1) == 'T') { score[j] *= (score[j] * score[j]); }

			j++;
			try {
				if (sb.charAt(i+2) == '*') {
					for(int k=(j==1)?j-1 : j-2; k<j; k++)
						score[k] *= 2;
					i += 3;
				}
				else if (sb.charAt(i+2) == '#') { 
					score[j-1] *= -1;
					i += 3;
				}
				else { i += 2; }
			} catch(Exception e) { i += 2; }
		}
		
		for(int i=0; i<3; i++) {
			answer += score[i];
		}
		
		return answer;
	}
}