package class9.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;;

public class ColorScreen extends BaseFrame implements ActionListener {

	private JButton colorButton;
	private JComboBox colorOptions;
	private JTextField field;

	@Override
	public void createComponents() {
		colorButton = new JButton("Change Color");
		// Color[] colors = new Color[] { Color.RED, Color.GREEN, Color.BLUE,
		// Color.YELLOW };
		// String[] colors = new String[] { "Red", "Yellow", "Green" };
		MyColor[] colors = new MyColor[] { new MyColor(Color.RED), new MyColor(Color.YELLOW), new MyColor(Color.BLUE) };
		colorOptions = new JComboBox(colors);
		field = new JTextField(10);

	}

	@Override
	public void addComponents() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(new JLabel("Select the Color"));
		con.add(colorOptions);
		con.add(colorButton);
		con.add(field);
	}

	@Override
	public void createLayout() {
		// TODO Auto-generated method stub

	}

	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// consumeNonNumerics(e);

		}

		private void consumeNonNumerics(KeyEvent e) {
			int x = e.getKeyCode();
			String t = e.getKeyText(x);
			try {
				int a = Integer.parseInt(t);

			} catch (Exception ex) {
				System.out.println("Exception");
				e.consume();
				return;
			}
			System.out.println(x + " -> " + t);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			consumeNonNumerics(e);

		}

	}

	class MyWindowAdapter extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent we) {
			System.out.println("Closing Window");
			System.exit(0);
		}
	}

	@Override
	public void addListeners() {
		colorButton.addActionListener(this);
		colorButton.addFocusListener(new MyFocusListener());
		field.addKeyListener(new MyKeyListener());
		this.addWindowListener(new MyWindowAdapter());
	}

	class MyFocusListener implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			System.out.println("Focus received for " + e.getSource());

		}

		@Override
		public void focusLost(FocusEvent e) {
			System.out.println("Focus lost for " + e.getSource());

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Color c = (Color) colorOptions.getSelectedItem();
		// String s = (String) colorOptions.getSelectedItem();
		// Color c = makeColor(s);
		MyColor mc = (MyColor) colorOptions.getSelectedItem();
		Color c = mc.getColor();
		JOptionPane.showMessageDialog(this, "Color is " + c);
		this.getContentPane().setBackground(c);
	}

	private Color makeColor(String s) {
		if (s.equals("Red")) {
			return Color.RED;
		}
		if (s.equals("Yellow")) {
			return Color.YELLOW;
		}
		if (s.equals("Blue")) {
			return Color.BLUE;
		}
		return null;
	}

	class MyColor {
		private Color color;

		MyColor(Color color) {
			this.color = color;
		}

		Color getColor() {
			return color;
		}

		public String toString() {
			if (Color.RED == color)
				return "Red";
			if (Color.BLUE == color)
				return "Blue";
			if (Color.YELLOW == color)
				return "Yellow";
			return null;
		}
	}

	public static void main(String args[]) {
		new ColorScreen();
	}

}
