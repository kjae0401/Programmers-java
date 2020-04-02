package Level1;

public class quiz24 {
	public long solution(long n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12933
		/*
		 * 정수 내림차순으로 배치하기
		 */
		long answer=0;
		StringBuffer sb = new StringBuffer(Long.toString(n));
		
		for(int i=0; i<sb.length(); i++) {
			for(int j=0; j<sb.length()-i-1; j++) {
				if (sb.charAt(j) < sb.charAt(j+1)) {
					char c = sb.charAt(j);
					sb.setCharAt(j, sb.charAt(j+1));
					sb.setCharAt(j+1, c);
				}
			}
		}
		
		answer = Long.parseLong(sb.toString());
		return answer;
	}
}
