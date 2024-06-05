public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos 
        //classe String representa texto na aplicação 

        String meuNome = "HANA LEÃO";
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        final double VALOR_DE_PI = 3.14;
    
        // Usando System.out.println
        System.out.println("Meu nome: " + meuNome);
        System.out.println("Salário mínimo: " + salarioMinimo);
        System.out.println("Valor de PI: " + VALOR_DE_PI);


       }
}
