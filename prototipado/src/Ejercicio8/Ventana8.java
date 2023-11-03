package Ejercicio8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ventana8 extends JFrame implements ActionListener {

	JFrame frame;
	private JTextField txtTrimestre1;
	private JTextField txtTrimestre2;
	private JTextField txtTrimestre3;
	JLabel lblNotaFinal,lblResultado;
	JButton btnCalcular;


	/**
	 * Create the application.
	 */
	public Ventana8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtTrimestre1 = new JTextField();
		txtTrimestre1.setBounds(96, 67, 119, 20);
		frame.getContentPane().add(txtTrimestre1);
		txtTrimestre1.setColumns(10);
		
		JLabel lblTrimestre1 = new JLabel("Trimestre 1:");
		lblTrimestre1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTrimestre1.setBounds(20, 70, 81, 14);
		frame.getContentPane().add(lblTrimestre1);
		
		JLabel lblTrimestre2 = new JLabel("Trimestre 2:");
		lblTrimestre2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTrimestre2.setBounds(225, 69, 81, 14);
		frame.getContentPane().add(lblTrimestre2);
		
		txtTrimestre2 = new JTextField();
		txtTrimestre2.setColumns(10);
		txtTrimestre2.setBounds(305, 67, 119, 20);
		frame.getContentPane().add(txtTrimestre2);
		
		JLabel lblTrimestre3 = new JLabel("Trimestre 3:");
		lblTrimestre3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTrimestre3.setBounds(106, 108, 81, 14);
		frame.getContentPane().add(lblTrimestre3);
		
		txtTrimestre3 = new JTextField();
		txtTrimestre3.setColumns(10);
		txtTrimestre3.setBounds(180, 106, 119, 20);
		frame.getContentPane().add(txtTrimestre3);
		
		lblNotaFinal = new JLabel("Nota final:");
		lblNotaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNotaFinal.setBounds(20, 151, 124, 14);
		frame.getContentPane().add(lblNotaFinal);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblResultado.setBounds(20, 176, 182, 14);
		frame.getContentPane().add(lblResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(138, 201, 182, 32);
		btnCalcular.addActionListener(this);
		frame.getContentPane().add(btnCalcular);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnCalcular) {
			calcularProm();
		}
		
	}
	
	public void calcularProm() {
		
		double prom = 0;
		boolean error = false;
		double date1 = Double.parseDouble(txtTrimestre1.getText());
		double date2 = Double.parseDouble(txtTrimestre2.getText());
		Double date3 = Double.parseDouble(txtTrimestre3.getText());
		
		if (date1 < 0 || date2 < 0 || date3 < 0) {
			JOptionPane.showMessageDialog(null, "solo se pueden ingresar numeros mayores a 0 |\n verifique los datos e intente de nuevo","ADVERTENCIA",
			JOptionPane.WARNING_MESSAGE);
			error = true;
		}else {
			prom = (date1+date2+date3)/3;
			
			if(prom < 5) {
				lblNotaFinal.setText("Nota final: "+prom);
				lblResultado.setText("Resultado: SUSPENSO");
				lblNotaFinal.setForeground(Color.red);
				lblResultado.setForeground(Color.red);
			}else {
				lblNotaFinal.setText("Nota final: "+prom);
				lblResultado.setText("Resultado: APROBADO");
				lblNotaFinal.setForeground(Color.black);
				lblResultado.setForeground(Color.black);
			}
		}
		
		if(error == true) {
			lblNotaFinal.setText("Nota final:");
			lblResultado.setText("Resultado:");
			lblNotaFinal.setForeground(Color.black);
			lblResultado.setForeground(Color.black);
		}
		
		
	}
}
