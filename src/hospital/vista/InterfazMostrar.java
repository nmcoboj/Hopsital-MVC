package hospital.vista;

import hospital.controlador.ControlHospital;
import hospital.modelo.Citas;
import hospital.modelo.Consultorios;
import hospital.modelo.Medicamentos;
import java.util.ArrayList;

public interface InterfazMostrar {
    
    void setControlador(ControlHospital c);
    void inicializar();
    void visualizar();
    void esconder();
    
    void mostrar_consultorios(ArrayList<Consultorios> consultorios);
    void mostrar_citas(ArrayList<Citas> consultorios);
    void mostrar_medicamentos(ArrayList<Medicamentos> consultorios);
    
    static final String VOLVER_INICIO_CON="Volver inicio desde mostrar con";
    static final String VOLVER_OPCIONES_CITA="Volver opciones cita desde mostrar";
    static final String VOLVER_OPCIONES_MED="Volver opciones med desde mostrar";
}
