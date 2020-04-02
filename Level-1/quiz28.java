package Level1;

public class quiz28 {
	public int[] solution(int n, int m) {
		// https://programmers.co.kr/learn/courses/30/lessons/12940
		/*
		 * 최대공약수와 최대공배수
		 * 유클리드 호제법을 사용
		 * 2개의 자연수 a,b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단 a>b),
		 * a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
		 * 이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고,
		 * 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여
		 * 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.
		 * 최소 공배수 = a * b / G ※ G = 최대 공약수
		 */
		int[] answer= {0, 0};
		int temp1, temp2, r=1;
		
		temp1 = n; temp2 = m;
		if (n < m) {
			n = temp2;
			m = temp1;
		}
		while(r > 0) {
			r = n % m;
			n = m;
			m = r;
		}
		answer[0] = n;
		answer[1] = (temp1 * temp2)/n;
		
		return answer;
	}
}
