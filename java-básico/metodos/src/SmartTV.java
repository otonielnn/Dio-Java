public class SmartTV {
    boolean ligada  = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada=true;
        System.out.println("TV Ligada ? "+ ligada);
    }

    public void desligar(){
        ligada=false;
        System.out.println("TV Ligada ? "+ ligada);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal Atual: "+ canal);
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Volume Atual: "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume Atual: "+ volume);
    }
}