public class ExemplosArray {
    public static void main(String[] args) {
        //Arrays = conjuntos de elementos de um tipo correspondente no caso string
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
//length quer dizer tamanho
//enquanto essa variavel X for menor que o arrays (alunos) ele continuara em execução
// em arrays o indice inicia em ZERO (int x=0)
	for (int x=0; x<alunos.length; x++) {
    //quero busca na minha lista de alunos (arrays), aquele que esta na posição x
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}

}
}

//O uso do for / each  está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim , a interação é baseada nos elementos da coleção.
//
// ExemploFor.java
//public class ExemploFor {
    //public static void main(String[] args) {
       // String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
       // for(String aluno : alunos) {
       //   System.out.println(alunos);
       // }
    
