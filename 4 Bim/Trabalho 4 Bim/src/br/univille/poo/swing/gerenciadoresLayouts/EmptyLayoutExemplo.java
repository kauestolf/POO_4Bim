package br.univille.poo.swing.gerenciadoresLayouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmptyLayoutExemplo extends JFrame{
	
	
    /**
     * FlowLayout adiciona componentes a esquerda
     */
    public EmptyLayoutExemplo()
    {
        super("Definicao de Layout Manual");
        
        
        setLayout( null);
        
        //Cria os paineis
        JPanel painel = criarPanel(Color.RED,"Tamanho fixo");
        painel.setBounds(10, 10, 100, 100);
        
        
        add(painel);
    }
    
    
    // Cria um painel com a cor de fundo e um label
    private JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	// Configura um tamanho padrao do painel
    	panel.setPreferredSize(new Dimension(100, 50));
    	return panel;
    }
    
    public static void main(String[] args) {
    	EmptyLayoutExemplo border = new EmptyLayoutExemplo();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setSize(400,200);
        border.setVisible(true);
	}

}
