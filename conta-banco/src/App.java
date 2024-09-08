import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String agencia = "", nomeCliente = "";
        int numeroConta = 0;
        double saldo = 011;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o nome do cliente");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o saldo");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
