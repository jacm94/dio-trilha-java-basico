import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        //Coleta de dados do usuário
        System.out.println("Por favor digite o número da sua conta:");
        var accNumb = scanner.nextLong();
        System.out.println("Por favor digite o número da agencia:");
        var agency = scanner.next();
        System.out.println("Por favor digite seu nome completo:");
        String name = scanner.next();
        System.out.println("Por favor digite seu saldo:");
        Float balance = scanner.nextFloat();
        //Exibir mensagem pro usuário
        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %s e seu saldo R$ %s já está disponivel para saque!", name, agency, accNumb, balance);
    }
}