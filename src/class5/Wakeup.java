package class5;

import java.sql.Time;

public class Wakeup {

	public static void main(String[] args) {
		iPhone p = new iPhone();
		Wakeup w = new Wakeup();
		w.waitForAlarm(p, new Time(System.currentTimeMillis()));

	}

	public void waitForAlarm(AlarmDevice ad, Time t) {
		ad.ring(t);
	}

}
