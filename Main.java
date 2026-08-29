import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("=====>>> BANCO ITAIVIS <<<=====\n");

            System.out.print("Digite o numero da Conta: ");
            int numberAccount = scan.nextInt();
            scan.nextLine();
            System.out.print("Digite o numero da Agência: ");
            String agency = scan.nextLine();
            System.out.print("Digite seu Nome: ");
            String userName = scan.nextLine();
            System.out.print("Digite seu saldo: ");
            double balance = scan.nextDouble();

            TerminalAccount accountInfos = new TerminalAccount(numberAccount, agency, userName, balance);

            System.out.println("Olá, " + (userName) + "! Obrigado por criar uma conta em nosso banco.\nSua Agência é " + (agency) + "\nConta " + numberAccount + "\nSeu saldo " + balance + " já esta disponivel para o saque.");
        } catch (Exception e) {
            System.out.println("Dado Inválido.");
        }
    }
}