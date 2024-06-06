public class Operadores {
   
    public static void main(String[] args) throws Exception {
    
        //classe Operadores.java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4);
//qual o resultado das expressoes abaixo?

String concatenacao ="?"; 

concatenacao = 1+1+1+"1";

concatenacao = 1+"1"+1+1;

concatenacao = 1+"1"+1+"1";

concatenacao = "1"+1+1+1;

concatenacao = "1"+(1+1+1);

 //unários
//classe Operadores.java
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

variavel = !variavel
System.out.println("Inverteu " + !verdadeiro);


// Ternario
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(valor);

//Relacionados - validações
int numero1 = 1;
int numero2 = 2;

boolean simNao = numeo1 == numero2;
        System.out.println("numeroUm é igual a numeroDois?" = simNao);
        //retorna false

        simNao = numeo1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois?" + simNAo );
        //retorna true

if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2");
    //retorna false
if(numero1 < numero2)
	System.out.print("Numero 1 menor que numero 2");

if(numero1 >= numero2)
	System.out.print("Numero 1 maior ou igual que numero 2");

if(numero1 <= numero2)
	System.out.print("Numero 1 menor ou igual que numero 2");

if(numero1 != numero2)
	System.out.print("Numero 1 é diferente de numero 2");jav

String nomeUm = "hana";
String nomeDois = "hana";
System.out.println(nomeUm == nomeDois);
//retorna true

// Operadores logicos 
//&& Operador Lógico "E"
// || Operador Lógico "OU"
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores são verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores é verdadeiro");

if (condicao1 && (7 < 4 ) ) {
    System.out.println("as duas condições são verdadeiras");
    //retorna= as duas condiçoes são verdadeiras
}
}
}
