package enumsexemplo;

public class SistemaIbge {

    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getIbge());
        }
        System.out.println("--------------------------");
        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
