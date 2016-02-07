package br.com.DnSystem.Control;

import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

import br.com.DnSystem.Dao.DLogon;
import br.com.DnSystem.Model.MLogon;

public class CLogon{
	private Socket cliente;
	public int retorno = -1; 
		public CLogon(MLogon logon){
		// TODO Auto-generated constructor stub
		if(logon.getNome().equals("") && logon.getSenha().equals("")){
			JOptionPane.showMessageDialog(null, "Digite seu Usuario e Senha");
		}else if (logon.getNome().equals("") ){
			JOptionPane.showMessageDialog(null, "Digite seu Usuario");
		}else if (logon.getSenha().equals("")){
			JOptionPane.showMessageDialog(null, "Digite sua Senha");
		}else {
			
			DLogon dlogon = new DLogon(logon);
		//	cliente = new Socket("localhost" +3322,retorno);
			
			if(DLogon.retorno == 0){
				int i=0;
				retorn(i);
			}else if(DLogon.retorno == 1){
				int i=1;
				retorn(i);
			}
	}
}
	public int retorn(int i) {
			// TODO Auto-generated constructor stub
		if(i == 0){
			retorno=0;
		}else if(i==1){
			retorno =1;
		}else{
			JOptionPane.showMessageDialog(null, "Função retorn(); / Sem retorno");
		}
		return retorno;
	}
	
}
