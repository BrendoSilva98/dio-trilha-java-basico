import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner
        // Exibir as mensagem para o nosso usuario
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome !");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o número Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = scanner.nextInt();

        System.out.println("Digite sua Saldo");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.print("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println(", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
