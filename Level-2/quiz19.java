package Level2;

import java.util.Arrays;

public class quiz19 {
	public boolean solution(String[] phone_book) {
		// https://programmers.co.kr/learn/courses/30/lessons/42577
		/*
		 * 전화번호 목록
		 * string.startWith 사용하면 더 간결함.
		 */
		boolean answer = true;
		Arrays.sort(phone_book);
		
		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=i+1; j<phone_book.length; j++) {
				try {
					if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
						answer = false;
						break;
					}
				} catch (Exception e) {}
			}
			if (!answer) break;
		}
		
		return answer;
	}
}
