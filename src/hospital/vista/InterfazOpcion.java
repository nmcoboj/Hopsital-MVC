package hospital.vista;

import hospital.controlador.ControlHospital;

public interface InterfazOpcion {

    void setControlador(ControlHospital c);

    void inicializar();

    void visualizar();

    void esconder();

    static final String VOLVER_A_INICIO_CITAS = "Volver inicio desde opc citas";
    static final String VENTANA_MOSTRAR_CITAS = "Ventana mostrar citas";
    static final String VENTANA_AGREGAR_CITA = "Ventana agregar cita";
    static final String VENTANA_MODIFICAR_CITA = "Ventana modificar cita inicio";
    static final String VENTANA_ELIMINAR_CITA = "Ventana eliminar cita";

    static final String VOLVER_A_INICIO_MED = "Volver inicio desde opc med";
    static final String VENTANA_MOSTRAR_MED = "Ventana mostrar med";
    static final String VENTANA_AGREGAR_MED = "Ventana agregar med";
    static final String VENTANA_MODIFICAR_MED = "Ventana modificar med inicio";
    static final String VENTANA_ELIMINAR_MED = "Ventana eliminar med";

}
