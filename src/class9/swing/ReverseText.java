package class9.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ReverseText extends BaseFrame {

	private JButton reverseButton;
	private JTextField reverseTextField;

	@Override
	public void createComponents() {
		reverseButton = new JButton("Reverse Text");
		reverseTextField = new JTextField(20);
	}

	@Override
	public void addComponents() {
		Container con = getContentPane();
		con.add(reverseButton);
		con.add(reverseTextField);

	}

	@Override
	public void createLayout() {
		Container con = this.getContentPane();
		FlowLayout fl = new FlowLayout();
		con.setLayout(fl);
	}

	class ReverseTextBehavior implements ActionListener {

		public void reverse(JTextField tf) {
			String x = tf.getText();
			String r = new StringBuffer(x).reverse().toString();
			tf.setText(r);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			reverse(reverseTextField);

		}

	}

	class AnotherBehavior implements ActionListener {
		int counter = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			counter++;
			System.out.println("Clicked Button -> " + counter);

		}

	}

	@Override
	public void addListeners() {
		ReverseTextBehavior behavior = new ReverseTextBehavior();
		reverseButton.addActionListener(behavior);

		AnotherBehavior ab = new AnotherBehavior();
		reverseButton.addActionListener(ab);
	}

	public static void main(String args[]) {
		new ReverseText();
	}

}
