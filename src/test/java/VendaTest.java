import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveRetornarPendenciaFinanceiroFechamento() {
        Venda venda = new Venda();
        Financeiro.getInstancia().addVendaPendente(venda);

        assertEquals(false, venda.fechar());
    }

    @Test
    void deveRetornarPendenciaJuridicoFechamento() {
        Venda venda = new Venda();
        Juridico.getInstancia().addVendaPendente(venda);

        assertEquals(false, venda.fechar());
    }

    @Test
    void deveRetornarPendenciaTecnicoFechamento() {
        Venda venda = new Venda();
        Tecnico.getInstancia().addVendaPendente(venda);

        assertEquals(false, venda.fechar());
    }

    @Test
    void deveRetornarVendaSemPendenciaFechamento() {
        Venda venda = new Venda();

        assertEquals(true, venda.fechar());
    }

}