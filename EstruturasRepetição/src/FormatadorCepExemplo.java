public class FormatadorCepExemplo {
    // Definição da exceção personalizada CepInvalidoException
    public static class CepInvalidoException extends Exception {
        public CepInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    // Método principal
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("o cep não corresponde com as regras de negocio");
        }
    }

    // Método para formatar o CEP
    static String formatarCep(String cep) throws CepInvalidoException {
        // Verifica se o CEP tem exatamente 8 dígitos
        if (cep.length() != 8) {
            throw new CepInvalidoException("CEP deve conter exatamente 8 dígitos.");
        }
        
        // Formata o CEP no formato "XX.XXX-XXX"
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }
}


 /*Imagina que como regra de negócio, para formatar um cep, 
    necessita sempre de ter 8 dígitos, caso contrário, lançará uma exceção que denominamos de CepInvalidoException.
Primeiro criamos nossa exceção:
public class CepInvalidoException extends Exception {} 
Em seguida, criamos nosso método de formatação de cep:*/