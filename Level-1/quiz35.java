package Level1;

public class quiz35 {
	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12969
		/*
		 * 직사각형 별찍기
		 */
		int a = 5, b = 3;
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
