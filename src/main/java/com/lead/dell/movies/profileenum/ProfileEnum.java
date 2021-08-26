package com.lead.dell.movies.profileenum;

public enum ProfileEnum {

	ADM(1), VISITOR(0);
	
	private int valor;
	
	private ProfileEnum (int valor) {
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}


