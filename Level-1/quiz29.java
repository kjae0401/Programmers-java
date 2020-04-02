package Level1;

public class quiz29 {
	public int solution(int num) {
		// https://programmers.co.kr/learn/courses/30/lessons/12943
		/*
		 * 콜라츠 추측
		 * int 범위를 넘어가는 오버플로 발생하는 수가 나올 수 있음.
		 */
		int answer = 0;
		double temp = (double)num;
		while (true) {
			if (temp == 1) break;
			if (temp%2 == 0) { temp = temp/2; }
			else { temp = (temp*3) + 1; }
			answer++;
			if(answer > 500) {
				answer = -1;
				break;
			}
		}
		return answer;
	}
}
