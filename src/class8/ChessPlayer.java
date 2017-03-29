package class8;

public class ChessPlayer extends Person {
	private boolean turn = false;
	private ChessPlayer partner = null;
	private boolean checkMate = false;

	public void setPartner(ChessPlayer cp) {
		this.partner = cp;
	}

	public ChessPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private void waitHere() {
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void setTurn(boolean b) {
		this.turn = b;
	}

	public void makeMove() {
		while (true) {
			if (isCheckMate()) {
				break;
			}
			if (turn == true) {
				System.out.println(getName() + " is making a move");
				findCheckMate();
				if (isCheckMate()) {
					break;
				}
				this.turn = false;
				partner.setTurn(true);
				synchronized (partner) {
					partner.notify();
				}
			} else {
				waitHere();
			}
		}
		synchronized(partner){
			partner.notify();
		}
		System.out.println("Game over");
	}

	private int counter = 0;

	private void findCheckMate() {
		counter++;
		if (counter == 5) {
			checkMate = true;
			partner.checkMate = true;
		}
	}

	public boolean isCheckMate() {
		return checkMate;
	}

}
