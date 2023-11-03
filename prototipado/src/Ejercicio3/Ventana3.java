package Ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ventana3 extends JFrame implements ActionListener,KeyListener {

	JFrame frame;
	private JTextField txtTexto;
	JLabel lblTexto;
	JButton btnVaciar;
	 


	/**
	 * Create the application.
	 */
	public Ventana3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTexto.setBounds(26, 38, 190, 28);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		txtTexto.addKeyListener(this);
		
		lblTexto = new JLabel("");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTexto.setBounds(10, 99, 224, 23);
		frame.getContentPane().add(lblTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnVaciar.addActionListener(this);
		btnVaciar.setBounds(55, 196, 123, 33);
		frame.getContentPane().add(btnVaciar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnVaciar) {
			txtTexto.setText(" ");
			lblTexto.setText(" ");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource()==txtTexto) {
			lblTexto.setText(txtTexto.getText());
		}
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
