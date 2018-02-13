/*
 * Nestor Damian Espinola Chaves
 * CI: 4.543.390
 * Analisis De Sistemas
 */
package modelo;

/**
 *
 * @author user
 */
public class Gatos extends Animales {
    private String color = null;
            

    public Gatos(Integer id, String nombre, Integer edad, String raza, String color) {
        super(id, nombre, edad, raza);
        this.color = color;
    }

    public Gatos() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gatos{" +super.toString()+ "color=" + color + '}';
    }
    
    
    
}
