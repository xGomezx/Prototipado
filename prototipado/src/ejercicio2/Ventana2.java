package ejercicio2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ventana2 extends JFrame implements ActionListener{

	JFrame frame;
	private JTextField textField;

	JButton btnTraspasa1;
	JButton btnTraspasa2;
	
	JLabel lblTexto2;
	JLabel lblTexto1;
	/**
	 * Launch the application.
	 */
	



	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 25, 183, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblTexto1 = new JLabel("");
		lblTexto1.setBounds(10, 88, 116, 14);
		frame.getContentPane().add(lblTexto1);
		
		lblTexto2 = new JLabel("");
		lblTexto2.setBounds(136, 88, 126,14);
		frame.getContentPane().add(lblTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setBounds(10, 144, 116, 23);
		frame.getContentPane().add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
		btnTraspasa2 = new JButton("Traspasa2");
		btnTraspasa2.setBounds(136, 144, 126, 23);
		frame.getContentPane().add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnTraspasa1) {
			lblTexto1.setText(textField.getText());
			lblTexto2.setText("");
		}
		if (e.getSource() == btnTraspasa2) {
			lblTexto2.setText(textField.getText());
			lblTexto1.setText("");
		}
		
	}
}
