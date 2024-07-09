
public class PlanoOperadora {

    public static void main(String[] args) {
        System.out.println("Utilizando if/else:");
        String plano = "B"; //M / T

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5Gb Youtube");
        }

        System.out.println("------\nUtilizando o switch case:");
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
