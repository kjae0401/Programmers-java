package Level2;

import java.util.ArrayList;
import java.util.HashMap;

public class quiz47 {
	public String[] solution(String[] record) {
		// https://programmers.co.kr/learn/courses/30/lessons/42888
		/*
		 * 오픈채팅방
		 */
		String[] answer = {};
		HashMap<String, String> hash = new HashMap<String, String>();
		ArrayList<String> al = new ArrayList<String>();

		for(int i=0; i<record.length; i++) {
			String[] record_split = record[i].split(" ");
			
			if (record_split[0].equals("Enter")) {
				al.add(record_split[1] + "@님이 들어왔습니다.");
				hash.put(record_split[1], record_split[2]);
				
			} else if (record_split[0].equals("Leave")) {
				al.add(record_split[1] + "@님이 나갔습니다.");
			} else {
				hash.put(record_split[1], record_split[2]);
			}
		}
		
		answer = new String[al.size()];
		for(int i=0; i<al.size(); i++) {
			String[] temp = al.get(i).split("@");
			answer[i] = hash.get(temp[0]) + temp[1];
		}
		
		return answer;
	}
}