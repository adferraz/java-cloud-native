import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Digite número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite saldo: R$ ");
        saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");




    }
}