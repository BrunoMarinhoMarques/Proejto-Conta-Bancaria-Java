import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Criando uma instancia do tipo Scanner e criando as variaveis
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        //exibindo mensagem e recebendo o que for digitado pelo usuario
        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();
        
        //exibindo mensagem e recebendo o que for digitado pelo usuario
        System.out.println("Agora digite a Agência por favor: ");
        agencia = scanner.next();

        //esvaziando buffer do teclado
        scanner.nextLine();

        //exibindo mensagem e recebendo o que for digitado pelo usuario
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        //exibindo mensagem e recebendo o que for digitado pelo usuario
        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        //exibindo mensagem com as informações do usuario
        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");




    

    }
}
