package br.univille.poo.swing.jpanel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PainelComBordas {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Nova Janela");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JPanel painel = new JPanel();
		// Borda sem linha, funciona como margens
		painel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		JPanel bordaSimples = new JPanel();
		bordaSimples.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		bordaSimples.setPreferredSize(new Dimension(280,40));
		
		JPanel bordaComTitulo = new JPanel();
		bordaComTitulo.setBorder(BorderFactory.createTitledBorder("Título"));
		bordaComTitulo.setPreferredSize(new Dimension(280,40));
		
		JPanel bordaBaixoRelevo = new JPanel();
		bordaBaixoRelevo.setBorder(BorderFactory.createLoweredBevelBorder());
		bordaBaixoRelevo.setPreferredSize(new Dimension(280,40));
		
		JPanel bordaAltoRelevo = new JPanel();
		bordaAltoRelevo.setBorder(BorderFactory.createRaisedBevelBorder());
		bordaAltoRelevo.setPreferredSize(new Dimension(280,40));

		painel.add(bordaSimples);
		painel.add(bordaComTitulo);
		painel.add(bordaBaixoRelevo);
		painel.add(bordaAltoRelevo);
		
		frame.add(painel);
		
		
		frame.show();

	}
	

}
