public class CaixaEletronico {
    //Estrutura condicional Simples
    public static void main(String[] args) {

        double saldo = 25.0;
       double valorSolicitado = 17.0;
        //if=se, se o valor solicitado for menor que o saldo o bloco saldo = saldo - valorSolicitado sera executado imprimindo saldo atualizado.
        //do contrario nada acontecera 
        //a intrução tem que ser verdadeira para ser executado
       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    //se o valorSolicitado fosse 26, o saldo continuaria 25 porque 
    //constatou-se que no controle de fluxo não entrou nessa jornada
    //ele verificou se ele tinha uma operação condicional e chegou a conclusão que esse fluxo não seria executado por não atender a condição.


    double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
}
}
