package br.com.DnSystem.View;

import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.DnSystem.Dao.DEsconlhaBanco;
import br.com.DnSystem.Model.MEscolhaBanco;

public class VEscolhaBanco extends JFrame{
	
	public  JCheckBox  CSQL 	 = new JCheckBox();
	private JCheckBox  CMySql 	 = new JCheckBox();
	private JLabel 	   Lsql		 = new JLabel("SQL");
	private JLabel 	   Lmysql	 = new JLabel("MYSQL");
	
	private int  	   Id;
	private JTextField codigo	= new JTextField();;
	private JTextField hostname = new JTextField("Hostname");	
	private JTextField Banco  	= new JTextField("DN");
	private JTextField usuario 	= new JTextField("Usuario");
	private JPasswordField senha= new JPasswordField("123456");

	JButton Bgravar = new JButton("OK");
	
	public VEscolhaBanco(){
		super ("Escolha o Banco");
		getContentPane().setLayout(null);
		hostname.setBounds(15, 5, 90, 20);
		usuario.setBounds(15, 40, 90, 20);
		Banco.setBounds(15, 95, 90, 20);
		senha.setBounds(15, 130, 90, 20);
		Bgravar.setBounds(220,130,60,25);
		CSQL.setBounds(180, 5, 10, 10);
		CMySql.setBounds(180, 40, 10, 10);
		Lsql.setBounds(193, 5, 50, 10);
		Lmysql.setBounds(193, 40, 50, 10);
		
		
		
		Bgravar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(CSQL.isSelected()== true && CMySql.isSelected() == true){
					JOptionPane.showMessageDialog(null,"Escolha somente uma fonte de Dados");

				}else if( CSQL.isSelected()== false && CMySql.isSelected() == false){
					JOptionPane.showMessageDialog(null,"Escolha no minimo uma fonte de Dados");
					
				}else if (CSQL.isSelected()== true && CMySql.isSelected() == false){

					MEscolhaBanco mescolhebanco = new MEscolhaBanco();
					mescolhebanco.setHostname(hostname.getText());
					mescolhebanco.setBanco(Banco.getText());
					mescolhebanco.setSenha(senha.getText());
					mescolhebanco.setUsuario(usuario.getText());
					mescolhebanco.setId(Id);
					
					
					DEsconlhaBanco descolhabanco = new DEsconlhaBanco();
					descolhabanco.DEsconlhaBancoSQL(mescolhebanco);
					
				}else {
					
					MEscolhaBanco mescolhebanco = new MEscolhaBanco();
					mescolhebanco.setHostname(hostname.getText());
					mescolhebanco.setBanco(Banco.getText());
					mescolhebanco.setSenha(senha.getText());
					mescolhebanco.setUsuario(usuario.getText());
					mescolhebanco.setId(Id);
					
					DEsconlhaBanco descolhabanco = new DEsconlhaBanco();
					descolhabanco.DEsconlhaBancoMYSQL(mescolhebanco);
					
				}
			}
		});
		
		add(hostname);
		add(usuario);
		add(Banco);
		add(senha);
		add(Bgravar);
		add(CSQL);
		add(CMySql);
		add(Lsql);
		add(Lmysql);
		
		
		setVisible(true);
		setResizable(false);
		setSize(300,200);
		setLocationRelativeTo(null);  
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
	}

}
