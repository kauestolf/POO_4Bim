package br.univille.poo.swing.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UtilizacaoJList {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Dimension tamanhoPreferido = new Dimension(280,100);
	
		
		JPanel painel = new JPanel();
		
		JLabel label = new JLabel("Nenhum Item selecionado");
		
		String itens [] = {"Argentina","Brasil","Colombia","Peru","Venezuela"};
		
		JList<String> list = new JList<String>(itens);
		list.setPreferredSize(tamanhoPreferido);
		list.setSelectedIndices(new int[]{1,3});
		
		
		JButton button = new JButton("quais itens estao selecionados?");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = "Selecionou: ";
				for(Object t : list.getSelectedValues()) {
					s = s +" "+t;
				}
				label.setText(s);
			}
		});

		painel.add(list);
		painel.add(button);
		painel.add(label);
		
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
