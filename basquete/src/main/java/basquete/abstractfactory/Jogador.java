package basquete.abstractfactory;

public class Jogador {

    private final Certificado certificado;
    private final Estatistica estatistica;

    public Jogador (FabricaAbstrata fabrica) {
        this.certificado = fabrica.createCertificado();
        this.estatistica = fabrica.createEstatistica();
    }

    public String emitirCertificado() {
        return this.certificado.emitir();
    }

    public String emitirEstatistica() {
        return this.estatistica.emitir();
    }
}