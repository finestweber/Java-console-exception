package br.com.finestweber.model;

import br.com.finestweber.excessão.nomeExcection;

public class Veiculo {
	private String nome;
	private String marca;
	private String codigo;
	private float qtdCombustivel=7;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws nomeExcection {		
		if(nome.length()==8){this.nome = nome;}
		else{throw new nomeExcection(nome);}
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) throws nomeExcection  {
		if(marca.length()==10){this.marca = marca;}
		else{throw new nomeExcection(marca);}
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) throws nomeExcection {
		if(codigo.length()==6){this.codigo = codigo;}
		else{throw new nomeExcection(codigo);}
	}
	public float getQtdCombustivel() {
		return qtdCombustivel;
	}
	public void combustivel(float litros) {
		qtdCombustivel = qtdCombustivel+litros;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome+" "+marca+" "+codigo+" "+qtdCombustivel;
	}
	
}
