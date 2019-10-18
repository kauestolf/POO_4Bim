package br.univille.poo.swing.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UtilizacaoJButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(740,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(480,40);
	
		
		JPanel painel = new JPanel();
		
		
		JButton button = new JButton();
		button.setText("Clique-me!");
		button.setPreferredSize(tamanhoPreferido);

		ImageIcon icon = new ImageIcon("assets/imgs/alert.png");
		Image image = icon.getImage().getScaledInstance(50, 20,Image.SCALE_DEFAULT);
		
		JButton button2 = new JButton(new ImageIcon(image));
		button2.setPreferredSize(tamanhoPreferido);
		
		
		JButton button3 = new JButton("Warning",new ImageIcon(image));
		button3.setPreferredSize(tamanhoPreferido);
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clique no JButton!");
			}
		});
		
		

		painel.add(button);
		painel.add(button2);
		painel.add(button3);
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
