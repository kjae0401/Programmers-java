package Level1;

public class quiz4 {
	public int solution(int n, int[] lost, int[] reserve) {
		// https://programmers.co.kr/learn/courses/30/lessons/42862
		/*
		 * 체육복 탐욕 알고리즘
		 */
		int answer = 0, temp = 0;

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					temp++;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]) {
					n++;
					reserve[j] = -1;
					break;
				}
			}
		}

		answer = n - lost.length + temp;
		return answer;
	}
}
