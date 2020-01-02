package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FinalGradeCalc {

	private JFrame frame;
	private JTextField grade1;
	private JTextField worth1;
	private JTextField grade2;
	private JTextField worth2;
	private JTextField grade3;
	private JTextField worth3;
	private JTextField grade4;
	private JTextField worth4;
	private JTextField grade5;
	private JTextField worth5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalGradeCalc window = new FinalGradeCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FinalGradeCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 847, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		grade1 = new JTextField();
		grade1.setBounds(131, 60, 225, 45);
		frame.getContentPane().add(grade1);
		grade1.setColumns(10);
		
		worth1 = new JTextField();
		worth1.setBounds(438, 60, 193, 45);
		frame.getContentPane().add(worth1);
		worth1.setColumns(10);
		
		grade2 = new JTextField();
		grade2.setBounds(131, 122, 225, 39);
		frame.getContentPane().add(grade2);
		grade2.setColumns(10);
		
		worth2 = new JTextField();
		worth2.setBounds(438, 122, 193, 39);
		frame.getContentPane().add(worth2);
		worth2.setColumns(10);
		
		grade3 = new JTextField();
		grade3.setBounds(131, 187, 225, 45);
		frame.getContentPane().add(grade3);
		grade3.setColumns(10);
		
		worth3 = new JTextField();
		worth3.setBounds(438, 187, 193, 45);
		frame.getContentPane().add(worth3);
		worth3.setColumns(10);
		
		grade4 = new JTextField();
		grade4.setBounds(131, 249, 225, 45);
		frame.getContentPane().add(grade4);
		grade4.setColumns(10);
		
		worth4 = new JTextField();
		worth4.setBounds(438, 249, 193, 45);
		frame.getContentPane().add(worth4);
		worth4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Grade");
		lblNewLabel.setBounds(204, 10, 138, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWorth = new JLabel("Worth");
		lblWorth.setBounds(487, 10, 138, 39);
		frame.getContentPane().add(lblWorth);
		
		grade5 = new JTextField();
		grade5.setBounds(131, 307, 225, 45);
		frame.getContentPane().add(grade5);
		grade5.setColumns(10);
		
		worth5 = new JTextField();
		worth5.setBounds(438, 307, 193, 45);
		frame.getContentPane().add(worth5);
		worth5.setColumns(10);
	}
}
