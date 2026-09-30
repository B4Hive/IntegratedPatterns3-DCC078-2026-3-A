package b4hive.factories;

import b4hive.contratos.Contrato;
import b4hive.documentos.Documento;

public interface AbstractFactory {

    Documento registerDocumento(String info);

    Contrato registerContrato(String info);

}
