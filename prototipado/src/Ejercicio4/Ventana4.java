package Ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 extends JFrame implements ActionListener {

	JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	JButton btnDesactivar,btnActivar,btnAceptar;
	JLabel lblFrase;


	/**
	 * Create the application.
	 */
	public Ventana4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 266, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNombre.setBounds(10, 35, 64, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCiudad.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(lblCiudad);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtNombre.setBounds(60, 33, 157, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(60, 64, 157, 20);
		frame.getContentPane().add(txtCiudad);
		txtCiudad.setColumns(10);
		
		lblFrase = new JLabel("");
		lblFrase.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblFrase.setBounds(10, 99, 219, 20);
		frame.getContentPane().add(lblFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(82, 130, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		btnActivar = new JButton("Activar");
		btnActivar.addActionListener(this);
		btnActivar.setBounds(25, 164, 100, 23);
		frame.getContentPane().add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.addActionListener(this);
		btnDesactivar.setBounds(129, 164, 100, 23);
		frame.getContentPane().add(btnDesactivar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==btnAceptar) {
			lblFrase.setText("Usted se llama "+txtNombre.getText()+" y vive en "+txtCiudad.getText());
		}
		if (e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
		if (e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		}
		
	}
}
