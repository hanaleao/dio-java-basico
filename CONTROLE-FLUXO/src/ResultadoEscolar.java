public class ResultadoEscolar {
    //Estrutura condicional composta
    public static void main(String[] args) {

        int nota = 6;
        //if = se, se nota > 7 imprime aprovado
        if(nota >= 7)
         System.out.println("Aprovado");
        //else= senão, senão imrime reprovado
        else
         System.out.println("Reprovado");

         // se dentro do if ou else tiver mais de uma intrução é necessario criar um bloco {}
        // exemplo 
        
        double saldo = 25.0;
        double valorSolicitado = 26.0;
 
     if(valorSolicitado < saldo) {
          saldo = saldo - valorSolicitado;
         System.out.println("novo saldo" + saldo);

        }else 
        System.out.println("saldo insuficiente");
 }


}
