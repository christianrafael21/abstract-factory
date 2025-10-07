package basquete.abstractfactory;

public class CertificadoAmador implements Certificado {

    @Override
    public String emitir() {
        return "Certificado de Amador";
    }
}