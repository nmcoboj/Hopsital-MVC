package hospital.vista;

import hospital.controlador.ControlHospital;
import hospital.modelo.Citas;
import hospital.modelo.Consultorios;
import hospital.modelo.Medicamentos;
import java.util.ArrayList;

public class IMostrarCitas extends javax.swing.JFrame implements InterfazMostrar {

    public IMostrarCitas() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCitas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Citas Agendadas");

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setActionCommand("Volver opciones cita desde mostrar");
        btnVolver.setAutoscrolls(true);

        txtCitas.setColumns(20);
        txtCitas.setRows(5);
        jScrollPane2.setViewportView(txtCitas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 169, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(101, 101, 101)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCitas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControlador(ControlHospital c) {
        this.btnVolver.addActionListener(c);
    }

    @Override
    public void inicializar() {
        initComponents();
        setLocationRelativeTo(null);// centra la ventana en la pantalla

    }

    @Override
    public void visualizar() {
        setVisible(true);
    }

    @Override
    public void esconder() {
        setVisible(false);
    }

    @Override
    public void mostrar_consultorios(ArrayList<Consultorios> consultorios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar_citas(ArrayList<Citas> citas) {
        txtCitas.setText("");
        for (int i = 0; i < citas.size(); i++) {
            int aux = i + 1;
            txtCitas.append("Cita Nº." + aux + "\n"
                    + "Nombre: " + citas.get(i).getNombre() + " "
                    + citas.get(i).getApellidoPaterno() + " "
                    + citas.get(i).getApellidoMaterno() + "\n"
                    + "Fecha. Nac: " + citas.get(i).getDia() + "-"
                    + citas.get(i).getMes() + "-"
                    + citas.get(i).getAnio() + "\n"
                    + "Descripción: " + citas.get(i).getDescripcion() + "\n"
                    + "Consultorio: " + citas.get(i).getConsultorio() + "-"
                    + "Hora: " + citas.get(i).getHora() + "\n"
                    + " " + "\n"
            );
        }
    }

    @Override
    public void mostrar_medicamentos(ArrayList<Medicamentos> consultorios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
