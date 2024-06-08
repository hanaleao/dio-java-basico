import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class exemplosEstruturasExcepcionais {

/*algumas possíveis exceções, que podem acontecer.
Não informar o nome e sobrenome;
O valor da idade ter um caractere NÃO numérico;
O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano); */

/*Estrutura de um bloco com try e catch: A instrução 
try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.
A instrução catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.
A instrução finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares */

/*try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
} */

public static void main(String[] args) {
    //try acompanha tudo que for positivo,O bloco contém o código que pode lançar uma exceção (captura)
    try{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   

    }
    catch(InputMismatchException e) {
        //catch o bloco catch lida com a exceção.
        System.out.println("o campo idade e altura precisam ser numericos");
    // ou System.err.println();

        //posivel retorno do terminal "exception in thead "main" java.util etc.."
    }

    }
