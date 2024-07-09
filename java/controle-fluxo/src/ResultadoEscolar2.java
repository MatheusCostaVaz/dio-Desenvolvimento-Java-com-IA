
public class ResultadoEscolar2 {

    public static void main(String[] args) {
        double nota = 6;

        String resultado = nota >= 7 ? "Aprvado" : "Reprovado";

        System.out.println(resultado);

        System.out.println("---------------------------");
        int nota2 = 7;
        //Se a nota for igual ou maior que 7 é aprovado caso ao contrario a nota for maior ou igual a 5 e menor que 7 é recuperação caso ao contrario é reprovadp
        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }

}
