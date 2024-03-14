package subsistema2.cep;

import com.adr.gof.singleton.SingletonEager;

public class CepAPi {
    private static CepAPi instance = new CepAPi();

    private CepAPi() {
        super();
    }

    public static CepAPi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Cidade";
    }

    public String recuperarEstado(String cep){
        return "Estado";
    }
}
