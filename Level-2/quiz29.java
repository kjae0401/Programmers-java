package Level2;

public class quiz29 {
	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12911
		/*
		 * 다음 큰 숫자
		 * Integer.bitCount(int i) 함수는 i를 비트화 하였을 때 1의 갯수를 반환해준다.
		 */
		int n = 78;
		int answer = 0;
		boolean flag = true;
		int one_cnt = N2(n++);
		
		while (flag) {
			if (one_cnt == N2(n)) {
				answer = n;
				flag = false;
			}
			n++;
		}
		System.out.println(answer);
	}
	
	public static int N2(int n) {
		int one_sum = 0;
		
		while (n > 0) {
			if (n%2 == 1) one_sum++;
			n = n/2;
		}
		
		return one_sum;
	}
}