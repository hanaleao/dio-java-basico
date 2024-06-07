import java.util.Random;
public class ExemploDoWhile {
public static void main(String[] args) {
        /*Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos: 
         * o metodo diz que esta discando/tocando enquanto essa expressão for verdadeira, quando se tornar falsa o algoritimo vai para a fase de alo
        */
		System.out.println("Discando...");
		/*//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação); */

/*o do while permite que execute ao menos uma vez para que depois ele 
 * realize a condição
 */
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
    //metodo boolenano (tocando) que me retorna sim ou não (se esta tocando)
	private static boolean tocando() {
        //diz atendeu se no valor entre 1 e 3, for igual a 1 atendeu
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
        //! nega uma expressão booleana, se ele atendeu então não quero mais que diga que esta tocando
		return ! atendeu;
        //Atendeu? true; Alô !!!
	}
}
