import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("A seguir você deverá disponibilizar os dados da sua conta bancária:");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Nome do Cliente: ");
        String nome = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta - " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque!");

        sc.close();
    }
}
