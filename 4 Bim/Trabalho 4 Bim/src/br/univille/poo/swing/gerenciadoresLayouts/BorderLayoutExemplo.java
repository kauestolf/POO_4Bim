package br.univille.poo.swing.gerenciadoresLayouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayoutExemplo extends JFrame{
	
	
     
    public BorderLayoutExemplo()
    {
        super("BorderLayout");
        
        // Adiciona o gerenciador BorderLayout
        setLayout( new BorderLayout(10,10));
        
        //Cria os paineis
        JPanel norte = criarPanel(Color.RED,"Norte");
        JPanel leste = criarPanel(Color.YELLOW,"Leste");
        JPanel oeste = criarPanel(Color.BLUE,"Oeste");
        JPanel sul = criarPanel(Color.WHITE,"Sul");
        JPanel centro = criarPanel(Color.GREEN,"Centro");
        
        
        // Adiciona o painel no norte
        add(norte, BorderLayout.NORTH);
        // Adiciona o painel no sul
        add(sul, BorderLayout.SOUTH);
        // Adiciona o painel no leste
        add(leste, BorderLayout.EAST);
        // Adiciona o painel no oeste
        add(oeste, BorderLayout.WEST);
        // Adiciona o painel no centro
        add(centro, BorderLayout.CENTER); 
        
        
    }
    
    
    // Cria um painel com a cor de fundo e um label
    private JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	// Configura um tamanho padrao do painel
    	return panel;
    }
    
    public static void main(String[] args) {
    	BorderLayoutExemplo border = new BorderLayoutExemplo();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setSize(400,200);
        border.setVisible(true);
	}

}
