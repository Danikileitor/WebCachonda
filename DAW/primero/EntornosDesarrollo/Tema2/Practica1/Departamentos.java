import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Departamentos {

	private JFrame frmPruebaDeVentanas;
	private JTextField textCodigoDepartamento;
	private JTextField textNombreDepartamento;
	private JTextField textLocalidadDepartamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Departamentos window = new Departamentos();
					window.frmPruebaDeVentanas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Departamentos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPruebaDeVentanas = new JFrame();
		frmPruebaDeVentanas.setTitle("PRUEBA DE VENTANAS");
		frmPruebaDeVentanas.setBounds(100, 100, 640, 360);
		frmPruebaDeVentanas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPruebaDeVentanas.getContentPane().setLayout(new MigLayout("", "[grow,center]", "[center][185px,center][60px]"));
		
		JLabel lblDatosDeDepartamentos = new JLabel("DATOS DE DEPARTAMENTOS");
		frmPruebaDeVentanas.getContentPane().add(lblDatosDeDepartamentos, "cell 0 0");
		
		JPanel panelAmarillo = new JPanel();
		panelAmarillo.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAmarillo.setPreferredSize(new Dimension(400, 175));
		panelAmarillo.setBackground(Color.YELLOW);
		frmPruebaDeVentanas.getContentPane().add(panelAmarillo, "cell 0 1,alignx center,aligny center");
		panelAmarillo.setLayout(new MigLayout("", "[][][grow]", "[20px][][20px][][20px][]"));
		
		JLabel lblCodigoDepartamento = new JLabel("Código Departamento");
		panelAmarillo.add(lblCodigoDepartamento, "cell 0 1");
		
		textCodigoDepartamento = new JTextField();
		panelAmarillo.add(textCodigoDepartamento, "cell 2 1,alignx left");
		textCodigoDepartamento.setColumns(8);
		
		JLabel lblNombreDepartamento = new JLabel("Nombre Departamento");
		panelAmarillo.add(lblNombreDepartamento, "cell 0 3");
		
		textNombreDepartamento = new JTextField();
		panelAmarillo.add(textNombreDepartamento, "cell 2 3,growx");
		textNombreDepartamento.setColumns(10);
		
		JLabel lblLocalidadDepartamento = new JLabel("Localidad Departamento");
		panelAmarillo.add(lblLocalidadDepartamento, "cell 0 5");
		
		textLocalidadDepartamento = new JTextField();
		panelAmarillo.add(textLocalidadDepartamento, "cell 2 5,growx");
		textLocalidadDepartamento.setColumns(10);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmPruebaDeVentanas.getContentPane().add(panelBotones, "cell 0 2,grow");
		panelBotones.setLayout(new MigLayout("", "[grow,center][50px,center][grow,center]", "[grow,center]"));
		
		JButton btnInsertarDatos = new JButton("Insertar Datos");
		panelBotones.add(btnInsertarDatos, "cell 0 0,alignx right");
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		panelBotones.add(btnLimpiarDatos, "cell 2 0,alignx left");
	}

}
