package br.com.DnSystem.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;

public class Conexao{
	
	public Connection con;
	public ResultSet  res;
	public Statement  stm;
	
	String usuario="sa";
	String senha ="vls021130";
	String Driver="jdbc:sqlserver://localhost:1433;"+"databaseName=DN";
	
	String driverName = "com.mysql.jdbc.Driver";   
	String usuar="root";
	String passw ="123456";
	String drive="jdbc:mysql://localhost:3306/DN";

	public void Conexao() {
		try {
					 
			con = DriverManager.getConnection(Driver,usuario,senha);
			JOptionPane.showMessageDialog(null, "Conexão efetada com sucesso");
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
		
	}
	
	public void ConexaoMyql() {
		try {
			Class.forName(driverName);  	 
			con = DriverManager.getConnection(drive,usuar,passw);
			JOptionPane.showMessageDialog(null, "Conexão efetada com sucesso");
		}
		catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "Deu merda 1 ");
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Deu merda 2 ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
