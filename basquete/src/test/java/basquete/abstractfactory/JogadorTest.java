package basquete.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveEmitirEstatisticaAmador() {
        FabricaAbstrata fabrica = new FabricaAmador();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Estatística de Amador", jogador.emitirEstatistica());
    }

    @Test
    void deveEmitirEstatisticaProfissional() {
        FabricaAbstrata fabrica = new FabricaProfissional();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Estatística de Profissional", jogador.emitirEstatistica());
    }

    @Test
    void deveEmitirCertificadoAmador() {
        FabricaAbstrata fabrica = new FabricaAmador();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Certificado de Amador", jogador.emitirCertificado());
    }

    @Test
    void deveEmitirCertificadoProfissional() {
        FabricaAbstrata fabrica = new FabricaProfissional();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Certificado de Profissional", jogador.emitirCertificado());
    }

}