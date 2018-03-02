package lab5leonardobanegas;

import java.util.ArrayList;

public class Escuadron {

    private String nombre;
    private String localidad;
    private String lema;
    private Object lider;
    private ArrayList<Persona> miembros = new ArrayList();

    public Escuadron(String nombre, String localidad, String lema, Object lider) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lema = lema;
        this.lider = lider;
    }

    public Escuadron() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public Object getLider() {
        return lider;
    }

    public void setLider(Object lider) {
        this.lider = lider;
    }

    public ArrayList getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", localidad=" + localidad + ", lema=" + lema + ", lider=" + lider + ", miembros=" + miembros + '}';
    }
    
    
}
