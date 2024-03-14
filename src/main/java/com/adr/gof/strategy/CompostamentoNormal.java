package com.adr.gof.strategy;

public class CompostamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("normal move");
    }
}
