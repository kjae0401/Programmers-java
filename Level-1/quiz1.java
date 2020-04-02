package Level1;

import java.util.ArrayList;

public class quiz1 {
	public int[] solution(int[] answers) {
		// https://programmers.co.kr/learn/courses/30/lessons/42840
		/*
		 * K번째수
		 */
		int one[] = {1,2,3,4,5};
		int two[] = {2,1,2,3,2,4,2,5};
		int three[] = {1,3,1,1,2,2,4,4,5,5};
		int[] answer = {};
		int a_[] = {0,0,0};
		
		for(int i=0; i<answers.length; i++) {
			if (one[i%one.length] == answers[i]) {
				a_[0]++;
			}
			if (two[i%two.length] == answers[i]) {
				a_[1]++;
			}
			if (three[i%three.length] == answers[i]) {
				a_[2]++;
			}
		}
		System.out.println(a_[0] + " " + a_[1] + " " + a_[2]);
		
		int max = a_[2] > ((a_[0] > a_[1]) ? a_[0] : a_[1]) ? a_[2] : ((a_[0] > a_[1]) ? a_[0] : a_[1]);
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i<3; i++) {
			if (a_[i] == max)
				temp.add(i);
			System.out.println(temp.size());
		}
		answer = new int[temp.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = temp.get(i)+1;
			System.out.println(answer[i]);
		}
		
		return answers;
	}
}