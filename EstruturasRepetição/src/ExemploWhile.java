import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
    /*//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
} */
    /*Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho. */
	double mesada = 50.0;
    //enquanto o valor da mesada for maior que 0, se pega um doce com valor aleatorio, enquanto a mesada for >0. depois disso é interrompido
        while(mesada>0) {
            //valor aleatorio retorna um Double
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
                //se o valor do doce for maior que a mesada 

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            //aqui interrompe
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}
