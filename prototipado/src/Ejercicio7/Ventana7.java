package Ejercicio7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana7 extends JFrame implements ActionListener {

	JFrame frame;
	JLabel lblTexto;
	JButton btnAzul,btnVerde,btnRojo,btnFondoAzul,btnFondoRojo,btnFondoVerde,btnTransparente,btnOpaca;
	

	/**
	 * Create the application.
	 */
	public Ventana7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTexto = new JLabel("Money");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblTexto.setBounds(139, 29, 138, 53);
		frame.getContentPane().add(lblTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(10, 121, 89, 23);
		btnAzul.addActionListener(this);
		frame.getContentPane().add(btnAzul);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(10, 185, 89, 23);
		btnVerde.addActionListener(this);
		frame.getContentPane().add(btnVerde);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(10, 151, 89, 23);
		btnRojo.addActionListener(this);
		frame.getContentPane().add(btnRojo);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBounds(312, 121, 111, 23);
		btnFondoAzul.addActionListener(this);
		frame.getContentPane().add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBounds(312, 151, 111, 23);
		btnFondoRojo.addActionListener(this);
		frame.getContentPane().add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setBounds(312, 185, 111, 23);
		btnFondoVerde.addActionListener(this);
		frame.getContentPane().add(btnFondoVerde);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.addActionListener(this);
		btnTransparente.setBounds(153, 136, 118, 23);
		frame.getContentPane().add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.addActionListener(this);
		btnOpaca.setBounds(153, 166, 118, 23);
		frame.getContentPane().add(btnOpaca);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAzul) {
			lblTexto.setForeground(Color.BLUE);
		}
		if (e.getSource()==btnRojo) {
			lblTexto.setForeground(Color.RED);
		}
		if (e.getSource()==btnVerde) {
			lblTexto.setForeground(Color.GREEN);
		}
		
		if (e.getSource()==btnFondoAzul) {
			lblTexto.setBackground(Color.BLUE);
		}
		if (e.getSource()==btnFondoRojo) {
			lblTexto.setBackground(Color.RED);
		}
		if (e.getSource()==btnFondoVerde) {
			lblTexto.setBackground(Color.GREEN);
		}
		
		if (e.getSource()==btnTransparente) {
			lblTexto.setOpaque(false);
		}
		if (e.getSource()==btnOpaca) {
			lblTexto.setOpaque(true);
		}
		
	}

}
