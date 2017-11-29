package com.cenfotec.iu;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import com.cenfotec.calculadoracomida.CalculadoraComida;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
/**
*
* @author Marvin Calvo
* @version 0.1.2017
*/
public class InformacionComida extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CalculadoraComida gestor = CalculadoraComida.getInstance();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacionComida frame = new InformacionComida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public InformacionComida() {
		setTitle("INFORMACION DE COMIDAS");
		setResizable(false);
		Image img;
		ImageIcon icon;
		Image iconImg;
		ImageIcon otroicon;
		JButton boton;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 687);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JTextArea txtrRegvfrv = new JTextArea();
		txtrRegvfrv.setText("Dar clic en alguna imagen");
		txtrRegvfrv.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
		txtrRegvfrv.setTabSize(16);
		txtrRegvfrv.setForeground(Color.RED);
		txtrRegvfrv.setBackground(Color.BLACK);
		txtrRegvfrv.setBounds(10, 406, 541, 203);
		JScrollPane scroll = new JScrollPane (txtrRegvfrv);
		scroll.setBounds(10, 406, 541, 203);
		contentPane.add(scroll);
		
		
		icon = new ImageIcon("Imagenes/Pizza.jpg");
		img = icon.getImage(); 
		iconImg = img.getScaledInstance(223,181,java.awt.Image.SCALE_SMOOTH);
		otroicon = new ImageIcon(iconImg);
		boton = new JButton(otroicon);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrRegvfrv.setText(gestor.obtenerValorComida(1));
			}
		});
		boton.setBounds(27, 22, 223, 181);
		contentPane.add(boton);
		
		icon = new ImageIcon("Imagenes/ollaDeCarne.jpg");
		img = icon.getImage(); 
		iconImg = img.getScaledInstance(223,181,java.awt.Image.SCALE_SMOOTH);
		otroicon = new ImageIcon(iconImg);
		boton= new JButton(icon);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrRegvfrv.setText(gestor.obtenerValorComida(2));
			}
		});
		boton.setBounds(316, 22, 223, 181);
		contentPane.add(boton);
		
		icon = new ImageIcon("Imagenes/Hamburg.jpg");
		img = icon.getImage(); 
		iconImg = img.getScaledInstance(223,181,java.awt.Image.SCALE_SMOOTH);
		boton = new JButton(icon);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrRegvfrv.setText(gestor.obtenerValorComida(3));
			}
		});
		boton.setBounds(27, 214, 223, 181);
		contentPane.add(boton);
		
		icon = new ImageIcon("Imagenes/Chocolate.jpg");
		img = icon.getImage(); 
		iconImg = img.getScaledInstance(223,181,java.awt.Image.SCALE_SMOOTH);
		boton = new JButton(icon);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrRegvfrv.setText(gestor.obtenerValorComida(4));
			}
		});
		boton.setBounds(316, 214, 223, 181);
		contentPane.add(boton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(27, 620, 89, 27);
		contentPane.add(btnSalir);
	}
}
