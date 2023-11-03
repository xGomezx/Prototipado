package Ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Ventana5 extends JFrame implements MouseListener {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	
	
	JLabel lblEti1,lblEti2,lblEti3,lblOcultar;
	/**
	 * Create the application.
	 */
	public Ventana5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 220, 194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblEti1 = new JLabel("Etiqueta 1");
		lblEti1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEti1.setBounds(71, 11, 66, 14);
		frame.getContentPane().add(lblEti1);
		
		lblEti2 = new JLabel("Etiqueta 2");
		lblEti2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEti2.setBounds(128, 36, 66, 14);
		frame.getContentPane().add(lblEti2);
		
		lblEti3 = new JLabel("Etiqueta 3");
		lblEti3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEti3.setBounds(10, 36, 66, 14);
		frame.getContentPane().add(lblEti3);
		
		lblOcultar = new JLabel("Ocultar");
		lblOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		lblOcultar.setForeground(Color.BLACK);
		lblOcultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOcultar.setOpaque(true);
		lblOcultar.setBackground(Color.RED);
		lblOcultar.setBounds(53, 119, 84, 25);
		frame.getContentPane().add(lblOcultar);
		lblOcultar.addMouseListener(this);
	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		
		if (e.getSource()==lblOcultar) {
			
			lblEti1.setVisible(false);
			lblEti2.setVisible(false);
			lblEti3.setVisible(false);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		if (e.getSource()==lblOcultar) {
			lblEti1.setVisible(true);
			lblEti2.setVisible(true);
			lblEti3.setVisible(true);
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
