package calendarTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

// 캘린더를 통하여 현재 시각(시,분,초)과 안녕하세요?를 1초 마다 나타나도록 작성
public class Hello extends Thread{

	@Override
	public void run() {
		
		while(true) {
			GregorianCalendar today = new GregorianCalendar();
			int hh = today.get(Calendar.HOUR_OF_DAY);
			int mm = today.get(Calendar.MINUTE);
			int ss = today.get(Calendar.SECOND);
			System.out.printf("%d:%d:%d 안녕하세요?\n",hh,mm,ss);
			try {
				Thread.sleep(1000);	//thread.sleep 예외처리를 해줘야함.
			} catch (Exception e) {}
		}
	}
}
