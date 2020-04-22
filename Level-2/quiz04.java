package Level2;

public class quiz04 {
	public String solution(int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12899
		/*
		 * 124 나라의 숫자
		 * string 배열을 사용하면 더 간결함.
		 * 나머지가 0일때 n값을 -1 해주는 것이 키포인트임.
		 */
		String answer = "";
		int temp = 0;
		
		while (n >= 1) {
			temp = n % 3;
			n = n / 3;
			
			if(temp == 0) {
				answer = "4" + answer;
				n -= 1;
			} else {
				answer = temp + answer;
			}
		}
		
		return answer;
	}
}
