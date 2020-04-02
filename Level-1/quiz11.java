package Level1;

import java.util.Arrays;
import java.util.Comparator;

public class quiz11 {
	public String[] solution(String[] strings, int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12915
		/*
		 * 문자열 내 마음대로 정렬하기
		 * 사전식 정렬 후 n번째 이후로 정렬
		 * abc cbc adc이고 n=1일때 abc adc cbc로 나와야하지만
		 * 사전식 정렬을 하지않고 시행하면 abc cbc adc로 나온다
		 * 그리하여 문자열을 먼저 정렬한 후 한번 더 기준점을 토대로
		 * 정렬을 한번 더 시행한다.
		 */
		String[] answer = new String[strings.length];

	      Comparator<String> comp = new Comparator<String>() {
	          public int compare(String s1, String s2) {
	              char str1 = s1.charAt(n);
	              char str2 = s2.charAt(n);

	              if(str1 > str2)
	                  return 1;
	              else if(str1 < str2)
	                  return -1;
	              else
	                  return 0;
	          }
	      };

	      Arrays.sort(strings);
	      Arrays.sort(strings, comp);

	      for(int i = 0; i < strings.length; i++)
	          answer[i] = strings[i];
	      
	      return answer;
	}
}
