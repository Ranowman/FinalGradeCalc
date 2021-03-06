package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField finalgrade;
	private JTextField desiredgrade;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		frame.setBounds(100, 100, 920, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		grade1 = new JTextField();
		grade1.setText("0");
		grade1.setBounds(221, 60, 120, 39);
		frame.getContentPane().add(grade1);
		grade1.setColumns(10);
		
		worth1 = new JTextField();
		worth1.setText("0");
		worth1.setBounds(448, 60, 120, 39);
		frame.getContentPane().add(worth1);
		worth1.setColumns(10);
		
		grade2 = new JTextField();
		grade2.setText("0");
		grade2.setBounds(221, 122, 120, 39);
		frame.getContentPane().add(grade2);
		grade2.setColumns(10);
		
		worth2 = new JTextField();
		worth2.setText("0");
		worth2.setBounds(448, 122, 120, 39);
		frame.getContentPane().add(worth2);
		worth2.setColumns(10);
		
		grade3 = new JTextField();
		grade3.setText("0");
		grade3.setBounds(221, 187, 120, 39);
		frame.getContentPane().add(grade3);
		grade3.setColumns(10);
		
		worth3 = new JTextField();
		worth3.setText("0");
		worth3.setBounds(448, 187, 120, 39);
		frame.getContentPane().add(worth3);
		worth3.setColumns(10);
		
		grade4 = new JTextField();
		grade4.setText("0");
		grade4.setBounds(221, 249, 120, 39);
		frame.getContentPane().add(grade4);
		grade4.setColumns(10);
		
		worth4 = new JTextField();
		worth4.setText("0");
		worth4.setBounds(448, 249, 120, 39);
		frame.getContentPane().add(worth4);
		worth4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Grade");
		lblNewLabel.setBounds(242, 10, 138, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWorth = new JLabel("Worth");
		lblWorth.setBounds(471, 10, 138, 39);
		frame.getContentPane().add(lblWorth);
		
		grade5 = new JTextField();
		grade5.setText("0");
		grade5.setBounds(221, 307, 120, 39);
		frame.getContentPane().add(grade5);
		grade5.setColumns(10);
		
		worth5 = new JTextField();
		worth5.setText("0");
		worth5.setBounds(448, 307, 120, 39);
		frame.getContentPane().add(worth5);
		worth5.setColumns(10);
		
		JLabel lblYouNeedA = new JLabel("You need a ");
		lblYouNeedA.setBounds(31, 389, 178, 39);
		frame.getContentPane().add(lblYouNeedA);
		
		finalgrade = new JTextField();
		finalgrade.setEditable(false);
		finalgrade.setBounds(204, 386, 213, 45);
		frame.getContentPane().add(finalgrade);
		finalgrade.setColumns(10);
		
		JLabel lblOnTheFinal = new JLabel("on the final to get a  ");
		lblOnTheFinal.setBounds(448, 392, 319, 39);
		frame.getContentPane().add(lblOnTheFinal);
		
		desiredgrade = new JTextField();
		desiredgrade.setEditable(false);
		desiredgrade.setBounds(31, 450, 172, 45);
		frame.getContentPane().add(desiredgrade);
		desiredgrade.setColumns(10);
		
		JLabel lblInTheClass = new JLabel("in the class");
		lblInTheClass.setBounds(218, 453, 248, 39);
		frame.getContentPane().add(lblInTheClass);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(659, 137, 203, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDesiredGrade = new JLabel("Desired Grade");
		lblDesiredGrade.setBounds(659, 85, 213, 39);
		frame.getContentPane().add(lblDesiredGrade);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double g1,g2,g3,g4,g5;
				double w1,w2,w3,w4,w5;
				double current_grade;
				double gradesLeft;
				double desired;
				double i;
				double finalg;
				try {
					desired=Double.parseDouble(textField.getText());
					
					g1=Double.parseDouble(grade1.getText());
					g2=Double.parseDouble(grade2.getText());
					g3=Double.parseDouble(grade3.getText());
					g4=Double.parseDouble(grade4.getText());
					g5=Double.parseDouble(grade5.getText());
					
					w1=Double.parseDouble(worth1.getText())/100;
					w2=Double.parseDouble(worth2.getText())/100;
					w3=Double.parseDouble(worth3.getText())/100;
					w4=Double.parseDouble(worth4.getText())/100;
					w5=Double.parseDouble(worth5.getText())/100;
					
					if (w1+w2+w3+w4+w5<1.0 && hasNegative(g1,g2,g3,g4,g5,w1,w2,w3,w4,w5,desired)==false) {
						gradesLeft = (1.0-w1-w2-w3-w4-w5)*100;
						current_grade=(g1*w1)+(g2*w2)+(g3*w3)+(g4*w4)+(g5*w5);
						i=desired-current_grade;
						finalg=Math.round(((i/gradesLeft)*100)*100.0)/100.0;
						desiredgrade.setText(textField.getText());
						finalgrade.setText(Double.toString(finalg)+"%");
					}
					else {
						JOptionPane.showMessageDialog(null, "no grades left or negative number entered");
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "entries must only be numbers");
				}
			}
		});
	
		btnCalculate.setBounds(659, 209, 197, 47);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblAssignment = new JLabel("Assignment");
		lblAssignment.setBounds(19, 10, 163, 39);
		frame.getContentPane().add(lblAssignment);
		
		textField_1 = new JTextField();
		textField_1.setBounds(19, 60, 161, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(19, 119, 161, 39);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(19, 187, 161, 39);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(19, 249, 161, 39);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(19, 307, 161, 39);
		frame.getContentPane().add(textField_5);
	}
	private boolean hasNegative(double...values) {
		for (double i:values) {
			if (i<0) {
				return true;
			}
		}
		return false;
	}
}
