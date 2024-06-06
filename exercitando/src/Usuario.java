public class Usuario {
    public static void main(String[] args) throws Exception {
       //usuario interangindo sobre o objeto TV 
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("volume Atual :" + smartTV.volume);

        System.out.println("TV ligada ?" + smartTV.ligada);
        System.out.println("Canal atual :" + smartTV.canal);
        System.out.println("volume atual :" + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTV.ligada);
   
        smartTV.mudarCanal(13);
        System.out.println("Canal atual :" + smartTV.canal);
    }

}
