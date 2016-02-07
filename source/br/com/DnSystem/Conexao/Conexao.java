package br.com.DnSystem.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.Scanner; 
import java.util.logging.Level; 
import java.util.logging.Logger; 


import javax.swing.JOptionPane;

import br.com.DnSystem.Model.MEscolhaBanco;

public class Conexao{
	
	public Connection con;
	public ResultSet  res;
	public Statement  stm;

	public void Conexaoreserva(int parametro) {
		
		if (parametro == 0){
		
		String driverName = "com.mysql.jdbc.Driver";   
		String usuar="root";
		String passw ="123456";
		String drive="jdbc:mysql://localhost:3306/DN";
		
		}else {
			
		String usuario="sa";
		String senha ="vls021130";
		String Driver="jdbc:sqlserver://localhost:1433;"+"databaseName=DN";
			
		}
	}

	public void Conexao() {
		try {
			
			String usuario="sa";
			String senha ="vls021130";
			String Driver="jdbc:sqlserver://localhost:1433;"+"databaseName=DN";
					 
			con = DriverManager.getConnection(Driver,usuario,senha);
			JOptionPane.showMessageDialog(null, "Conexão efetada com sucesso");
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
		
	}
	
	public void ConexaoMyql() {
		try {
		//	String t = (InetAddress.getByName("TIAGO-PC").getHostAddress());
		//	JOptionPane.showMessageDialog(null,t);
			
			String driverName = "com.mysql.jdbc.Driver";   
			String usuar="root";
			String passw ="123456";
			String drive="jdbc:mysql://localhost:3306/DN";
			
	//		Class.forName(driverName);  	 
			con = DriverManager.getConnection(drive,usuar,passw);
			
			JOptionPane.showMessageDialog(null, "Conexão efetada com sucesso"); 
		}
		catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Deu merda 1 ");
			JOptionPane.showMessageDialog(null,e.getMessage());
			
	/*	} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Deu merda 2 ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e){
			JOptionPane.showMessageDialog(null,e.getMessage());
		}*/
				
		}
	}

}
