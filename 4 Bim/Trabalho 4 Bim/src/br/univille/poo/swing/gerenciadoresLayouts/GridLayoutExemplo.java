package br.univille.poo.swing.gerenciadoresLayouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutExemplo extends JFrame{
	
	
    /**
     * FlowLayout adiciona componentes a esquerda
     */
    public GridLayoutExemplo()
    {
        super("GridLayout");
        
        // Adiciona o gerenciador GridLayout ( linhas, colunas ) 
        setLayout( new GridLayout(3,2, 10, 10));
        
        //Cria os paineis
        JPanel primeiro = criarPanel(Color.RED,"Primeiro");
        JPanel segundo = criarPanel(Color.YELLOW,"Segundo");
        JPanel terceiro = criarPanel(Color.BLUE,"Terceiro");
        JPanel quarto = criarPanel(Color.WHITE,"Quarto");
        JPanel quinto = criarPanel(Color.GREEN,"Quinto");
        JPanel sexto = criarPanel(Color.MAGENTA,"Sexto");
        
        
        // Adiciona o componente na linha e coluna
        add(primeiro);
        add(segundo);
        add(terceiro);
        add(quarto);
        add(quinto);
        add(sexto); 
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
    	GridLayoutExemplo border = new GridLayoutExemplo();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setSize(400,400);
        border.setVisible(true);
	}

}
