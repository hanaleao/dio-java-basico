public class SistemaMedida {
    // Modo condicional if/else
//sistema de impressão
//Sigla	Tamanho
//P     PEQUENO
//M     MÉDIO
//G     GRANDE

public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		
	}
}


// Modo condicional switch / case
//não é mais performatico do que um if/else tradicional
//sistema de impressão
//Sigla	Tamanho
//P     PEQUENO
//M     MÉDIO
//G     GRANDE

public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
        //default é a ultima intrução por isso não precisa dar um break
			System.out.println("INDEFINIDO");
		}

//um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algoritmo seria conforme ilustração abaixo:
//Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
//O sistema terá 03 planos: BASIC, MIDIA , TURBO;
//BASIC: 100 minutos de ligação;
//MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
//TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.

// Modo condicional convencional
//acaba sendo repetitivo
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}

// Modo condicional switch/case
//aqui ele adiciona- usa o switch/case como algo complementar sem o break
//Se optarem por usar switch/ case, estudem um pouco mais, sobre os conceitos de 
//continue, break e default

public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}
}
