import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("===== ContaBanco =====");
            System.out.println();

            System.out.print("Por favor, digite o numero da Conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Por favor, digite o numero da Agencia: ");
            String agencia = scanner.nextLine();

            System.out.print("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o saldo: ");
            double saldo = scanner.nextDouble();

            Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

            String mensagem = "Ola " + conta.getNomeCliente()
                    + ", obrigado por criar uma conta em nosso banco, sua agencia e "
                    + conta.getAgencia()
                    + ", conta " + conta.getNumero()
                    + " e seu saldo " + String.format(Locale.US, "%.2f", conta.getSaldo())
                    + " ja esta disponivel para saque.";

            System.out.println();
            System.out.println(mensagem);
        } catch (InputMismatchException exception) {
            System.out.println("Dado invalido. Verifique os valores digitados e tente novamente.");
        }
    }
}
