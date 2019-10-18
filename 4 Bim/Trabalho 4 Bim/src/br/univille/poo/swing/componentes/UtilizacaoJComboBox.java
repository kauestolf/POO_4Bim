package br.univille.poo.swing.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UtilizacaoJComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(280,40);
	
		
		JPanel painel = new JPanel();
		
		JLabel label = new JLabel("Nenhum Item selecionado");
		
		String itens [] = {"Argentina","Brasil","Colombia"};
		
		JComboBox<String> comboBox = new JComboBox<String>(itens);
		comboBox.setPreferredSize(tamanhoPreferido);
		comboBox.addItem("Peru");
		comboBox.setSelectedIndex(-1);
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Selecionou : "+comboBox.getSelectedItem());
			}
		});

		painel.add(comboBox);
		painel.add(label);
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
