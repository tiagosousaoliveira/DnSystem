package br.com.DnSystem.Dao;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Model.MEscolhaBanco;


public class DEsconlhaBanco {
	public int parametro;

	public void DEsconlhaBancoSQL(MEscolhaBanco mesconlhabanco){
		parametro = 0;
		Conexao conexao = new Conexao();
		conexao.Conexaoreserva(parametro);
		
		try {

			String sql= "insert into conexao(codigo,nome_conexao,escolha,usuario,senha)"+
						"?,?,?,?";
			java.sql.PreparedStatement stm = conexao.con.prepareStatement(sql); 
			
			stm.setInt	 (1, mesconlhabanco.getId());
			stm.setString(1, mesconlhabanco.getHostname()); 
			stm.setString(3, mesconlhabanco.getBanco());
			stm.setString(4, mesconlhabanco.getUsuario());
			stm.setString(5, mesconlhabanco.getSenha()); 
			
			ResultSet res = stm.executeQuery(); 
		
		
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex);
		}
 }
	
	public void DEsconlhaBancoMYSQL(MEscolhaBanco mescolhebanco){
		
		Conexao conexao = new Conexao();
		conexao.ConexaoMyql();
		
		
		
	}

	
}
