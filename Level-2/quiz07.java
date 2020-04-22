package Level2;

public class quiz07 {
	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/62048
		/*
		 * 멀쩡한 사각형
		 * 방정식과 최대공약수를 활용하는 문제.
		 * y = h/w x 를 만족한다.
		 * ★★★
		 */
		int w=8, h=12;
		long answer = 1;
		long big = (w >= h) ? w : h;
		long small = (w >= h) ? h : w;
		long gcd = 1;
		long width = w, height = h;
		
		
		while(gcd>0) {
			gcd = big % small;
			big = small;
			small = gcd;
		}
		gcd = big;
		answer = ((width * height) - (width + height - gcd));
		
		System.out.println(answer);
	}
}