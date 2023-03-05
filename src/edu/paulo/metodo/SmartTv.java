package edu.paulo.metodo;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar (){
        ligada = true;
        System.out.println("TV ligada !");
    }
    public void desligar (){
        System.out.println("Desligando a TV");
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + " " + volume);

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + " " + volume);
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        System.out.println("Alterando canal...");
        canal = novoCanal;
        System.out.println("Canal alterado");
    }
}
