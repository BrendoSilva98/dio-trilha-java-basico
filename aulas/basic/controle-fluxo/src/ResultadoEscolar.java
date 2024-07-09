// Cenário 2
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 9;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);//ternary operator works the same as if else ... 
    }
}
/*
 * public class ResultadoEscolar {
 * public static void main(String[] args) {
 * int nota = 7;
 * 
 * if (nota >= 7)
 * System.out.println("Aprovado");
 * else if (nota >= 5)
 * System.out.println("Prova de Recuperacao");
 * else
 * System.out.println("Reprovado");
 * }
 * }
 * 
 */