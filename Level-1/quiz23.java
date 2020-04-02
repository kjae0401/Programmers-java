package Level1;

public class quiz23 {
	public int[] solution(long n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12932
		/*
		 * 자연수 뒤집어 배열로 만들기
		 */
		StringBuffer sb = new StringBuffer(Long.toString(n));
		sb.reverse();
		int[] answer = new int[sb.length()];
		
		for(int i=0; i<sb.length(); i++) {
			answer[i] = (int)(sb.charAt(i)-48);
		}
		
		return answer;
	}
}
