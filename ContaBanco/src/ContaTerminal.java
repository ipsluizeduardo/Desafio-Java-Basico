import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nomero da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite a agencia da conta");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nome = scanner.next();

        System.out.println("Digite saldo da conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " 
        + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já esta disponivel para saque.");
    }
}
