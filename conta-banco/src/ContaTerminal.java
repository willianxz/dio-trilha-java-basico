import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("========== SISTEMA BANCARIO =========");
        System.out.println("----- CADASTRO DE CONTA ----");
        System.out.println("Por favor.... digite o seu nome: ");
        String lerNome = scanner.nextLine();
        System.out.println("Por favor.... digite o numero de sua conta: ");
        int lerNumeroDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor.... digite a agencia de sua conta: ");
        String lerAgenciaDaConta = scanner.nextLine();
        System.out.println("Por favor.... digite o saldo: ");
        double lerSaldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("PROCESSANDO DADOS.....AGUARDE!");
        System.out.println("A CONTA DO CLIENTE FOI CADASTRADA COM SUCESSO!");
        System.out.println("==============================================");
        System.out.println("Olá " + lerNome + " obrigado por criar uma conta em nosso banco," + " sua agência é "
                + lerAgenciaDaConta + ", " + "conta " + lerNumeroDaConta + " " + "e seu saldo " + lerSaldo + " "
                + "ja está disponivel para saque.");
        System.out.println("==============================================");
    }
}
