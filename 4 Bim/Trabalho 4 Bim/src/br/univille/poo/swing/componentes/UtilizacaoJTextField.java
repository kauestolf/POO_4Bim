package br.univille.poo.swing.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UtilizacaoJTextField {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(280,40);
	
		
		JPanel painel = new JPanel();
		
		JTextField text = new JTextField();
		text.setPreferredSize(tamanhoPreferido);
		
		JTextField text2 = new JTextField("Passe o mouse encima de mim");
		text2.setToolTipText("Olá sou uma dica");
		text2.setPreferredSize(tamanhoPreferido);
		
		
		JTextField text4 = new JTextField("Campo desativado");
		text4.setEnabled(false);
		text4.setPreferredSize(tamanhoPreferido);
		
		JPasswordField text3 = new JPasswordField();
		text3.setPreferredSize(tamanhoPreferido);
		text3.setText("sou uma senha");
		text3.setToolTipText("Senha");
		
		JPasswordField text5 = new JPasswordField();
		text5.setPreferredSize(tamanhoPreferido);
		text5.setText("sou uma senha");
		text5.setToolTipText("Senha");
		text5.setEchoChar('$');
		

		painel.add(text);
		painel.add(text2);
		painel.add(text4);
		painel.add(text3);
		painel.add(text5);
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
