package br.univille.poo.swing.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class UtilizacaoJLabel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(280,40);
	
		
		JPanel painel = new JPanel();
		
		
		JLabel label = new JLabel();
		label.setText("Ola JLabel");
		label.setPreferredSize(tamanhoPreferido);
		
		JLabel label2 = new JLabel("Texto com cor customizada");
		label2.setForeground(Color.RED);
		label2.setPreferredSize(tamanhoPreferido);
		
		JLabel label3 = new JLabel("Fundo com cor customizada");
		label3.setBackground(Color.RED);
		label3.setOpaque(true);
		label3.setPreferredSize(tamanhoPreferido);
		
		JLabel label4 = new JLabel("Fonte customizada");
		label4.setFont(new Font("Serif", Font.ITALIC, 28));
		label4.setPreferredSize(tamanhoPreferido);
		
		JLabel label5 = new JLabel("Centralizado",SwingConstants.CENTER);
		label5.setPreferredSize(tamanhoPreferido);
		
		ImageIcon icon = new ImageIcon("assets/imgs/duke.png");
		Image image = icon.getImage().getScaledInstance(100, 200,Image.SCALE_DEFAULT);
		JLabel label6 = new JLabel(new ImageIcon(image));

		painel.add(label);
		painel.add(label2);
		painel.add(label3);
		painel.add(label4);
		painel.add(label5);
		painel.add(label6);
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
