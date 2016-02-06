package br.com.DnSystem.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import br.com.DnSystem.Model.MCompras;
import br.com.DnSystem.Model.MEstoque;
import br.com.DnSystem.Model.MFinanceiro;
import br.com.DnSystem.Model.MGerenciamento;
import br.com.DnSystem.Model.MVendas;

public class VGerencia extends JFrame{
	
	JTabbedPane jtbAba   	 	 = new JTabbedPane();
	
	public VGerencia() {
		// TODO Auto-generated constructor stub
		super ("Tela de Gerenciamento Cadastral");
		
		MVendas mvendas   			  = new MVendas();
	        jtbAba.addTab("Modulo de Vendas",  mvendas.painel);
	        
	    MCompras mcompras 			  = new MCompras();
	        jtbAba.addTab("Modulo de Compras", mcompras.painel);
	    
	    MFinanceiro mfinanceiro 	  = new MFinanceiro();
	        jtbAba.addTab("Modulo de Vendas", mfinanceiro.painel);
	        
	    MGerenciamento mgerenciamento = new MGerenciamento();    
	        jtbAba.addTab("Modulo de Vendas", mgerenciamento.painel);
	        
	    MEstoque mestoque		  	  = new MEstoque();    
	        jtbAba.addTab("Modulo de Estoque", mestoque.painel);

	        
	        add(jtbAba);
		
		setVisible(true);
		setSize(900,700);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
	}

}
