package br.univille.poo.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HelloSwing extends JFrame{
	

	public HelloSwing() {
		// Titulo da Janela
		setTitle("Hello Swing");
		// Tamanho da Janela
		setSize(300, 300);
		// Nao permite modificar o tamanho da Tela
		setResizable(false);
		// Configura a tela
		setLayout();
	}
	
	// Configura a tela
	private void setLayout() {
		JPanel panel = new JPanel();
		// Retira o gerenciador de layout
		panel.setLayout(null);
		// Adiciona bordas
		panel.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com titulo
			   ,BorderFactory.createTitledBorder("Login")));

		// Campo texto com 10 caracteres
		JTextField text = new JTextField(10);
		text.setBounds(120, 63, 100, 30);
		
		// Campo texto com 10 caracteres
		JPasswordField text2 = new JPasswordField(10);
		text2.setBounds(120, 103, 100, 30);
		
		JLabel label = new JLabel("Usu·rio ");
		// Cor do texto
		label.setForeground(Color.BLACK);
		label.setBounds(60, 60, 180, 30);
		
		JLabel label2 = new JLabel("Senha ");
		// Cor do texto
		label2.setForeground(Color.BLACK);
		label2.setBounds(60, 103, 180, 30);
		
		
		JButton button = new JButton("Acessar");
		button.setBounds(120, 145, 100, 30);
		button.addActionListener(new ActionListener() {
			
		JRadioButton radio = new JRadioButton("Manter acessado");	
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = text.getText();
				label.setText(texto);
				
				//JOptionPane.showMessageDialog(null, 
				//		"Ol√°!");
			}
		});
		
		JCheckBox checkbox = new JCheckBox("Manter Acesso");
		// Cor do texto
		checkbox.setForeground(Color.BLACK);
		checkbox.setBounds(90, 180, 180, 30);

		JLabel label3 = new JLabel("Esqueci minha senha");
		// Cor do texto
		label3.setForeground(Color.MAGENTA);
		label3.setBounds(30,220, 180, 30);
		
		panel.add(text);
		panel.add(text2);
		panel.add(button);
		// Adiciona o label no painel
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(checkbox);
		//panel.add(radio);
		
		//Adiciona o painel no frame
		add(panel);
	}
	

}
