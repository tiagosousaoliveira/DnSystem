package br.com.DnSystem.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Model.MLogon;
import br.com.DnSystem.View.VHome;

public class DDados {
	
	public int retorno; 
	public DDados(MLogon logon) {
		// TODO Auto-generated constructor stub
		
		try {
			Conexao conex = new Conexao();
			conex.ConexaoMyql();
			
			JOptionPane.showMessageDialog(null, "Antes");
			String sql1= "use DN";
			String sql2= "CREATE TEMPORARY TABLE temp(codigo integer, nome varchar(11))";
			
			java.sql.PreparedStatement stm1 = conex.con.prepareStatement(sql1);
			java.sql.PreparedStatement stm2 = conex.con.prepareStatement(sql2);
			
			JOptionPane.showMessageDialog(null, "No ponto");
			
	//		stm.setString(1, logon.getNome());  
	//		stm.setString(2, logon.getSenha()); 
			
			stm1.execute();
			stm2.execute();
	//	    stm.close();
	//	    conex.con.close();
		       
		       
			JOptionPane.showMessageDialog(null, "Show");
			
			
			String sql3= "insert into temp(codigo, nome)values(??)";
			
			java.sql.PreparedStatement stm3 = conex.con.prepareStatement(sql3);  
			
			stm3.setString(1, logon.getNome());  
			stm3.setString(2, logon.getSenha()); 
			ResultSet res = stm3.executeQuery();
			
			if(res.next()){
				JOptionPane.showMessageDialog(null, "Bem Vindo  "+""+ res.getString("nome_usuario"));
				VHome vhome = new VHome();
				int i=0;
				
			}else{
				JOptionPane.showMessageDialog(null, "Usuario ou Senha Inválido");
				int i=1;
				
			}
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null,ex);
		}
	}
		public int retorn(int i) {
			// TODO Auto-generated constructor stub
			if(i == 0){
				retorno=1;
			}else if(i==1){
				retorno =0;
			}else{
				JOptionPane.showMessageDialog(null, "Função retorn(); / Sem retorno");
			}
			return retorno;
		}
	

}
