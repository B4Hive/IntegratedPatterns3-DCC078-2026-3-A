package b4hive.factories;

import b4hive.contratos.ContratoPF;
import b4hive.documentos.DocumentoPF;

public class FactoryPF implements AbstractFactory {

    @Override
    public ContratoPF registerContrato(String info) {
        return new ContratoPF(info);
    }

    @Override
    public DocumentoPF registerDocumento(String info) {
        return new DocumentoPF(info);
    }

}
