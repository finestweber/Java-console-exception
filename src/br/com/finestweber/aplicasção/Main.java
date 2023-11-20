package br.com.finestweber.aplicasção;

import br.com.finestweber.excessão.nomeExcection;
import br.com.finestweber.model.Veiculo;

public class Main {
	
	public static void main(String[] args) throws nomeExcection{
		// TODO Auto-generated method stub
		try {
			Veiculo v1 = new Veiculo();
			v1.setNome("Gamaliel");
			v1.setMarca("Land_Rover");
			v1.setCodigo("ID_ARP");
			v1.combustivel(7);
			System.out.println(v1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}
