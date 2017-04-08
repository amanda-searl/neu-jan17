package class9.swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

class Student {
	String id;
	String name;

	Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Students {
	private Map<String, Student> studentsMap = new LinkedHashMap<String, Student>();

	public void addStudent(String id, String name) {
		Student st = new Student(id, name);
		studentsMap.put(id, st);
	}

	public int getNumberOfStudents() {
		return studentsMap.size();
	}

	public Student getStudentAt(int row) {
		ArrayList<Student> students = new ArrayList<Student>(studentsMap.values());

		return students.get(row);
	}
}

class StudentTableModel implements TableModel {

	private Students students;

	StudentTableModel(Students students) {
		this.students = students;
	}

	@Override
	public int getRowCount() {
		return students.getNumberOfStudents();
	}

	@Override
	public int getColumnCount() {

		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 1) {
			return "Id";
		}
		return "Name";
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student st = students.getStudentAt(rowIndex);
		if (columnIndex == 1) {
			return st.id;
		}
		return st.name;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}

public class StudentFrame extends BaseFrame {
	private JTable studentTable;
	private Students students;
	private StudentTableModel stm;
	private JButton addButton;
	private JTextField idText;
	private JTextField nameText;

	@Override
	public void createComponents() {
		students = new Students();
		students.addStudent("100", "Frank");
		students.addStudent("101", "Kevin");
		students.addStudent("102", "George");
		students.addStudent("103", "Amanda");
		stm = new StudentTableModel(students);
		studentTable = new JTable(stm);

		addButton = new JButton("Create a Student");
		idText = new JTextField(10);
		nameText = new JTextField(10);
	}

	@Override
	public void addComponents() {
		Container con = getContentPane();
		JScrollPane jsp = new JScrollPane(studentTable);
		con.add(jsp, "Center");

		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter Id : "));
		panel.add(idText);

		panel.add(new JLabel("Enter Name : "));
		panel.add(nameText);

		panel.add(addButton);
		con.add(panel, "South");

	}

	class CreateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String id = idText.getText();
			String name = nameText.getText();
			students.addStudent(id, name);
			//studentTable.updateUI();
		}

	}

	@Override
	public void createLayout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListeners() {
		addButton.addActionListener(new CreateListener());

	}

	public static void main(String[] args) {
		new StudentFrame();

	}

}
