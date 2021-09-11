package hospital.vista;

import hospital.controlador.ControlHospital;

public class Inicio extends javax.swing.JFrame implements InterfazInicio{


    public Inicio() {
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnConsultorios = new javax.swing.JButton();
        btnMedicamentos = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Hospital Regional Del Valle ");

        btnConsultorios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/vista/imagenes/consultorios.png"))); // NOI18N
        btnConsultorios.setText("Consultorios");
        btnConsultorios.setToolTipText("");
        btnConsultorios.setActionCommand("Ventana mostrar consultorios");
        btnConsultorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultorios.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnConsultorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultoriosActionPerformed(evt);
            }
        });

        btnMedicamentos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/vista/imagenes/medicina.png"))); // NOI18N
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.setToolTipText("");
        btnMedicamentos.setActionCommand("Ventana opciones medicamentos");
        btnMedicamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedicamentos.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });

        btnCitas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/vista/imagenes/citas.png"))); // NOI18N
        btnCitas.setText("Citas");
        btnCitas.setToolTipText("");
        btnCitas.setActionCommand("Ventana opciones citas");
        btnCitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCitas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/vista/imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCitas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMedicamentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultorios)
                    .addComponent(btnCitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMedicamentos)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultoriosActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnConsultorios;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControlador(ControlHospital c) {
        this.btnConsultorios.addActionListener(c);
        this.btnCitas.addActionListener(c);
        this.btnMedicamentos.addActionListener(c);
        this.btnSalir.addActionListener(c);
    }

    @Override
    public void inicializar() {
        initComponents();
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);
        
    }

    @Override
    public void visualizar() {
        this.setVisible(true);
    }

    @Override
    public void esconder() {
        this.setVisible(false);
    }
}
