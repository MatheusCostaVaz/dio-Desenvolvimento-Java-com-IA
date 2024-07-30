package pilaresdopoo.impressora.equipamentos.multifucional;

import pilaresdopoo.impressora.equipamentos.copiadora.Copiadora;
import pilaresdopoo.impressora.equipamentos.digitalizadora.Digitalizadora;
import pilaresdopoo.impressora.equipamentos.impressora.Impressora;

public class EquipamentoMultifucional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando de uma multifucional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitaliaando de uma multifucional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo de uma multifucional");
    }

}
