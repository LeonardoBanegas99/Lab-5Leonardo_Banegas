package lab5leonardobanegas;

import java.util.ArrayList;

public class Escuadron {

    private String nombre;
    private String localidad;
    private String lema;
    private Persona lider;
    private String tipo;
    private ArrayList<Persona> miembros = new ArrayList();

    public Escuadron(String nombre, String localidad, String lema, Persona lider, String tipo) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lema = lema;
        this.lider = lider;
        this.tipo = tipo;
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

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
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
