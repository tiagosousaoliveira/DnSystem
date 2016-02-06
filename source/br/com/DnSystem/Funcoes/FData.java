package br.com.DnSystem.Funcoes;

import java.util.Calendar;

public class FData {
	
	Calendar    data; 
	public  int  dia;
	public  int  mes;
	public  int  ano;
	
	
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	
	public FData() {
		// TODO Auto-generated constructor stub
		data = Calendar.getInstance();		
		dia = data.get(Calendar.DATE);				
		mes = data.get(Calendar.MONTH);
		ano = data.get(Calendar.YEAR);	
		
		
	}

}
