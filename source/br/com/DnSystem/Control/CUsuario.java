package br.com.DnSystem.Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.DuplicateFormatFlagsException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Dao.DUsuario;
import br.com.DnSystem.Model.MUsuario;

public class CUsuario {
	public int retorno = -1; 
	
	public CUsuario(MUsuario musuario) {

		if (musuario.getTnome().equals("")){
			JOptionPane.showMessageDialog(null, "Insira o nome de Usuario");
		}else if (musuario.getTrazaoSocial().equals("")){
			JOptionPane.showMessageDialog(null, "Insira a Razão do Usuario");
		}else if (musuario.getTCpf().equals("")){
			JOptionPane.showMessageDialog(null, "Insira o CPF do Usuario");
		}else if (musuario.getTRg().equals("")){
			JOptionPane.showMessageDialog(null, "Insira o RG do Usuario");
		}else if (musuario.getRCep().equals("")){
			JOptionPane.showMessageDialog(null, "Insira o cep do Usuario");
		}else if (musuario.getTdata().equals("")){
			JOptionPane.showMessageDialog(null, "Insira a data de cadastro do Usuario");
		}else if (musuario.getTemail().equals("")){
			JOptionPane.showMessageDialog(null, "Insira o Email do Usuario");
		}else if (musuario.getTUsuario().equals("")){
			JOptionPane.showMessageDialog(null, "Insira o Usuario");
		}else if (musuario.getTSenha().equals("")){
			JOptionPane.showMessageDialog(null, "Insira a Senha do Usuario");
		}else {
			JOptionPane.showMessageDialog(null, "Campos Validados");
			DUsuario dusuario = new DUsuario();
			dusuario.GravaDUsuario(musuario);
		}
		// TODO Auto-generated constructor stub
	}
}
