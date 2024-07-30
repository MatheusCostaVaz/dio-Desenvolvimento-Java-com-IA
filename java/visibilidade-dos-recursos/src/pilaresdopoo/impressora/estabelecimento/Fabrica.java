package pilaresdopoo.impressora.estabelecimento;

import pilaresdopoo.impressora.equipamentos.copiadora.Copiadora;
import pilaresdopoo.impressora.equipamentos.digitalizadora.Digitalizadora;
import pilaresdopoo.impressora.equipamentos.impressora.Deskjet;
import pilaresdopoo.impressora.equipamentos.impressora.Impressora;
import pilaresdopoo.impressora.equipamentos.impressora.Laserjet;
import pilaresdopoo.impressora.equipamentos.multifucional.EquipamentoMultifucional;

public class Fabrica {

    public static void main(String[] args) {
        Impressora deskjet = new Deskjet();
        Impressora laserjet = new Laserjet();
        Impressora multi = new EquipamentoMultifucional();

        deskjet.imprimir();
        laserjet.imprimir();
        multi.imprimir();

        System.out.println("---------------");

        EquipamentoMultifucional func = new EquipamentoMultifucional();
        Impressora impressora = func;
        Digitalizadora digitalizadora = func;
        Copiadora copiadora = func;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
