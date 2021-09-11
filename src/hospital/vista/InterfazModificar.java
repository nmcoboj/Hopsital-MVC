package hospital.vista;

import hospital.controlador.ControlHospital;
import hospital.modelo.Citas;
import hospital.modelo.Medicamentos;

public interface InterfazModificar {
    
    void setControlador(ControlHospital c);
    void inicializar();
    void visualizar();
    void esconder();
    
    void escribir(Medicamentos med);
    Medicamentos modificar_med();
    
    void escribir(Citas citas);
    Citas modificar_citas();
    
    static final String VOLVER_MODIFICAR_INICIO_CITA="Volver modificar inicio cita desde modificar";
    static final String VOLVER_MODIFICAR_INICIO_MED="Volver modificar inicio med desde modificar";
    static final String MODIFICAR_CITA="Modificar cita";
    static final String MODIFICAR_MED="Modificar med";
    
    
}
