package edu.paulo.metodo;

public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada ?" + " " + smartTv.ligada);
        System.out.println("Canal atual :" + " " + smartTv.canal);
        System.out.println("Volume atual :" + " " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV está ligada ?" + " " + smartTv.ligada);
        System.out.println("Canal atual :" + " " + smartTv.canal);
        System.out.println("Volume atual :" + " " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual :" + " " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual :" + " " + smartTv.volume);
        smartTv.desligar();
        smartTv.ligar();
        System.out.println("Canal atual :" + " " + smartTv.canal);
        smartTv.mudarCanal(5);
        System.out.println("Canal atual :" + " " + smartTv.canal);
        smartTv.desligar();
    }
}
