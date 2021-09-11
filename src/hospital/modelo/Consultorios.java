package hospital.modelo;

public class Consultorios {
    
    private String nombre;
    private String Hora;

    public Consultorios(String nombre, String Hora) {
        this.nombre = nombre;
        this.Hora = Hora;
    }

    public Consultorios() {
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    
  
}
