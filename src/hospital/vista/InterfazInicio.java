package hospital.vista;

import hospital.controlador.ControlHospital;

public interface InterfazInicio {
    void setControlador(ControlHospital c);
    void inicializar();
    void visualizar();
    void esconder();
    
    static final String MOSTRAR_CONSULTORIOS="Ventana mostrar consultorios";
    static final String VENTANA_OPCIONES_CITAS="Ventana opciones citas";
    static final String VENTANA_OPCIONES_MEDICAMENTOS="Ventana opciones medicamentos";
    static final String SALIR="Salir";
}
