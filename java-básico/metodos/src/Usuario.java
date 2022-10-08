public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada ? "+ smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: "+ smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(13);
    }
}