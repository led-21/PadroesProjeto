package com.adr.gof.strategy;

public class CompostamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("aggressive move");
    }
}
