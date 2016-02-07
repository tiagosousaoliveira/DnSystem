package br.com.DnSystem.Model;

import javax.swing.JTextField;

public class MUsuario {

	private int Tcodigo;
	private String Tnome;
	private String TrazaoSocial;
	private String TCpf;
	private String TRg;
	private String TCep;
	private String Tdata;
	private String Temail;
	private String TUsuario;
	private String TSenha;
	
	public String getTUsuario() {
		return TUsuario;
	}
	public void setTUsuario(String tUsuario) {
		TUsuario = tUsuario;
	}
	public String getTSenha() {
		return TSenha;
	}
	public void setTSenha(String tSenha) {
		TSenha = tSenha;
	}
	public String getTnome() {
		return Tnome;
	}
	public void setTnome(String tnome) {
		Tnome = tnome;
	}
	public String getTrazaoSocial() {
		return TrazaoSocial;
	}
	public void setTrazaoSocial(String trazaoSocial) {
		TrazaoSocial = trazaoSocial;
	}
	public String getTCpf() {
		return TCpf;
	}
	public void setTCpf(String tCpf) {
		TCpf = tCpf;
	}
	public String getTRg() {
		return TRg;
	}
	public void setTRg(String tRg) {
		TRg = tRg;
	}
	public String getRCep() {
		return TCep;
	}
	public void setRCep(String rCep) {
		TCep = rCep;
	}
	public int getTcodigo() {
		return Tcodigo;
	}
	public void setTcodigo(int tcodigo) {
		Tcodigo = tcodigo;
	}
	public String getTdata() {
		return Tdata;
	}
	public void setTdata(String tdata) {
		Tdata = tdata;
	}
	public String getTemail() {
		return Temail;
	}
	public void setTemail(String temail) {
		Temail = temail;
	}

}
