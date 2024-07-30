package pilaresdopoo.autodormo;

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("12121212");
        // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("1111111");
        // z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
