package Ejercicio10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Ventana10 extends JFrame implements MouseListener {

	JFrame frame;
	private JTextField txtNumero;
	JButton btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnCero,btnBorrar;


	/**
	 * Create the application.
	 */
	public Ventana10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 219, 289);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setBounds(10, 23, 183, 31);
		frame.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		btnUno = new JButton("1");
		btnUno.setBounds(10, 79, 54, 23);
		btnUno.addMouseListener(this);
		frame.getContentPane().add(btnUno);
		
		btnDos = new JButton("2");
		btnDos.addMouseListener(this);
		btnDos.setBounds(75, 79, 54, 23);
		frame.getContentPane().add(btnDos);
		
		btnTres = new JButton("3");
		btnTres.addMouseListener(this);
		btnTres.setBounds(139, 79, 54, 23);
		frame.getContentPane().add(btnTres);
		
		btnCuatro = new JButton("4");
		btnCuatro.setBounds(10, 113, 54, 23);
		btnCuatro.addMouseListener(this);
		frame.getContentPane().add(btnCuatro);
		
		btnCinco = new JButton("5");
		btnCinco.addMouseListener(this);
		btnCinco.setBounds(75, 113, 54, 23);
		frame.getContentPane().add(btnCinco);
		
		btnSeis = new JButton("6");
		btnSeis.setBounds(139, 113, 54, 23);
		btnSeis.addMouseListener(this);
		frame.getContentPane().add(btnSeis);
		
		btnSiete = new JButton("7");
		btnSiete.setBounds(10, 147, 54, 23);
		btnSiete.addMouseListener(this);
		frame.getContentPane().add(btnSiete);
		
		btnOcho = new JButton("8");
		btnOcho.setBounds(75, 147, 54, 23);
		btnOcho.addMouseListener(this);
		frame.getContentPane().add(btnOcho);
		
		btnNueve = new JButton("9");
		btnNueve.setBounds(139, 147, 54, 23);
		btnNueve.addMouseListener(this);
		frame.getContentPane().add(btnNueve);
		
		btnCero = new JButton("0");
		btnCero.addMouseListener(this);
		btnCero.setBounds(75, 181, 54, 23);
		frame.getContentPane().add(btnCero);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(57, 216, 89, 23);
		btnBorrar.addMouseListener(this);
		frame.getContentPane().add(btnBorrar);
	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
		if (e.getSource()==btnUno) {
			txtNumero.setText(txtNumero.getText()+btnUno.getText());
		}
		if (e.getSource()==btnDos) {
			txtNumero.setText(txtNumero.getText()+btnDos.getText());
		}
		if (e.getSource()==btnTres) {
			txtNumero.setText(txtNumero.getText()+btnTres.getText());
		}
		if (e.getSource()==btnCuatro) {
			txtNumero.setText(txtNumero.getText()+btnCuatro.getText());
		}
		if (e.getSource()==btnCinco) {
			txtNumero.setText(txtNumero.getText()+btnCinco.getText());
		}
		if (e.getSource()==btnSeis) {
			txtNumero.setText(txtNumero.getText()+btnSeis.getText());
		}if (e.getSource()==btnSiete) {
			txtNumero.setText(txtNumero.getText()+btnSiete.getText());
		}
		if (e.getSource()==btnOcho) {
			txtNumero.setText(txtNumero.getText()+btnOcho.getText());
		}if (e.getSource()==btnNueve) {
			txtNumero.setText(txtNumero.getText()+btnNueve.getText());
		}if (e.getSource()==btnCero) {
			txtNumero.setText(txtNumero.getText()+btnCero.getText());
		}
		
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==btnBorrar) {
			txtNumero.setText("");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



}
