package br.com.DnSystem.View;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VFinanceiro extends JFrame{
	
	
	
	JMenuBar menu 		   					= new JMenuBar();
	private JTextField dCodigo 				= new JTextField();
	private JTextField dData 				= new JTextField();
	private JTextField dDescricao 			= new JTextField();
	private JTextField JValor 				= new JTextField();
	private JTextField JCituacao 			= new JTextField();
	private JTextField JParcela 			= new JTextField();
	private JLabel JX 						= new JLabel("X");
	JCheckBox ChequeDuplicata 				= new JCheckBox("Duplicata a Receber");
	JCheckBox ChequePagamento 				= new JCheckBox("Duplicata a Pagar");
	
	
	
	public VFinanceiro() {
		// TODO Auto-generated constructor stub
		super("Tela Financeira");
		getContentPane().setLayout(null);
		
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension w = getSize(); 
        menu.setLocation(0, 2);
        menu.setSize((d.width - w.width),20);
		

        
        
        dCodigo.setBounds(21, 47, 86, 20);
        dCodigo.setColumns(10);
        
        dData.setBounds(903, 47, 86, 20);
        dData.setColumns(10); 
       
        dDescricao.setBounds(21, 199, 968, 20);
        dDescricao.setColumns(10);
        
        ChequeDuplicata.setBounds(21, 103, 132, 23);
        ChequePagamento.setBounds(21, 135, 132, 23);
        
        JLabel JCodigo = new JLabel("Codigo");
        JCodigo.setBounds(21, 33, 46, 14);
        JLabel JData = new JLabel("Data do Registro");
        JData.setBounds(903, 33, 86, 14);
        JLabel JDescricao = new JLabel("Registro do Nome");
        JDescricao.setBounds(21, 177, 132, 14);
        
        JValor.setBounds(650, 248, 86, 20);
        JValor.setColumns(10);
        JCituacao.setBounds(21, 248, 375, 20);
        JCituacao.setColumns(10);
        JParcela.setBounds(483, 248, 86, 20);
        JParcela.setColumns(10);
        JX.setBounds(601, 251, 26, 14);
        
        
        JButton btnGravar = new JButton("Gravar");
        btnGravar.setBounds(827, 535, 89, 23);
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(677, 535, 89, 23);
        
        add(dDescricao);
        add(dData);
        add(dCodigo);
        add(ChequeDuplicata);
        add(ChequePagamento);
        add(JCodigo);
        add(JData);
        add(JDescricao);
        add(JValor);
        add(JCituacao);
        add(JParcela);
        add(JX);
        add(btnGravar);
        add(btnCancelar);
        add(menu);
        
        
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension dw = getSize(); 
        this.setSize(1024,620);
       // this.setLocation(0, 300);
		
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
