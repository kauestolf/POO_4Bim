package br.univille.poo.swing.gerenciadoresLayouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutExemplo extends JFrame{
	
	
    /**
     * FlowLayout adiciona componentes a esquerda
     */
    public FlowLayoutExemplo()
    {
        super("FlowLayout");
        
        // Adiciona o gerenciador FlowLayout
        // Orientacoes possiveis
        // Centro   : FlowLayout.CENTER
        // Esquerda : FlowLayout.LEFT
        // Direita  : FlowLayout.RIGHT
        setLayout( new FlowLayout(FlowLayout.RIGHT));
        
        //Cria os paineis
        JPanel norte = criarPanel(Color.RED,"Primeiro");
        JPanel leste = criarPanel(Color.YELLOW,"Segundo");
        JPanel oeste = criarPanel(Color.BLUE,"Terceiro");
        JPanel sul = criarPanel(Color.WHITE,"Quarto");
        JPanel centro = criarPanel(Color.GREEN,"Quinto");
        
        
        add(norte);
        add(sul);
        add(leste);
        add(oeste);
        add(centro); 
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
    	FlowLayoutExemplo border = new FlowLayoutExemplo();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setSize(400,200);
        border.setVisible(true);
	}

}
