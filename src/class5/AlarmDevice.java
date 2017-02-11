package class5;

import java.sql.Time;

public interface AlarmDevice {
	void ring(Time t);
	void snooze(long minutes);
}
