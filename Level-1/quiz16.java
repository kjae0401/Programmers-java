package Level1;

public class quiz16 {
	public int solution(int num) {
		// https://programmers.co.kr/learn/courses/30/lessons/12921
		/*
		 * 소수 찾기
		 * 에라토스테네스의 체 알고리즘 사용.
		 * ArrayList를 사용하면 효율성 부분에서 떨어지게 나옴.
		 */
		int answer = 0;

		boolean[] arr = new boolean[num + 1];
		arr[0] = arr[1] = false;
		for (int i = 2; i <= num; i += 1) {
			arr[i] = true;
		}

		for (int i = 2; i * i <= num; i += 1) {
			for (int j = i * i; j <= num; j += i) {
				arr[j] = false;
			}
		}
		for (int i = 0; i <= num; i += 1) {
			if (arr[i]) {
				answer++;
			}
		}

		return answer;
	}
}