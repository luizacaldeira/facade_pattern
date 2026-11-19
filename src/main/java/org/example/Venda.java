package org.example;

public class Venda {

    public boolean fechar() {
        return VendaFacade.verificarPendenciasFechamento(this);
    }
}