import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField textOperando1;
	private JTextField textOperando2;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 450, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel lblOperando1 = new JLabel("Operando 1:");
		lblOperando1.setBounds(84, 56, 100, 15);
		frmCalculadora.getContentPane().add(lblOperando1);
		
		JLabel lblOperando2 = new JLabel("Operando 2:");
		lblOperando2.setBounds(84, 96, 100, 15);
		frmCalculadora.getContentPane().add(lblOperando2);
		
		textOperando1 = new JTextField();
		textOperando1.setHorizontalAlignment(SwingConstants.RIGHT);
		textOperando1.setBounds(202, 54, 100, 20);
		frmCalculadora.getContentPane().add(textOperando1);
		textOperando1.setColumns(10);
		
		textOperando2 = new JTextField();
		textOperando2.setHorizontalAlignment(SwingConstants.RIGHT);
		textOperando2.setBounds(202, 94, 100, 20);
		frmCalculadora.getContentPane().add(textOperando2);
		textOperando2.setColumns(10);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSuma.setBounds(84, 136, 50, 25);
		frmCalculadora.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(144, 136, 50, 25);
		frmCalculadora.getContentPane().add(btnResta);
		
		JButton btnProducto = new JButton("*");
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProducto.setBounds(204, 136, 50, 25);
		frmCalculadora.getContentPane().add(btnProducto);
		
		JButton btnDivision = new JButton(":");
		btnDivision.setBounds(264, 136, 50, 25);
		frmCalculadora.getContentPane().add(btnDivision);
		
		textResultado = new JTextField();
		textResultado.setBorder(null);
		textResultado.setDisabledTextColor(new Color(51, 51, 51));
		textResultado.setEditable(false);
		textResultado.setEnabled(false);
		textResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		textResultado.setBounds(94, 184, 208, 20);
		frmCalculadora.getContentPane().add(textResultado);
		textResultado.setColumns(10);
		
		btnSuma.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 int operando1 = Integer.parseInt(textOperando1.getText());
			 int operando2 = Integer.parseInt(textOperando2.getText());
			 int resultado = operando1 + operando2;
			 textResultado.setText(String.valueOf(resultado));
			 }
		});
		
		btnResta.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 int operando1 = Integer.parseInt(textOperando1.getText());
			 int operando2 = Integer.parseInt(textOperando2.getText());
			 int resultado = operando1 - operando2;
			 textResultado.setText(String.valueOf(resultado));
			 }
		});
		
		btnProducto.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 int operando1 = Integer.parseInt(textOperando1.getText());
			 int operando2 = Integer.parseInt(textOperando2.getText());
			 int resultado = operando1 * operando2;
			 textResultado.setText(String.valueOf(resultado));
			 }
		});
		
		btnDivision.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 int operando1 = Integer.parseInt(textOperando1.getText());
			 int operando2 = Integer.parseInt(textOperando2.getText());
			 int resultado;
			 if(operando2 == 0) {
				 textResultado.setText("No se puede dividir por 0");
			 	} else {
				 resultado = operando1 / operando2;
				 textResultado.setText(String.valueOf(resultado));
			 	}
			 }
		});
	}
}
