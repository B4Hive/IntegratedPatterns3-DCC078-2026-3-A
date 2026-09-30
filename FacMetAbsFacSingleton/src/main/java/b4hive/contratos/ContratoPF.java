package b4hive.contratos;

public class ContratoPF implements Contrato {

    private String info;

    public ContratoPF(String info) {
        this.info = info;
    }

    @Override
    public String getInfo() {
        return info;
    }

}
