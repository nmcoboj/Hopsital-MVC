package hospital.controlador;

import hospital.modelo.Citas;
import hospital.modelo.Medicamentos;
import hospital.modelo.Consultorios;
import hospital.vista.InterfazAgregar;
import hospital.vista.InterfazEliminar;
import hospital.vista.InterfazInicio;
import hospital.vista.InterfazModificar;
import hospital.vista.InterfazModificarInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import hospital.vista.InterfazMostrar;
import hospital.vista.InterfazOpcion;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControlHospital implements ActionListener {

    private InterfazInicio inicio;
    private InterfazMostrar IMostrarConsultorios;
    private InterfazOpcion IOpcionCitas;
    private InterfazMostrar IMostrarCitas;
    private InterfazAgregar IAgregarCita;
    private InterfazModificarInicio IModificarCitaInicio;
    private InterfazModificar IModificarCita;
    private InterfazEliminar IEliminarCita;
    private InterfazOpcion IOpcionMedicamentos;
    private InterfazMostrar IMostrarMedicamentos;
    private InterfazAgregar IAgregarMedicamento;
    private InterfazModificarInicio IModificarMedicamentoInicio;
    private InterfazModificar IModificarMedicamento;
    private InterfazEliminar IEliminarMedicamento;
    private Citas citas;
    private Consultorios consultorios;
    private Medicamentos medicamentos;

    public ControlHospital(InterfazInicio inicio, InterfazMostrar IMostrarConsultorios,
            InterfazOpcion IOpcionCitas, InterfazMostrar IMostrarCitas,
            InterfazAgregar IAgregarCita, InterfazModificarInicio IModificarCitaInicio,
            InterfazModificar IModificarCita, InterfazOpcion IOpcionMedicamentos,
            InterfazMostrar IMostrarMedicamentos, InterfazAgregar IAgregarMedicamento,
            InterfazModificarInicio IModificarMedicamentoInicio,
            InterfazModificar IModificarMedicamento,
            InterfazEliminar IEliminarMedicamento,
            InterfazEliminar IEliminarCita, Citas citas,
            Consultorios consultorios, Medicamentos medicamentos) {

        this.inicio = inicio;
        this.IMostrarConsultorios = IMostrarConsultorios;
        this.IOpcionCitas = IOpcionCitas;
        this.IMostrarCitas = IMostrarCitas;
        this.IAgregarCita = IAgregarCita;
        this.IModificarCitaInicio = IModificarCitaInicio;
        this.IModificarCita = IModificarCita;
        this.IEliminarCita = IEliminarCita;
        this.IOpcionMedicamentos = IOpcionMedicamentos;
        this.IMostrarMedicamentos = IMostrarMedicamentos;
        this.IAgregarMedicamento = IAgregarMedicamento;
        this.IModificarMedicamentoInicio = IModificarMedicamentoInicio;
        this.IModificarMedicamento = IModificarMedicamento;
        this.IEliminarMedicamento = IEliminarMedicamento;
        this.citas = citas;
        this.consultorios = consultorios;
        this.medicamentos = medicamentos;
    }

    private ArrayList<Consultorios> aConsultorios = new ArrayList<>();
    private ArrayList<Citas> aCitas = new ArrayList<>();
    private ArrayList<Medicamentos> aMedicamentos = new ArrayList<>();

    Integer click_med = 0;
    Boolean t_med = false;
    String nombre_med;
    Integer indice_med = -1;
    static private FileWriter archivoM;
    static private PrintWriter salidaM;

    Integer click_cita = 0;
    Boolean t_cita = false;
    String nombre_cita;
    Integer indice_cita = -1;
    static private FileWriter archivoCi;
    static private PrintWriter salidaCi;

    Boolean t_consultorio = false;
    static private FileWriter archivoC;
    static private PrintWriter salidaC;

    public void archivo_medicamentos() {
        try {
            archivoM = new FileWriter("C:\\Hospital\\medicamentos.txt");
        } catch (IOException ex) {
            Logger.getLogger(ControlHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        salidaM = new PrintWriter(archivoM);
        for (int i = 0; i < aMedicamentos.size(); i++) {
            int aux = i + 1;
            salidaM.println("Medicamento Nº." + aux + "\n"
                    + "Nombre: " + aMedicamentos.get(i).getNombre() + "\n"
                    + "Principio Activo: " + aMedicamentos.get(i).getPrincipio() + "\n"
                    + "Tipo: " + aMedicamentos.get(i).getTipo() + "\n"
                    + "Gramaje: " + aMedicamentos.get(i).getGramaje() + "\n"
                    + "Stock: " + aMedicamentos.get(i).getStock() + "\n"
                    + " " + "\n"
            );
        }
        salidaM.flush();
    }

    public void archivo_citas() {
        try {
            archivoCi = new FileWriter("C:\\Hospital\\citas.txt");
        } catch (IOException ex) {
            Logger.getLogger(ControlHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        salidaCi = new PrintWriter(archivoCi);
        for (int i = 0; i < aCitas.size(); i++) {
            int aux = i + 1;
            salidaCi.println("Cita Nº." + aux + "\n"
                    + "Nombre: " + aCitas.get(i).getNombre() + " "
                    + aCitas.get(i).getApellidoPaterno() + " "
                    + aCitas.get(i).getApellidoMaterno() + "\n"
                    + "Fecha. Nac: " + aCitas.get(i).getDia() + "-"
                    + aCitas.get(i).getMes() + "-"
                    + aCitas.get(i).getAnio() + "\n"
                    + "Descripción: " + aCitas.get(i).getDescripcion() + "\n"
                    + "Consultorio: " + aCitas.get(i).getConsultorio() + "-"
                    + "Hora: " + aCitas.get(i).getHora() + "\n"
                    + " " + "\n"
            );
        }
        salidaCi.flush();
    }

    public void archivo_consultorios() {
        try {
            archivoC = new FileWriter("C:\\Hospital\\consultorios.txt");
        } catch (IOException ex) {
            Logger.getLogger(ControlHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        salidaC = new PrintWriter(archivoC);
        String Alfa, Beta, Epsilon, Gamma, Kappa, Lambda, Omega, Pi, Sigma, Theta;
        Alfa = "";
        Beta = "";
        Epsilon = "";
        Gamma = "";
        Kappa = "";
        Lambda = "";
        Omega = "";
        Pi = "";
        Sigma = "";
        Theta = "";
        for (int i = 0; i < aConsultorios.size(); i++) {
            if (aConsultorios.get(i).getNombre().equals("Alfa")) {
                Alfa = Alfa + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Beta")) {
                Beta = Beta + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Epsilon")) {
                Epsilon = Epsilon + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Gamma")) {
                Gamma = Gamma + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Kappa")) {
                Kappa = Kappa + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Lambda")) {
                Lambda = Lambda + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Omega")) {
                Omega = Omega + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Pi")) {
                Pi = Pi + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Sigma")) {
                Sigma = Sigma + aConsultorios.get(i).getHora() + "  ";
            }
            if (aConsultorios.get(i).getNombre().equals("Theta")) {
                Theta = Theta + aConsultorios.get(i).getHora() + "  ";
            }
        }
        salidaC.println(
                "Alfa: " + Alfa + "\n"
                + "Beta: " + Beta + "\n"
                + "Epsilon: " + Epsilon + "\n"
                + "Gamma: " + Gamma + "\n"
                + "Kappa: " + Kappa + "\n"
                + "Lambda: " + Lambda + "\n"
                + "Omega: " + Omega + "\n"
                + "Pi: " + Pi + "\n"
                + "Sigma: " + Sigma + "\n"
                + "Theta: " + Theta + "\n"
        );
        salidaC.flush();
    }

    public void inicializar_consultorios() {
        aConsultorios.add(new Consultorios("Alfa", "09:00"));
        aConsultorios.add(new Consultorios("Alfa", "10:00"));
        aConsultorios.add(new Consultorios("Alfa", "11:00"));
        aConsultorios.add(new Consultorios("Alfa", "12:00"));
        aConsultorios.add(new Consultorios("Alfa", "13:00"));
        aConsultorios.add(new Consultorios("Alfa", "14:00"));
        aConsultorios.add(new Consultorios("Alfa", "15:00"));
        aConsultorios.add(new Consultorios("Alfa", "16:00"));
        aConsultorios.add(new Consultorios("Beta", "09:00"));
        aConsultorios.add(new Consultorios("Beta", "10:00"));
        aConsultorios.add(new Consultorios("Beta", "11:00"));
        aConsultorios.add(new Consultorios("Beta", "12:00"));
        aConsultorios.add(new Consultorios("Beta", "13:00"));
        aConsultorios.add(new Consultorios("Beta", "14:00"));
        aConsultorios.add(new Consultorios("Beta", "15:00"));
        aConsultorios.add(new Consultorios("Beta", "16:00"));
        aConsultorios.add(new Consultorios("Epsilon", "09:00"));
        aConsultorios.add(new Consultorios("Epsilon", "10:00"));
        aConsultorios.add(new Consultorios("Epsilon", "11:00"));
        aConsultorios.add(new Consultorios("Epsilon", "12:00"));
        aConsultorios.add(new Consultorios("Epsilon", "13:00"));
        aConsultorios.add(new Consultorios("Epsilon", "14:00"));
        aConsultorios.add(new Consultorios("Epsilon", "15:00"));
        aConsultorios.add(new Consultorios("Epsilon", "16:00"));
        aConsultorios.add(new Consultorios("Gamma", "09:00"));
        aConsultorios.add(new Consultorios("Gamma", "10:00"));
        aConsultorios.add(new Consultorios("Gamma", "11:00"));
        aConsultorios.add(new Consultorios("Gamma", "12:00"));
        aConsultorios.add(new Consultorios("Gamma", "13:00"));
        aConsultorios.add(new Consultorios("Gamma", "14:00"));
        aConsultorios.add(new Consultorios("Gamma", "15:00"));
        aConsultorios.add(new Consultorios("Gamma", "16:00"));
        aConsultorios.add(new Consultorios("Kappa", "09:00"));
        aConsultorios.add(new Consultorios("Kappa", "10:00"));
        aConsultorios.add(new Consultorios("Kappa", "11:00"));
        aConsultorios.add(new Consultorios("Kappa", "12:00"));
        aConsultorios.add(new Consultorios("Kappa", "13:00"));
        aConsultorios.add(new Consultorios("Kappa", "14:00"));
        aConsultorios.add(new Consultorios("Kappa", "15:00"));
        aConsultorios.add(new Consultorios("Kappa", "16:00"));
        aConsultorios.add(new Consultorios("Lambda", "09:00"));
        aConsultorios.add(new Consultorios("Lambda", "10:00"));
        aConsultorios.add(new Consultorios("Lambda", "11:00"));
        aConsultorios.add(new Consultorios("Lambda", "12:00"));
        aConsultorios.add(new Consultorios("Lambda", "13:00"));
        aConsultorios.add(new Consultorios("Lambda", "14:00"));
        aConsultorios.add(new Consultorios("Lambda", "15:00"));
        aConsultorios.add(new Consultorios("Lambda", "16:00"));
        aConsultorios.add(new Consultorios("Omega", "09:00"));
        aConsultorios.add(new Consultorios("Omega", "10:00"));
        aConsultorios.add(new Consultorios("Omega", "11:00"));
        aConsultorios.add(new Consultorios("Omega", "12:00"));
        aConsultorios.add(new Consultorios("Omega", "13:00"));
        aConsultorios.add(new Consultorios("Omega", "14:00"));
        aConsultorios.add(new Consultorios("Omega", "15:00"));
        aConsultorios.add(new Consultorios("Omega", "16:00"));
        aConsultorios.add(new Consultorios("Pi", "09:00"));
        aConsultorios.add(new Consultorios("Pi", "10:00"));
        aConsultorios.add(new Consultorios("Pi", "11:00"));
        aConsultorios.add(new Consultorios("Pi", "12:00"));
        aConsultorios.add(new Consultorios("Pi", "13:00"));
        aConsultorios.add(new Consultorios("Pi", "14:00"));
        aConsultorios.add(new Consultorios("Pi", "15:00"));
        aConsultorios.add(new Consultorios("Pi", "16:00"));
        aConsultorios.add(new Consultorios("Sigma", "09:00"));
        aConsultorios.add(new Consultorios("Sigma", "10:00"));
        aConsultorios.add(new Consultorios("Sigma", "11:00"));
        aConsultorios.add(new Consultorios("Sigma", "12:00"));
        aConsultorios.add(new Consultorios("Sigma", "13:00"));
        aConsultorios.add(new Consultorios("Sigma", "14:00"));
        aConsultorios.add(new Consultorios("Sigma", "15:00"));
        aConsultorios.add(new Consultorios("Sigma", "16:00"));
        aConsultorios.add(new Consultorios("Theta", "09:00"));
        aConsultorios.add(new Consultorios("Theta", "10:00"));
        aConsultorios.add(new Consultorios("Theta", "11:00"));
        aConsultorios.add(new Consultorios("Theta", "12:00"));
        aConsultorios.add(new Consultorios("Theta", "13:00"));
        aConsultorios.add(new Consultorios("Theta", "14:00"));
        aConsultorios.add(new Consultorios("Theta", "15:00"));
        aConsultorios.add(new Consultorios("Theta", "16:00"));

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        //CONSULTORIOS
        //Mostrar consultorios
        if (evento.getActionCommand().equals(InterfazInicio.MOSTRAR_CONSULTORIOS)) {
            inicio.esconder();
            IMostrarConsultorios.mostrar_consultorios(aConsultorios);
            IMostrarConsultorios.visualizar();
            archivo_consultorios();
        }
        //Volver inicio desde consultorios
        if (evento.getActionCommand().equals(InterfazMostrar.VOLVER_INICIO_CON)) {
            inicio.visualizar();
            IMostrarConsultorios.esconder();
        }

        //CITAS
        //Mostrar opciones de las citas    
        if (evento.getActionCommand().equals(InterfazInicio.VENTANA_OPCIONES_CITAS)) {
            inicio.esconder();
            IOpcionCitas.visualizar();
        }
        //Opción mostrar citas
        if (evento.getActionCommand().equals(InterfazOpcion.VENTANA_MOSTRAR_CITAS)) {
            IMostrarCitas.mostrar_citas(aCitas);
            IMostrarCitas.visualizar();
            IOpcionCitas.esconder();
            archivo_consultorios();
            archivo_citas();
        }
        //Volver a opciones de citas desde opcion mostrar
        if (evento.getActionCommand().equals(InterfazMostrar.VOLVER_OPCIONES_CITA)) {
            IMostrarCitas.esconder();
            IOpcionCitas.visualizar();
        }
        //Opción agregar cita
        if (evento.getActionCommand().equals(InterfazOpcion.VENTANA_AGREGAR_CITA)) {
            IAgregarCita.visualizar();
            IOpcionCitas.esconder();
        }

        if (evento.getActionCommand().equals(InterfazAgregar.AGREGAR_CITA)) {
            boolean c = false;
            int indice_c = 0;

            t_cita = false;
            citas = IAgregarCita.agregar_cita();
            String consultorio = citas.getConsultorio();
            String hora = citas.getHora();
            for (int i = 0; i < aConsultorios.size(); i++) {
                String nombreConsultorio = aConsultorios.get(i).getNombre();
                String horaConsultorio = aConsultorios.get(i).getHora();
                if (nombreConsultorio.equals(consultorio) && horaConsultorio.equals(hora)) {
                    c = true;
                    indice_c = i;
                }
            }
            if (c == false) {
                JOptionPane.showMessageDialog(null, "El consultorio no esta disponible a esa hora");
            } else {
                String nombre = citas.getNombre() + citas.getApellidoPaterno() + citas.getApellidoMaterno();
                if (click_cita == 0) {
                    JOptionPane.showMessageDialog(null, "Cita agregada");
                    aCitas.add(citas);
                    aConsultorios.remove(indice_c);
                } else {
                    for (int i = 0; i < aCitas.size(); i++) {
                        String nombreCita = aCitas.get(i).getNombre()
                                + aCitas.get(i).getApellidoPaterno()
                                + aCitas.get(i).getApellidoMaterno();
                        if (nombreCita.equals(nombre)) {
                            t_cita = true;
                        }
                    }
                    if (t_cita == true) {
                        JOptionPane.showMessageDialog(null, "La cita ya existe");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cita agregada");
                        aCitas.add(citas);
                        aConsultorios.remove(indice_c);
                    }
                }
                click_cita++;
            }
            archivo_consultorios();
            archivo_citas();
        }

        //Volver a opciones de citas desde opcion agregar
        if (evento.getActionCommand().equals(InterfazAgregar.VOLVER_OPCIONES_CITA)) {
            IAgregarCita.esconder();
            IOpcionCitas.visualizar();
        }
        //Opción modificar cita
        if (evento.getActionCommand().equals(InterfazOpcion.VENTANA_MODIFICAR_CITA)) {
            IModificarCitaInicio.visualizar();
            IOpcionCitas.esconder();
        }
        // Ir a ventana modificar cita
        if (evento.getActionCommand().equals(InterfazModificarInicio.MODIFICAR_CITA)) {
            t_consultorio = false;
            indice_cita = -1;
            nombre_cita = IModificarCitaInicio.modificar();
            for (int i = 0; i < aCitas.size(); ++i) {
                if ((aCitas.get(i).getNombre() + aCitas.get(i).getApellidoPaterno()
                        + aCitas.get(i).getApellidoMaterno()).equals(nombre_cita)) {
                    indice_cita = i;
                }
            }
            if (indice_cita == -1) {
                JOptionPane.showMessageDialog(null, "La cita no existe");
            } else {
                IModificarCitaInicio.esconder();
                IModificarCita.escribir(aCitas.get(indice_cita));
                IModificarCita.visualizar();

            }

            for (int i = 0; i < aConsultorios.size(); i++) {
                String nombreConsultorio = aConsultorios.get(i).getNombre();
                String horaConsultorio = aConsultorios.get(i).getHora();
                if (nombreConsultorio.equals(aCitas.get(indice_cita).getConsultorio())
                        && horaConsultorio.equals(aCitas.get(indice_cita).getHora())) {
                    t_consultorio = true;
                }
            }
            if (t_consultorio == false) {
                aConsultorios.add(new Consultorios(aCitas.get(indice_cita).getConsultorio(),
                        aCitas.get(indice_cita).getHora()));
            }
            archivo_consultorios();
            archivo_citas();
        }

        //Modificar cita
        if (evento.getActionCommand().equals(InterfazModificar.MODIFICAR_CITA)) {
            t_cita = false;
            int indice_c = 0;
            citas = IModificarCita.modificar_citas();
            String consultorio = citas.getConsultorio();
            String hora = citas.getHora();
            for (int i = 0; i < aConsultorios.size(); i++) {
                String nombreConsultorio = aConsultorios.get(i).getNombre();
                String horaConsultorio = aConsultorios.get(i).getHora();
                if (nombreConsultorio.equals(consultorio) && horaConsultorio.equals(hora)) {
                    t_cita = true;
                    indice_c = i;
                }
            }
            if (t_cita == false) {
                JOptionPane.showMessageDialog(null, "El consultorio no esta disponible a esa hora");
            } else {
                if (t_cita == true) {
                    aCitas.set(indice_cita, citas);
                    aConsultorios.remove(indice_c);
                    JOptionPane.showMessageDialog(null, "Cita Modificada");
                }
            }
            archivo_consultorios();
            archivo_citas();
        }
        //Volver al modificar inicio de las citas 
        if (evento.getActionCommand().equals(InterfazModificar.VOLVER_MODIFICAR_INICIO_CITA)) {
            IModificarCitaInicio.visualizar();
            IModificarCita.esconder();
        }
        //Volver a las opciones de citas desde la opcion modificar inicio
        if (evento.getActionCommand().equals(InterfazModificarInicio.VOLVER_INICIO_CITA)) {
            IModificarCitaInicio.esconder();
            IOpcionCitas.visualizar();
        }
        //Opción eliminar cita
        if (evento.getActionCommand().equals(InterfazOpcion.VENTANA_ELIMINAR_CITA)) {
            IEliminarCita.visualizar();
            IOpcionCitas.esconder();
        }
        //Eliminar cita
        if (evento.getActionCommand().equals(InterfazEliminar.ELIMINAR_CITA)) {
            indice_cita = -1;
            nombre_cita = IEliminarCita.eliminar();
            for (int i = 0; i < aCitas.size(); ++i) {
                if ((aCitas.get(i).getNombre() + aCitas.get(i).getApellidoPaterno()
                        + aCitas.get(i).getApellidoMaterno()).equals(nombre_cita)) {
                    indice_cita = i;
                }
            }
            if (indice_cita == -1) {
                JOptionPane.showMessageDialog(null, "La cita no existe");
            } else {
                aConsultorios.add(new Consultorios(aCitas.get(indice_cita).getConsultorio(),
                        aCitas.get(indice_cita).getHora()));
                aCitas.remove((int) indice_cita);
                JOptionPane.showMessageDialog(null, "Cita Eliminada");
            }
            archivo_consultorios();
            archivo_citas();
        }
        //Volver a las opciones de citas desde la opcion eliminar
        if (evento.getActionCommand().equals(InterfazEliminar.VOLVER_OPCIONES_CITA)) {
            IEliminarCita.esconder();
            IOpcionCitas.visualizar();
        }
        //Volver inicio desde opciones citas
        if (evento.getActionCommand().equals(InterfazOpcion.VOLVER_A_INICIO_CITAS)) {
            inicio.visualizar();
            IOpcionCitas.esconder();
        }

        //MEDICAMENTOS
        //Mostrar opciones de los medicamentos    
        if (evento.getActionCommand().equals(InterfazInicio.VENTANA_OPCIONES_MEDICAMENTOS)) {
            inicio.esconder();
            IOpcionMedicamentos.visualizar();
        }
        //Opción mostrar medicamentos
        if (evento.getActionCommand().equals(InterfazOpcion.VENTANA_MOSTRAR_MED)) {
            IMostrarMedicamentos.mostrar_medicamentos(aMedicamentos);
            IMostrarMedicamentos.visualizar();
            IOpcionMedicamentos.esconder();
            archivo_medicamentos();

        }
        //Volver a opciones de medicamentos desde opcion mostrar
        if (evento.getActionCommand().equals(InterfazMostrar.VOLVER_OPCIONES_MED)) {
            IMostrarMedicamentos.esconder();
            IOpcionMedicamentos.visualizar();
        }
        //Opción agregar medicamento
        if (evento.getActionCommand().equals(InterfazOpcion.VENTANA_AGREGAR_MED)) {
            IAgregarMedicamento.visualizar();
            IOpcionMedicamentos.esconder();
        }
        //Agregar medicamento
        if (evento.getActionCommand().equals(InterfazAgregar.AGREGAR_MED)) {
            t_med = false;
            medicamentos = IAgregarMedicamento.agregar_med();
            String nombre = medicamentos.getNombre();
            if (click_med == 0) {
                JOptionPane.showMessageDialog(null, "Medicamento agregado");
                aMedicamentos.add(medicamentos);
            } else {
                for (int i = 0; i < aMedicamentos.size(); i++) {
                    if (aMedicamentos.get(i).getNombre().equals(nombre)) {
                        t_med = true;
                    }
                }
                if (t_med == true) {
                    JOptionPane.showMessageDialog(null, "El Medicamento ya existe");
                } else {
                    JOptionPane.showMessageDialog(null, "Medicamento agregado");
                    aMedicamentos.add(medicamentos);
                }
            }
            click_med++;
            archivo_medicamentos();
        }

        //Volver a opciones de medicamentos desde opcion agregar
        if (evento.getActionCommand().equals(InterfazAgregar.VOLVER_OPCIONES_MED)) {
            IAgregarMedicamento.esconder();
            IOpcionMedicamentos.visualizar();
        }
        //Opción modificar medicamento
        if (evento.getActionCommand().equals(InterfazOpcion.VENTANA_MODIFICAR_MED)) {
            IModificarMedicamentoInicio.visualizar();
            IOpcionMedicamentos.esconder();
        }
        // Ir a ventana modificar medicamento
        if (evento.getActionCommand().equals(InterfazModificarInicio.MODIFICAR_MED)) {
            indice_med = -1;
            nombre_med = IModificarMedicamentoInicio.modificar();
            for (int i = 0; i < aMedicamentos.size(); ++i) {
                if (aMedicamentos.get(i).getNombre().equals(nombre_med)) {
                    indice_med = i;
                }
            }
            if (indice_med == -1) {
                JOptionPane.showMessageDialog(null, "El Medicamento no existe");
            } else {
                IModificarMedicamentoInicio.esconder();
                IModificarMedicamento.escribir(aMedicamentos.get(indice_med));
                IModificarMedicamento.visualizar();
            }

        }
        //Modificar medicamento

        if (evento.getActionCommand().equals(InterfazModificar.MODIFICAR_MED)) {
            medicamentos = IModificarMedicamento.modificar_med();
            JOptionPane.showMessageDialog(null, "Medicamento modificado");
            aMedicamentos.set(indice_med, medicamentos);
            archivo_medicamentos();

        }
        //Volver al modificar inicio de los medicamentos 

        if (evento.getActionCommand()
                .equals(InterfazModificar.VOLVER_MODIFICAR_INICIO_MED)) {
            IModificarMedicamentoInicio.visualizar();
            IModificarMedicamento.esconder();
        }
        //Volver a las opciones de medicamentos desde la opcion modificar inicio

        if (evento.getActionCommand()
                .equals(InterfazModificarInicio.VOLVER_INICIO_MED)) {
            IModificarMedicamentoInicio.esconder();
            IOpcionMedicamentos.visualizar();
        }
        //Opción eliminar medicamentos

        if (evento.getActionCommand()
                .equals(InterfazOpcion.VENTANA_ELIMINAR_MED)) {
            IEliminarMedicamento.visualizar();
            IOpcionMedicamentos.esconder();
        }
        //Eliminar medicamento

        if (evento.getActionCommand().equals(InterfazEliminar.ELIMINAR_MED)) {
            indice_med = -1;
            nombre_med = IEliminarMedicamento.eliminar();
            for (int i = 0; i < aMedicamentos.size(); ++i) {
                if (aMedicamentos.get(i).getNombre().equals(nombre_med)) {
                    indice_med = i;
                }
            }
            if (indice_med == -1) {
                JOptionPane.showMessageDialog(null, "El Medicamento no existe");
            } else {
                aMedicamentos.remove((int) indice_med);
                JOptionPane.showMessageDialog(null, "Medicamento Eliminado");
            }
            archivo_medicamentos();

        }
        //Volver a las opciones de citas desde la opcion eliminar

        if (evento.getActionCommand()
                .equals(InterfazEliminar.VOLVER_OPCIONES_MED)) {
            IEliminarMedicamento.esconder();
            IOpcionMedicamentos.visualizar();
        }
        //Volver inicio desde opciones medicamentos

        if (evento.getActionCommand()
                .equals(InterfazOpcion.VOLVER_A_INICIO_MED)) {
            inicio.visualizar();
            IOpcionMedicamentos.esconder();
        }

        //SALIR
        if (evento.getActionCommand()
                .equals(InterfazInicio.SALIR)) {
            System.exit(0);
        }
    }
}
