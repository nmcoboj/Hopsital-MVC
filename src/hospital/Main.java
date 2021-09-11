package hospital;

import hospital.controlador.ControlHospital;
import hospital.modelo.Citas;
import hospital.modelo.Consultorios;
import hospital.modelo.Medicamentos;
import hospital.vista.IAgregarCita;
import hospital.vista.IAgregarMedicamento;
import hospital.vista.IEliminarCita;
import hospital.vista.IEliminarMedicamento;
import hospital.vista.IModificarCita;
import hospital.vista.IModificarCitaInicio;
import hospital.vista.IModificarMedicamento;
import hospital.vista.IModificarMedicamentoInicio;
import hospital.vista.IMostrarConsultorios;
import hospital.vista.Inicio;
import hospital.vista.InterfazInicio;
import hospital.vista.InterfazOpcion;
import hospital.vista.IOpcionCitas;
import hospital.vista.InterfazMostrar;
import hospital.vista.IMostrarCitas;
import hospital.vista.IMostrarMedicamentos;
import hospital.vista.IOpcionMedicamentos;
import hospital.vista.InterfazAgregar;
import hospital.vista.InterfazEliminar;
import hospital.vista.InterfazModificarInicio;
import hospital.vista.InterfazModificar;

public class Main {

    public static void main(String[] args) {

        InterfazInicio inicio = new Inicio();
        InterfazMostrar IMostrarConsultorios = new IMostrarConsultorios();
        InterfazOpcion IOpcionCitas = new IOpcionCitas();
        InterfazMostrar IMostrarCitas = new IMostrarCitas();
        InterfazAgregar IAgregarCita = new IAgregarCita();
        InterfazModificarInicio IModificarCitaInicio = new IModificarCitaInicio();
        InterfazModificar IModificarCita = new IModificarCita();
        InterfazEliminar IEliminarCita = new IEliminarCita();
        InterfazOpcion IOpcionMedicamentos = new IOpcionMedicamentos();
        InterfazMostrar IMostrarMedicamentos = new IMostrarMedicamentos();
        InterfazAgregar IAgregarMedicamento = new IAgregarMedicamento();
        InterfazModificarInicio IModificarMedicamentoInicio = new IModificarMedicamentoInicio();
        InterfazModificar IModificarMedicamento = new IModificarMedicamento();
        InterfazEliminar IEliminarMedicamento = new IEliminarMedicamento();
        Citas citas = new Citas();
        Consultorios consultorios = new Consultorios();
        Medicamentos medicamentos = new Medicamentos();

        ControlHospital control = new ControlHospital(inicio, IMostrarConsultorios,
                IOpcionCitas, IMostrarCitas, IAgregarCita, IModificarCitaInicio, IModificarCita,
                IOpcionMedicamentos, IMostrarMedicamentos, IAgregarMedicamento,
                IModificarMedicamentoInicio, IModificarMedicamento,
                IEliminarMedicamento, IEliminarCita, 
                citas, consultorios, medicamentos);

        control.inicializar_consultorios();
        inicio.inicializar();
        inicio.setControlador(control);

        IMostrarConsultorios.inicializar();
        IMostrarConsultorios.setControlador(control);

        IOpcionCitas.inicializar();
        IOpcionCitas.setControlador(control);
        IMostrarCitas.inicializar();
        IMostrarCitas.setControlador(control);
        IAgregarCita.inicializar();
        IAgregarCita.setControlador(control);
        IModificarCitaInicio.inicializar();
        IModificarCitaInicio.setControlador(control);
        IModificarCita.inicializar();
        IModificarCita.setControlador(control);
        IEliminarCita.inicializar();
        IEliminarCita.setControlador(control);

        IOpcionMedicamentos.inicializar();
        IOpcionMedicamentos.setControlador(control);
        IMostrarMedicamentos.inicializar();
        IMostrarMedicamentos.setControlador(control);
        IAgregarMedicamento.inicializar();
        IAgregarMedicamento.setControlador(control);
        IModificarMedicamentoInicio.inicializar();
        IModificarMedicamentoInicio.setControlador(control);
        IModificarMedicamento.inicializar();
        IModificarMedicamento.setControlador(control);
        IEliminarMedicamento.inicializar();
        IEliminarMedicamento.setControlador(control);
    }

}
