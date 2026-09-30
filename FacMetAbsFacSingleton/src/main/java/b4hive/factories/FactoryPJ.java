package b4hive.factories;

import b4hive.contratos.ContratoPJ;
import b4hive.documentos.DocumentoPJ;

public class FactoryPJ implements AbstractFactory {

    @Override
    public ContratoPJ registerContrato(String info) {
        return new ContratoPJ(info);
    }

    @Override
    public DocumentoPJ registerDocumento(String info) {
        return new DocumentoPJ(info);
    }

}
