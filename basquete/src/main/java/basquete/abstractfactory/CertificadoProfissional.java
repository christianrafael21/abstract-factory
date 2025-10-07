package basquete.abstractfactory;

public class CertificadoProfissional implements Certificado {

    @Override
    public String emitir() {
        return "Certificado de Profissional";
    }
}