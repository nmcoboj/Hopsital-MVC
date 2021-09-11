package hospital.vista;

import hospital.controlador.ControlHospital;
import hospital.modelo.Citas;
import hospital.modelo.Consultorios;
import hospital.modelo.Medicamentos;
import java.util.ArrayList;

public class IMostrarMedicamentos extends javax.swing.JFrame implements InterfazMostrar {

    public IMostrarMedicamentos() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMedicamentos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Medicamentos Disponibles");

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setActionCommand("Volver opciones med desde mostrar");

        txtMedicamentos.setColumns(20);
        txtMedicamentos.setRows(5);
        jScrollPane2.setViewportView(txtMedicamentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 137, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addComponent(btnVolver))
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
    private javax.swing.JTextArea txtMedicamentos;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar_medicamentos(ArrayList<Medicamentos> medicamentos) {
        txtMedicamentos.setText("");
        for (int i = 0; i < medicamentos.size(); i++) {
            int aux = i + 1;
            txtMedicamentos.append("Medicamento Nº." + aux + "\n"+
            "Nombre: " + medicamentos.get(i).getNombre() + "\n" +
            "Principio Activo: " + medicamentos.get(i).getPrincipio() + "\n" +
            "Tipo: " + medicamentos.get(i).getTipo()+ "\n" +
            "Gramaje: " + medicamentos.get(i).getGramaje() + "\n" +
            "Stock: " + medicamentos.get(i).getStock() + "\n" 
            + " " + "\n"        
            );
        }
    }

}
