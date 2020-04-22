package Level2;

public class quiz12 {
	public String solution(String number, int k) {
		// https://programmers.co.kr/learn/courses/30/lessons/42883
		/*
		 * 큰 수 만들기 (탐욕법)
		 * + 스택
		 */
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<number.length(); i++) {
			int loop = (sb.length() > k) ? (sb.length()-k-1) : 0;
			
			for(int j=(sb.length()-1); (j>=loop && k>0); j--) {
				if (sb.charAt(j) < number.charAt(i)) {
					sb.delete(j, j+1);
					k--;
				} else {
					break;
				}
			}
			
			if (k == 0) {
				sb.append(number.substring(i));
				break;
			} else {
				sb.append(number.charAt(i));
			}
		}
		if (k > 0) sb.delete(sb.length()-k, sb.length());
		answer = sb.toString();
		return answer;
	}
}
