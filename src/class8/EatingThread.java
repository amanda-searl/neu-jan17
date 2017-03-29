package class8;

class EatingThread extends Thread {
	private Person p;

	public EatingThread(Person p) {
		this.p = p;
	}

	public void run() {
		p.eat();
	}

}