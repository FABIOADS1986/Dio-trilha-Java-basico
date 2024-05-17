import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner =  (new Scanner(System.in)).useLocale(Locale.US);

        System.out.println("Seja bem vindo ao Banco Dio");

        System.out.println("Digite o número da sua conta, com 4 digitos: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua conta, com 4 digitos e digite o DV após (-): ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldoDisponivel = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+
                ", conta "+numeroConta+ " e seu saldo R$" +saldoDisponivel+ " já está disponível para saque.");
    }
}
