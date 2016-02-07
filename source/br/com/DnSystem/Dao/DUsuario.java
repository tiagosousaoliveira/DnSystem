package br.com.DnSystem.Dao;

import java.sql.SQLException;
import javax.swing.JOptionPane;


import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Model.MUsuario;

public class DUsuario {
	public static int retorno = -1; 
	public void GravaDUsuario(MUsuario musuario) {
		// TODO Auto-generated constructor stub
		try {
			Conexao conex = new Conexao();
			conex.ConexaoMyql();

			String sql= "insert into usuario (codigo,data_cadastro,nome,razao_social,cpf,rg,cep,email,usuario,senha)"
					  + "values(?,?,?,?,?,?,?,?,?,?)";
			
				  
			java.sql.PreparedStatement stm = conex.con.prepareStatement(sql);    
			stm.setInt(1, musuario.getTcodigo());  
			stm.setString(2, musuario.getTdata()); 
			stm.setString(3, musuario.getTnome());  
			stm.setString(4, musuario.getTrazaoSocial());
			stm.setString(5, musuario.getTCpf());
			stm.setString(6, musuario.getTRg());  
			stm.setString(7, musuario.getRCep()); 
			stm.setString(8, musuario.getTemail());  
			stm.setString(9, musuario.getTUsuario());
			stm.setString(10,musuario.getTSenha());  
			
		    stm.execute();
		    stm.close();
		    conex.con.close();
		    
		    JOptionPane.showMessageDialog(null, "Usuario Gravado com Sucesso");
		    retorno = retorno + 1;
		    retorn (retorno);
		    JOptionPane.showMessageDialog(null,"Esse é o Retorno chamado"+retorno);
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, "Não foi possivel Gravar");
			JOptionPane.showMessageDialog(null,ex);
			JOptionPane.showMessageDialog(null,"Esse é o Retorno chamado"+retorno);
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
