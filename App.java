package co.com.appAlura;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public abstract class App extends JFrame implements ActionListener{

	//atributos
	private JLabel version, derechosAutor;
	private JTextArea resultado;
			
	//constructor
	public App() {
		// valores interfaz(left , top, width, height)
		
		getContentPane().setLayout(null);
		setTitle("Alura - Oracle");
		getContentPane().setBackground(new Color(218, 247, 166));
	
		 //version software
		version = new JLabel("Version 1.0 Alura - OracleNextEducation");
					//(left , top,width,height)	
		version.setBounds(10, 330, 340, 50);
		version.setFont(new Font("Andale Mono", 1, 9));
		add(version);
		
		//copyRight
		derechosAutor = new JLabel("CopyRight Jeisson Cardozo");
		derechosAutor.setBounds(310, 330, 340, 50);
		derechosAutor.setFont(new Font("Andale Mono", 1, 9));
		getContentPane().add(derechosAutor);
			
		
		
		JButton botonConversor = new JButton("convertir");
		botonConversor.setBounds(186, 130, 100, 30);
		botonConversor.setFont(new Font("Andale Mono", 1, 12));
		getContentPane().add(botonConversor);
		
		JTextField valor1 = new JTextField();
		valor1.setBounds(210, 26, 90, 16);
		getContentPane().add(valor1);
		
		JLabel textIngresar = new JLabel("Ingrese valor moneda:");
		textIngresar.setBounds(34, 26, 190, 16);
		textIngresar.setFont(new Font("Andale Mono", 1, 12));
		getContentPane().add(textIngresar);
		
		JLabel textSeleccion = new JLabel("Moneda pesos Colombianos a Dolar y Euros");
		textSeleccion.setBounds(34, 72, 290, 16);
		textSeleccion.setFont(new Font("Andale Mono", 1, 12));
		getContentPane().add(textSeleccion);
		
	
		JLabel text3 = new JLabel("Moneda Convertida");
		text3.setBounds(34, 210, 290, 16);
		text3.setFont(new Font("Andale Mono", 1, 12));
		getContentPane().add(text3);
		
		resultado = new JTextArea();
		resultado.setBounds(184, 226, 130, 90);
		getContentPane().add(resultado);
		resultado.setColumns(10);
		
		
		botonConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double moneda = Double.parseDouble(valor1.getText());
				resultado.setText(String.valueOf("Dolares " + moneda * 4.173 ));
				resultado.append("\n Euros " + moneda * 4.554 );
			}
		});
	}
}
