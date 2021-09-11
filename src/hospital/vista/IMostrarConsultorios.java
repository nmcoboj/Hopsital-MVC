package hospital.vista;

import hospital.controlador.ControlHospital;
import hospital.modelo.Citas;
import hospital.modelo.Consultorios;
import hospital.modelo.Medicamentos;
import java.util.ArrayList;

public class IMostrarConsultorios extends javax.swing.JFrame implements InterfazMostrar {

    public IMostrarConsultorios() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsultorios = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consultorios Disponibles");

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setActionCommand("Volver inicio desde mostrar con");

        txtConsultorios.setColumns(20);
        txtConsultorios.setRows(5);
        jScrollPane1.setViewportView(txtConsultorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsultorios;
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
        txtConsultorios.setText("");
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
        for (int i = 0; i < consultorios.size(); i++) {
            if (consultorios.get(i).getNombre().equals("Alfa")) {
                Alfa = Alfa + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Beta")) {
                Beta = Beta + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Epsilon")) {
                Epsilon = Epsilon + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Gamma")) {
                Gamma = Gamma + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Kappa")) {
                Kappa = Kappa + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Lambda")) {
                Lambda = Lambda + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Omega")) {
                Omega = Omega + consultorios.get(i).getHora() + "  ";
            }
            if (consultorios.get(i).getNombre().equals("Pi")) {
                Pi = Pi + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Sigma")) {
                Sigma = Sigma + consultorios.get(i).getHora()+ "  ";
            }
            if (consultorios.get(i).getNombre().equals("Theta")) {
                Theta = Theta + consultorios.get(i).getHora()+ "  ";
            }
        }
        txtConsultorios.append(
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

    }

    @Override
    public void mostrar_citas(ArrayList<Citas> consultorios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar_medicamentos(ArrayList<Medicamentos> consultorios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
