package br.univille.poo.swing.componentes;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class UtilizacaoJRadioButton extends JFrame{
	
	
	public UtilizacaoJRadioButton() {
		super("Radio Button");
		
		setLayout(new BorderLayout());
		
		JPanel painelComRadioButton = new JPanel();
		// Adiciona margens no painel
		painelComRadioButton.setBorder(BorderFactory
				.createEmptyBorder(10,10,10,10));
		painelComRadioButton.setLayout(new GridLayout(3,1));
		

		JTextArea textArea = new JTextArea();

		JRadioButton r1 = new JRadioButton("Opcao 1");
		JRadioButton r2 = new JRadioButton("Opcao 2");
		JRadioButton r3 = new JRadioButton("Opcao 3");
		
		// Cria o action listener
		ActionListener l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JRadioButton radio = (JRadioButton) e.getSource();
				textArea.setText(textArea.getText() +"\n"
						+radio.getText()+ " : "+radio.isSelected());
				
			}
		};

		// Adiciona o action listener nos radiobuttons
		r1.addActionListener(l);
		r2.addActionListener(l);
		r3.addActionListener(l);

		// Adiciona atalhos nos componentes
		r1.setMnemonic(KeyEvent.VK_O);
		r2.setMnemonic(KeyEvent.VK_P);
		r3.setMnemonic(KeyEvent.VK_C);
		
		// Cria um grupo de radiobutton.
		// Permite apenas um radio esteja selecionado.
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		// Configura o radiobutton como selecionado
		r1.setSelected(true);

		painelComRadioButton.add(r1);
		painelComRadioButton.add(r2);
		painelComRadioButton.add(r3);
		
		
		
		add(painelComRadioButton, BorderLayout.WEST);
		add(textArea,BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		UtilizacaoJRadioButton janela = new UtilizacaoJRadioButton();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,200);
		janela.setVisible(true);
	}

}
