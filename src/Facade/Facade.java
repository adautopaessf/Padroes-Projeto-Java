package Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getinstancia().recuperarCidade(cep);
		String estado = CepApi.getinstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
