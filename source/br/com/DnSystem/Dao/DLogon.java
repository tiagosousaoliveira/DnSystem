package br.com.DnSystem.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Model.MLogon;
import br.com.DnSystem.View.VHome;
import br.com.DnSystem.View.VUsuario;

public class DLogon {
	public static int retorno; 
	public DLogon(MLogon logon) {
		// TODO Auto-generated constructor stub
		try {
			
			Conexao conex = new Conexao();
			conex.ConexaoMyql();

			String sql= "select *from logon where usuario =? and senha =? ";
			java.sql.PreparedStatement stm = conex.con.prepareStatement(sql);    
			stm.setString(1, logon.getNome());  
			stm.setString(2, logon.getSenha()); 
			ResultSet res = stm.executeQuery();   

			if(res.next()){
				JOptionPane.showMessageDialog(null, "Bem Vindo  "+""+ res.getString("usuario"));
				VHome vhome = new VHome();
				int i=0;
				retorn(i);
			}else{
				int resposta = (JOptionPane.showConfirmDialog(null, "Usuario Não Possui cadastro. Deseja Cadastrar ?"));
				if (resposta == 0){
					VUsuario vusuario = new VUsuario();
					int i=1;
					retorn(i); 
				}else if(resposta == 1){
					int i=1;
					retorn(i);
					
				}else {
					int i=1;
					retorn(i);
				}
				
			}
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null,ex);
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
//	public void FExisteBanco(){
//		
//	}
}
