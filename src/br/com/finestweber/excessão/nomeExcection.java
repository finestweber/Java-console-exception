package br.com.finestweber.excessão;

public class nomeExcection extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6717275561588887411L;
	public nomeExcection(String nome) {
		// TODO Auto-generated constructor stub
		super("ERRO: "+nome+" Não e valido");
	}
}
