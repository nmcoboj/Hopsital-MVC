package hospital.vista;

import hospital.controlador.ControlHospital;


public interface InterfazModificarInicio {
      
    void setControlador(ControlHospital c);
    void inicializar();
    void visualizar();
    void esconder();
    
    String modificar();
    
    static final String VOLVER_INICIO_CITA="Volver inicio cita desde modificar";
    static final String VOLVER_INICIO_MED="Volver inicio med desde modificar";
    static final String MODIFICAR_CITA="Ir a modificar cita";
    static final String MODIFICAR_MED="Ir a modificar med";  
    
}
