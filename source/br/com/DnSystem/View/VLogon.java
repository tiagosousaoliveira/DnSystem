package br.com.DnSystem.View;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import br.com.DnSystem.Control.CLogon;
import br.com.DnSystem.Model.MLogon;

public class VLogon extends JFrame{
	
	JTextField 	   				jlogon = new JTextField();
	JPasswordField 				jsenha = new JPasswordField();
	JButton						blogon = new JButton("Logar");	
	JLabel						lusuar;
	JLabel						lsenha;
	private int		 			ExisteBanco;
	private String				QualConexao;
	
	
	public VLogon(){
		// TODO Auto-generated constructor stub
		
		super("Tela de Login");
		this.setLayout(null);
		//ExisteBanco = 0;
		
		
		jlogon.setBounds(100, 70, 180, 22);
		jsenha.setBounds(100, 100, 180, 22);
		blogon.setBounds(310, 140, 65, 22);
		blogon.setFont(new Font("Arial", Font.PLAIN, 9));
		
		ImageIcon log = new ImageIcon(getClass().getResource("../img/logon.png"));
		log.setImage(log.getImage().getScaledInstance(20, 20,20));
		lusuar = new JLabel(log);
		lusuar.setBounds(70, 65, 30, 30);
		
		ImageIcon sen = new ImageIcon(getClass().getResource("../img/lock.png"));
		sen.setImage(sen.getImage().getScaledInstance(20, 20,20));
		lsenha = new JLabel(sen);
		lsenha.setBounds(70, 95, 30, 30);
		
		blogon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				MLogon mlogon = new MLogon();
				mlogon.setNome(jlogon.getText());
				mlogon.setSenha(jsenha.getText());
				
				CLogon clogon = new CLogon(mlogon);
				if(clogon.retorno == 0){
					dispose();
				}else if(clogon.retorno == 1){
					jlogon.setText("");
					jsenha.setText("");
				}
			}
		});
		

		add(jlogon);
		add(jsenha);
		add(blogon);
		add(lusuar);
		add(lsenha);
		

		setVisible(true);
		setResizable(false);
		setSize(400,200);
		setLocationRelativeTo(null);  
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	//	VerificaConexaoComBanco(ExisteBanco);
	}
	
	public static void main(String[] args) {
		
		try { 
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { 
				if ("Nimbus".equals(info.getName())) { 
					javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; 
				} 
			} 
		} catch (ClassNotFoundException ex) { 
			java.util.logging.Logger.getLogger(VLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) { 
			java.util.logging.Logger.getLogger(VLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
		} catch (javax.swing.UnsupportedLookAndFeelException ex) { 
			java.util.logging.Logger.getLogger(VLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
		} //</editor-fold> /* Create and display the form */ 
		java.awt.EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				new VLogon().setVisible(true); 
			} 
		});
		/*javax.swing.SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        /* Crib e exibe o GUI 
		    	new VLogon();
		    }
		});*/
	}
	public void VerificaConexaoComBanco(int escolha){	
		if(escolha == 0){
			VEscolhaBanco escolhabanco = new VEscolhaBanco();
		}else{	
		}	
	}
}
