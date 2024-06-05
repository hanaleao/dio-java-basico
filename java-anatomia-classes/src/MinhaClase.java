public class MinhaClase {

    public static void main(String [] args) {
  
        String primeiroNome = "Hana ";
        String segundoNome= "Leão";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Métododo " + primeiroNome.concat("").concat(segundoNome);
    }

    
}
