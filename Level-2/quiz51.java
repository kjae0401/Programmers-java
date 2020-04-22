package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class quiz51 {
	public String[] solution(String[] files) {
		// https://programmers.co.kr/learn/courses/30/lessons/17686
		/*
		 * [3차] 파일명 정렬
		 * Comparator의 활용
		 * head1, head2가 대,소 구분없이 같을 경우 그 다음 num1, num2의 숫자를 비교,
		 * 다를 경우는 head1, head2를 비교
		 * return 값이 0 초과일 때 입력된 두 값이 swap됨.
		 */
		String[] answer = new String[files.length];

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String head1 = o1.split("[0-9]")[0];
				o1 = o1.replace(head1, "");
				head1 = head1.toLowerCase();
				String temp1 = "";
				for(char c : o1.toCharArray()) {
					if (Character.isDigit(c) && temp1.length() < 5) {
						temp1 += c;
					} else { break; }
				}
				int num1 = Integer.parseInt(temp1);
				
				String head2 = o2.split("[0-9]")[0];
				o2 = o2.replace(head2, "");
				head2 = head2.toLowerCase();
				String temp2 = "";
				for(char c : o2.toCharArray()) {
					if (Character.isDigit(c) && temp2.length() < 5) {
						temp2 += c;
					} else { break; }
				}
				int num2 = Integer.parseInt(temp2);

				return head1.equals(head2) ? num1 - num2 : head1.compareTo(head2);
			}
		};
		
		Arrays.sort(files, comp);
		for(int i=0; i<files.length; i++)
			answer[i] = files[i];
		
		return answer;
	}
}