package hospital.vista;

import hospital.controlador.ControlHospital;
import hospital.modelo.Medicamentos;


public interface InterfazEliminar {
    
    void setControlador(ControlHospital c);
    void inicializar();
    void visualizar();
    void esconder();
    
    String eliminar();
    
    static final String VOLVER_OPCIONES_CITA="Volver opciones cita desde eliminar";
    static final String VOLVER_OPCIONES_MED="Volver opciones med desde eliminar";
    static final String ELIMINAR_CITA="Eliminar cita";
    static final String ELIMINAR_MED="Eliminar med";    
}
