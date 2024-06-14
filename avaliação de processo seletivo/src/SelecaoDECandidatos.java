import java.util.concurrent.ThreadLocalRandom;

public class SelecaoDECandidatos {
    
    public static void main(String[] args) {
    SeleçaodeCandidatos();

    }
    
    static void SeleçaodeCandidatos () {
     // Array com a lista de candidatos
    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    //while diz "enquanto algo seja verdadeiro" (enqunto for menor que 5 vai buscar mais candidatos)
    // " && candidatosAtual < candidatos.length" enquanto tiver candidatos na lista
    while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato" + candidato + "solicitou este valor de salrio" + salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtual++;
    }
}
static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) { 
            System.out.println( "LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMASIS CANDIDATOS");

            
  
        }
    }
}

