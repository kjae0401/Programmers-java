package Level1;

public class quiz6 {
	public String solution(int a, int b) {
		// https://programmers.co.kr/learn/courses/30/lessons/12901
		/*
		 * 2016년
		 */
		String answer = "";
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int date = 0;

		for (int i = 0; i < a - 1; i++) {
			date += month[i];
		}
		date += (b - 1);

		if (date % 7 == 0) {
			answer = "FRI";
		} else if (date % 7 == 1) {
			answer = "SAT";
		} else if (date % 7 == 2) {
			answer = "SUN";
		} else if (date % 7 == 3) {
			answer = "MON";
		} else if (date % 7 == 4) {
			answer = "TUE";
		} else if (date % 7 == 5) {
			answer = "WED";
		} else {
			answer = "THU";
		}
		return answer;
	}
}