package basquete.abstractfactory;

public class EstatisticaProfissional implements Estatistica {

    @Override
    public String emitir() {
        return "Estatística de Profissional";
    }
}