package br.univille.poo.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Instancia a nova Janela
            	HelloSwing hello=  new HelloSwing();
            	// Finaliza o programa quando fechar a janela
            	hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	// Exibe a janela
            	hello.show();
            }
        });
	}

}
