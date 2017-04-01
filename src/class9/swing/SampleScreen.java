package class9.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SampleScreen {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();

		jframe.setSize(400, 600);
		jframe.setTitle("New Window");
		jframe.setLocation(500, 500);

		JButton jb = new JButton("Click Me");
		JTextField tf = new JTextField(10);
		Container con = jframe.getContentPane();//
		
		JPanel panel = new JPanel();
		panel.add(jb);
		panel.add(tf);

		con.add(panel);

		jframe.setVisible(true);

	}

}
