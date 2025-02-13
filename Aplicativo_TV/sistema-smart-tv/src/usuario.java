public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.DiminuirVolume();
        smartTV.DiminuirVolume();
        smartTV.DiminuirVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(5);

        System.out.println("Canal atual :" + smartTV.canal); 

        System.out.println("Volume atual :" + smartTV.volume);
        
        System.out.println("TV Ligada :" + smartTV.ligada);
        System.out.println("Canal atual :" + smartTV.canal); 
        System.out.println("Volume atual :" + smartTV.volume);

        smartTV.ligar();

        System.out.println("Novo Status - TV Ligada :" + smartTV.ligada);

        smartTV.desligar();

        System.out.println("Novo Status - TV Desligada :" + smartTV.ligada);

    }
    }
