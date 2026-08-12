import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conchecer e inmportar a class Scanner
        //Exibir as mensagens para o nosso usúario
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 237.48;

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = input.nextInt();
        input.nextLine();
        System.out.print("Digite o número da Agência: ");
        String numeroDaAgencia = input.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = input.nextLine();

        System.out.println("\nInfomações do Usuário\n");

        System.out.println("Olá "+nomeCompleto+", obrigado por criar uma conta em " +
                "nosso banco, sua agência é "+numeroDaAgencia+", conta "+numeroDaConta+"  " +
                "e seu saldo R$ "+saldo+" já está disponível para saque");




    }
}