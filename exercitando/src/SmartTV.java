public class SmartTV { 
     //Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
    //Ela tenha as características: ligada (boolean), canal (int) e volume (int);
    //Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    //Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
    //Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
    //objeto TV
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
    ligada = false;

    }
    public void aumentarVolume(){
       //primeiro se faz o aumento e depois somar 
        volume++;
        System.out.println("Aumentando o volume para:" + volume);
      //volume = volume + 1  
        
    }
    public void diminuirVolume(){
        // primeiro se diminui depois subtrai
        volume--;
        System.out.println("diminuindo o volume para" + volume);
        //volume = volume - 1  
          
        }
    public void aumentarCAnal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}