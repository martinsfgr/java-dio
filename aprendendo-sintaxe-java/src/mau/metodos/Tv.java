package mau.metodos;

public class Tv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void definirCanal(int novoCanal) {
        canal = novoCanal;
    }
}
