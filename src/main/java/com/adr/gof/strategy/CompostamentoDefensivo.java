package com.adr.gof.strategy;

public class CompostamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("defensive move");
    }
}
