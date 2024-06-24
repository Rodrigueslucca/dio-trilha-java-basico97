import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       //TODO: Conhecer e importar a classe Scanner

       //Exibir as mensagens para o nosso usuário

       //Obter pela scanner os valores digitados no terminal

       //Exibir a mensagem conta criada

       int numero;
       Float saldo;
       String nomecliente;
       String agencia;
       
       

       // Dados de entrada
       System.out.printf("Por favor, informe o seu nome: ");
       nomecliente = ler.nextLine();

       System.out.printf("Por favor, digite o número da Agência: ");
       agencia = ler.nextLine();

       System.out.printf("Por favor, digite o número da conta: ");
       numero = ler.nextInt();

       System.out.printf("por favor, informe o seu saldo: ");
       saldo = ler.nextFloat();

       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomecliente, agencia, numero, saldo
       ); 





  

       
    }
}
