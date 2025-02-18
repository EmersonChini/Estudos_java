import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TOODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String Agencia;
        String Nome;
        double Saldo;

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        Agencia = scanner.nextLine(); 
        
        System.out.println("Por favor, digite o nome do Cliente:");
        Nome = scanner.nextLine(); 

        System.out.println("Por favor, digite o saldo da Conta:");
        Saldo = scanner.nextDouble();
        
        // Lê um número decimal (saldo)
        // Obter pela scanner os valores digitados no terminal
        // Exibira mensagem conta criada
    
        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + Agencia + ", conta " + numeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");
    
    }
}
