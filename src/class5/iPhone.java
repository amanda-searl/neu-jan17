package class5;

import java.sql.Time;

public class iPhone extends Phone implements PictureDevice, AlarmDevice {
	public void takePicture() {
		System.out.println("iPhone is taking picture");
	}

	@Override
	public void ring(Time t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void snooze(long minutes) {
		// TODO Auto-generated method stub
		
	}
}
