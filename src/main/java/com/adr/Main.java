package com.adr;

import com.adr.gof.facade.Facade;
import com.adr.gof.singleton.SingletonLazy;
import com.adr.gof.strategy.Comportamento;
import com.adr.gof.strategy.CompostamentoAgressivo;
import com.adr.gof.strategy.CompostamentoDefensivo;
import com.adr.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        //Strategy
        Robo robo = new Robo();
        Comportamento defensivo = new CompostamentoDefensivo();
        Comportamento agressivo = new CompostamentoAgressivo();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Adriano","123");
    }
}