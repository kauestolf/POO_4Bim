package br.univille.poo.swing.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UtilizacaoJCheckBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(280,40);
	
		
		JPanel painel = new JPanel();
		
		
		JCheckBox check = new JCheckBox("Me selecione!");
		check.setText("Clique-me!");
		
		JCheckBox check2 = new JCheckBox("Comecei selecionado");
		check2.setSelected(true);
		
		check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Estou selecionado? "+check2.isSelected());
				
			}
		});

		painel.add(check);
		painel.add(check2);
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
