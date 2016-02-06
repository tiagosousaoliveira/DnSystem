package br.com.DnSystem.Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MGerenciamento {

	JLabel        lcliente	 	 	 = new JLabel ("Cadastro Cliente");
	JLabel  	  lfornecedo	 	 = new JLabel ("Cadastro Fornecedor");
	JButton	 	  fornecedor	 	 = new JButton();
	JButton 	  cliente 	 		 = new JButton();
	
	public JPanel painel 	  	 	 = new JPanel();
	
	public MGerenciamento() {
		// TODO Auto-generated constructor stub
		
		painel.setLayout(null);

		ImageIcon fun = new ImageIcon(getClass().getResource("../img/funci.png"));
		fun.setImage(fun.getImage().getScaledInstance(100, 80,80));
		cliente = new JButton(fun);
		cliente.setToolTipText("Cadastro de Clientes");
		cliente.setBorder(null);
		cliente.setBounds(30, 50, 100, 100);
		lcliente.setBounds(30, 120, 100, 100);
		cliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Teste Cliente");
			}
		});
        
		ImageIcon forn = new ImageIcon(getClass().getResource("../img/funci.png"));
		forn.setImage(forn.getImage().getScaledInstance(100, 80,80));
		fornecedor = new JButton(forn);
		fornecedor.setToolTipText("Cadastro de Fornecedor");
		fornecedor.setBorder(null);
		fornecedor.setBounds(180,50, 100, 100);
		lfornecedo.setBounds(180,120, 100, 100);
		fornecedor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Teste Fornecedor");
			}
		});
	
			painel.add(cliente);
			painel.add(lcliente);
			painel.add(fornecedor);
			painel.add(lfornecedo);


	}

}
