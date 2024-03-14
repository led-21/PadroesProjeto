package com.adr.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepAPi.getInstance().recuperarCidade(cep);
        String estado = CepAPi.getInstance().recuperarEstado(cep);

        CrmService.gravarClient(nome,cep, cidade, estado);
    }
}
