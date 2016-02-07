package br.com.DnSystem.Model;

public class MEscolhaBanco {
	
	private String hostname; 
	private String Banco ;
	private String usuario; 
	private String senha;
	private int    Id;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getBanco() {
		return Banco;
	}
	public void setBanco(String banco) {
		Banco = banco;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public MEscolhaBanco() {
		// TODO Auto-generated constructor stub
	}

}
