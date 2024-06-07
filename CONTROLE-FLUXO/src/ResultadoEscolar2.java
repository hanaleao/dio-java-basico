public class ResultadoEscolar2 {
	//condições encadeadas
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
// em condição ternaria 
public static void main(String[] args) {
	int nota = 6;
	string resultado = nota >=7 ? "aprovado" : nota >=5 && nota <7 ? "recuperação" : "reprovado";
	System.out.println(resultado);
}
