package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ventana1 extends JFrame implements ActionListener {

	JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JButton btnOcultarNombre;
	JButton btnVisuNombre;
	JButton btnOcultarCiudad;
	JButton btnVisuCiudad;
	JLabel lblNombre;
	JLabel lblCiudad;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 328, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 lblNombre = new JLabel("Juan Jose");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNombre.setBounds(33, 38, 120, 21);
		frame.getContentPane().add(lblNombre);
		
		 lblCiudad = new JLabel("Pereira");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblCiudad.setBounds(200, 33, 87, 30);
		frame.getContentPane().add(lblCiudad);
		
		 btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(10, 106, 131, 23);
		frame.getContentPane().add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		 btnVisuNombre = new JButton("Ver Nombre");
		btnVisuNombre.setBounds(10, 148, 131, 23);
		frame.getContentPane().add(btnVisuNombre);
		btnVisuNombre.addActionListener(this);
		
		 btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(171, 106, 131, 23);
		frame.getContentPane().add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);
		
		 btnVisuCiudad = new JButton("Ver Ciudad");
		btnVisuCiudad.setBounds(171, 148, 131, 23);
		frame.getContentPane().add(btnVisuCiudad);
		btnVisuCiudad.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnOcultarNombre) {
			lblNombre.setVisible(false);
		}
		if (e.getSource() == btnVisuNombre) {
			lblNombre.setVisible(true);
		}
		
		if (e.getSource() == btnOcultarCiudad) {
			lblCiudad.setVisible(false);
		}
		if (e.getSource() == btnVisuCiudad) {
			lblCiudad.setVisible(true);
		}
		
	}

}
