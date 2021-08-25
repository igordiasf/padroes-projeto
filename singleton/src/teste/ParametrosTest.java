package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeWindows() {
        Parametros.getInstance().setNomeWindows("Windows 1");
        assertEquals("Windows 1", Parametros.getInstance().getNomeWindows());
    }

    @Test
    public void deveRetornarUserLogado() {
        Parametros.getInstance().setUserLogado("User 1");
        assertEquals("User 1", Parametros.getInstance().getUserLogado());
    }

}