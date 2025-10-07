package basquete.abstractfactory;

public class FabricaProfissional implements FabricaAbstrata {

    @Override
    public Certificado createCertificado() {
        return new CertificadoProfissional();
    }

    @Override
    public Estatistica createEstatistica() {
        return new EstatisticaProfissional();
    }
}