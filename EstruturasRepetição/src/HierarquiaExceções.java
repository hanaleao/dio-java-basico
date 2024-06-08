import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaExceções {
    /*Vamos imaginar que precisamos realizar de duas maneiras, a conversão de
     uma String para um número, porém o texto contém Alfanuméricos. */

      public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        try {
            /* try tenta converter essa string para o valor se não der certo
             * o metodo ja diz que precisa tratar, e ele trata jogando essa exceção para
             * catch (ParseException e)
             */
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(valor);
       
    }
}
