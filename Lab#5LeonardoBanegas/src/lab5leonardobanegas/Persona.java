package lab5leonardobanegas;

public class Persona {

    private String nombre;
    private String poder;
    private String debilidad;
    private Escuadron escuadron;
    private int fuerza;
    private int agilidadfisica;
    private int agilidadmental;

    public Persona() {
    }

    public Persona(String nombre, String poder, String debilidad, int fuerza, int agilidadfisica, int agilidadmental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadfisica = agilidadfisica;
        this.agilidadmental = agilidadmental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadfisica() {
        return agilidadfisica;
    }

    public void setAgilidadfisica(int agilidadfisica) {
        this.agilidadfisica = agilidadfisica;
    }

    public int getAgilidadmental() {
        return agilidadmental;
    }

    public void setAgilidadmental(int agilidadmental) {
        this.agilidadmental = agilidadmental;
    }

    @Override
    public String toString() {
        return nombre + ", debilidad=" + debilidad;
    }

}
