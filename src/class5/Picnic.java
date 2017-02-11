package class5;

public class Picnic {

	public static void main(String[] args) {
		Camera c = new Camera();
		iPhone i = new iPhone();
		iPad ip = new iPad();
		PictureDevice pd = null;
		pd = c;
		pd = i;
		
		PictureDevice pds[] = new PictureDevice[3];
		pds[0] = c;
		pds[1] = i;

		Picnic p = new Picnic();
		p.takePicture(c);
		p.takePicture(i);
		p.takePicture(ip);
	}

	public void takePicture(PictureDevice pd) {
		pd.takePicture();
	}
	

}
