class Televisao{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void aumentarVolume(){
        volume++;
        System.out.println("Volume atual: "+volume);
    }

    void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: "+volume);
    }

    void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: "+canal);
    }

    void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: "+canal);
    }

    void mudarCanal(int c){
        canal = c;
        System.out.println("Canal atual: "+canal);
    }
}