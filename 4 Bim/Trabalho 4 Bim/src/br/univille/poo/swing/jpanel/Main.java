package br.univille.poo.swing.jpanel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JPanel painel = new JPanel();
		painel.setBackground(Color.RED);
		// Adiciona o painel na janela
		frame.add(painel);
		
		
		frame.show();

	}
	

}
