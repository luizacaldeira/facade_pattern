package org.example;

public class VendaFacade {

    public static boolean verificarPendenciasFechamento(Venda venda) {
        if (Financeiro.getInstancia().verificarVendaComPendencia(venda)) {
            return false;
        }
        if (Juridico.getInstancia().verificarVendaComPendencia(venda)) {
            return false;
        }
        if (Tecnico.getInstancia().verificarVendaComPendencia(venda)) {
            return false;
        }
        return true;
    }
}