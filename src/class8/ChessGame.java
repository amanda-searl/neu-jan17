package class8;

public class ChessGame {

	public static void main(String[] args) {
		ChessPlayer bob = new ChessPlayer("Bob");
		ChessPlayer will = new ChessPlayer("Will");
		bob.setPartner(will);
		will.setPartner(bob);
		bob.setTurn(true);

		new ChessThread(bob).start();
		new ChessThread(will).start();
	}

}

class ChessThread extends Thread {
	private ChessPlayer cp;

	public ChessThread(ChessPlayer cp) {
		this.cp = cp;
	}

	public void run() {
		cp.makeMove();
	}
}
