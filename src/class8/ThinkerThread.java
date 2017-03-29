package class8;

class ThinkerThread extends Thread {
	private Person p;

	public ThinkerThread(Person p) {
		this.p = p;
	}

	public void run() {
		p.think();
	}

}