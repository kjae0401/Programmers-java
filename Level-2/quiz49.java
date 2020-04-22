package Level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class quiz49 {
	public String solution(String m, String[] musicinfos) {
		// https://programmers.co.kr/learn/courses/30/lessons/17683
		/*
		 * [3차] 방금그곡
		 * 문제에서는 해당 곡이 없는 경우 '(None)'을 반환하라 되어있지만
		 * 실제 테스트케이스에서는 (None) 을 반환해줘야함
		 */
		String answer = "(None)";
		long max = 0;
		
		m = m.replace("C#", "H");
		m = m.replace("D#", "I");
		m = m.replace("F#", "J");
		m = m.replace("G#", "K");
		m = m.replace("A#", "L");
		for(int i=0; i<musicinfos.length; i++) {
			String[] info_array = musicinfos[i].split(",");
			SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
			Date d1, d2;
			long diff=0;
			info_array[3] = info_array[3].replace("C#", "H");
			info_array[3] = info_array[3].replace("D#", "I");
			info_array[3] = info_array[3].replace("F#", "J");
			info_array[3] = info_array[3].replace("G#", "K");
			info_array[3] = info_array[3].replace("A#", "L");
			
			try {
				d1 = f.parse(info_array[0]);
				d2 = f.parse(info_array[1]);
				diff = d2.getTime() - d1.getTime();
				diff /= 60000;
			} catch (ParseException e) { }
			
			if (info_array[3].length() > diff) { info_array[3] = info_array[3].substring(0, (int)diff); }
			else {
				while (info_array[3].length() < diff) {
					info_array[3] += info_array[3];
				}
			}
			
			if (max < diff && info_array[3].contains(m)) {
				max = diff;
				answer = info_array[2];
			}
		}
		
		return answer;
	}
}