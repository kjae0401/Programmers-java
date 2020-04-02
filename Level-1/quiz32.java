package Level1;

public class quiz32 {
	public String solution(String phone_number) {
		// https://programmers.co.kr/learn/courses/30/lessons/12948
		/*
		 * 핸드폰 번호 가리기
		 */
		String answer = "";
		StringBuffer sb = new StringBuffer(phone_number);
		
		for(int i=0; i<(sb.length()-4); i++)
			sb.setCharAt(i, '*');
		answer = sb.toString();
		
		return answer;
	}
}
