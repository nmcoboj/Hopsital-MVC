package hospital.modelo;

public class Citas {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String Dia;
    private String Mes;
    private String Anio;
    private String Hora;
    private String Descripcion;
    private String Consultorio;

    public String getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(String Consultorio) {
        this.Consultorio = Consultorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }


    
}

