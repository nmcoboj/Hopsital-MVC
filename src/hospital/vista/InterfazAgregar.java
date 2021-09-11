package hospital.vista;

import hospital.controlador.ControlHospital;
import hospital.modelo.Citas;
import hospital.modelo.Medicamentos;

public interface InterfazAgregar {
    
    void setControlador(ControlHospital c);
    void inicializar();
    void visualizar();
    void esconder();
    
    Citas agregar_cita();
    Medicamentos agregar_med();
    
   
    static final String VOLVER_OPCIONES_CITA="Volver opciones cita desde agregar";
    static final String VOLVER_OPCIONES_MED="Volver opciones med desde agregar";
    static final String AGREGAR_CITA="Agregar cita";
    static final String AGREGAR_MED="Agregar med";
    
}
