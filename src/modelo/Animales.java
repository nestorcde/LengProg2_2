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
public class Animales {
    private Integer id = 0;
    private String nombre = "";
    private Integer edad = 0;
    private String raza = "";

    public Animales(Integer id, String nombre, Integer edad, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public Animales() {
    }

    @Override
    public String toString() {
        return "Animales{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}

 
