import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nome = scanner.next();

         System.out.println("Por favor, digite o sobrenome do Cliente");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        //Olá [Nome Cliente], 
        //obrigado por criar uma conta em nosso banco, 
        //sua agência é [Agencia], 
        //conta [Numero] 
        //e seu saldo [Saldo] 
        //já está disponível para saque"

        System.out.println("Olá " + nome + " " + sobrenome + ",");
        System.out.println("obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ",");
        System.out.println("conta " + numero + ",");
        System.out.println("e seu saldo " + saldo + " já está disponível para saque."); 
    }

}