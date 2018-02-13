/*
 * Nestor Damian Espinola Chaves
 * CI: 4.543.390
 * Analisis De Sistemas
 */


import modelo.Animales;
import modelo.Gatos;

/**
 *
 * @author user
 */
public class AnimalesMain {
    public static void main(String[] args) {
        Animales animal = new Animales(0,"toto",2,"doberman");
        System.out.println(animal);
        
        Gatos gato = new Gatos(0,"micho",3,"siames","rojo");
        System.out.println(gato);
    }
    
}
