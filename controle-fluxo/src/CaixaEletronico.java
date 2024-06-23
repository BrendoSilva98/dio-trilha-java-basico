public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;// there no need to use {} when there just one line of code

        System.out.println(saldo);
    }
}
