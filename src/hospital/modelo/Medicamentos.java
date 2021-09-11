package hospital.modelo;

public class Medicamentos {
 
    private String nombre;
    private String principio;
    private String Tipo;
    private Integer Gramaje;
    private Integer Stock;

    public Medicamentos() {
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrincipio() {
        return principio;
    }

    public void setPrincipio(String principio) {
        this.principio = principio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Integer getGramaje() {
        return Gramaje;
    }

    public void setGramaje(Integer Gramaje) {
        this.Gramaje = Gramaje;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer Stock) {
        this.Stock = Stock;
    }
    
    
}
