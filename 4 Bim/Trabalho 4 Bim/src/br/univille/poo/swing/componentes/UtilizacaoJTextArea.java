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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UtilizacaoJTextArea {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(280,40);
	
		
		JPanel painel = new JPanel();
		
		JTextArea textArea = new JTextArea(10,14);
		textArea.setPreferredSize(tamanhoPreferido);
		

		painel.add(textArea);
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
