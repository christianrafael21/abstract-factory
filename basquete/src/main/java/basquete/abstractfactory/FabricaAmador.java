package basquete.abstractfactory;

public class FabricaAmador implements FabricaAbstrata {

    @Override
    public Certificado createCertificado() {
        return new CertificadoAmador();
    }

    @Override
    public Estatistica createEstatistica() {
        return new EstatisticaAmador();
    }
}