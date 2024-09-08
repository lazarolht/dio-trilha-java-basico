public class Usuario {
    public static void main(String[] args) throws Exception {
        
        Televisao tv = new Televisao();

        System.out.println("A TV está "+tv.ligada);
        System.out.println("Canal atual: "+tv.canal);
        System.out.println("Volume atual: "+tv.volume);

        tv.ligar();
        System.out.println("A TV está "+tv.ligada);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.diminuirCanal();
        tv.mudarCanal(41);

        tv.desligar();
        System.out.println("A TV está "+tv.ligada);
    }
}
