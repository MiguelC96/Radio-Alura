package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Still loving you");
        miCancion.setCantante("Sonata Artica");


        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("MAC");
        miPodcast.setTitulo("cafe.tech");

        for (int i = 0; i < 100 ; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        for (int i = 0; i < 100 ; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);

    }
}
