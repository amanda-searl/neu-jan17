package class5;

public class iPad implements PictureDevice {

	public void takeASnap() {
		System.out.println("iPad is also taking pictures");

	}

	@Override
	public void takePicture() {
		takeASnap();
		
	}

}
