package Ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Ventana6 extends JFrame implements ActionListener,MouseListener{

	JFrame frame;
	JLabel lblNombre;
	JButton btnEsquina,btnAgrandar,btnCentro,btnAchicar;

	/**
	 * Create the application.
	 */
	public Ventana6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 271, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Juan Jos\u00E9");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBackground(new Color(0, 0, 0));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNombre.setBounds(79, 87, 99, 23);
		lblNombre.setOpaque(true);
		frame.getContentPane().add(lblNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(24, 174, 89, 23);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		frame.getContentPane().add(btnEsquina);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		btnAgrandar.setBounds(24, 208, 89, 23);
		frame.getContentPane().add(btnAgrandar);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(140, 174, 89, 23);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		frame.getContentPane().add(btnCentro);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(140, 208, 89, 23);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		frame.getContentPane().add(btnAchicar);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnEsquina) {
			lblNombre.setLocation(5, 5);
		}
		if (e.getSource()==btnCentro) {
			lblNombre.setLocation(85, 82);
		}
		if (e.getSource()==btnAgrandar) {
			lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblNombre.setBounds(79, 87, 120, 40);
		}
		if (e.getSource()==btnAchicar) {
			lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNombre.setBounds(79, 87, 99, 23);
		}
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(100, 30);
		}
		if (e.getSource()==btnCentro) {
			btnCentro.setSize(100, 30);
		}
		if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(100, 30);
		}
		if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(100, 30);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(89, 23);
		}
		if (e.getSource()==btnCentro) {
			btnCentro.setSize(89, 23);
		}
		if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(89, 23);
		}
		if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(89, 23);
		}
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
}

	@Override
	public void mousePressed(MouseEvent e) {
}

	@Override
	public void mouseReleased(MouseEvent e) {
}




}
