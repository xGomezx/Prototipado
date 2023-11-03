package Ejercicio9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana9 extends JFrame implements ActionListener{

	JFrame frame;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	JLabel lblTexto;
	JButton btnConcatena;
	
	/**
	 * Create the application.
	 */
	public Ventana9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 308, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPalabra1 = new JLabel("Palabra 1:");
		lblPalabra1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPalabra1.setBounds(10, 32, 76, 14);
		frame.getContentPane().add(lblPalabra1);
		
		JLabel lblPalabra2 = new JLabel("Palabra 2:");
		lblPalabra2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPalabra2.setBounds(10, 74, 76, 14);
		frame.getContentPane().add(lblPalabra2);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(78, 30, 184, 20);
		frame.getContentPane().add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(78, 72, 184, 20);
		frame.getContentPane().add(txtPalabra2);
		
		lblTexto = new JLabel("Texto:");
		lblTexto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTexto.setBounds(10, 135, 220, 14);
		frame.getContentPane().add(lblTexto);
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnConcatena.setBounds(84, 188, 127, 40);
		btnConcatena.addActionListener(this);
		frame.getContentPane().add(btnConcatena);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnConcatena) {
			lblTexto.setText("Texto: "+txtPalabra1.getText()+txtPalabra2.getText());
		}
	}
}
