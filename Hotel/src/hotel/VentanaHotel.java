package hotel;

public class VentanaHotel extends javax.swing.JFrame {
    Hotele hotele = new Hotele();
    Reserva nuevaReserva = null;
    
    public VentanaHotel() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnMetodos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblFacturacionTotal = new javax.swing.JLabel();
        lblTarifa = new javax.swing.JLabel();
        lblReservasTipo = new javax.swing.JLabel();
        lblNegocio = new javax.swing.JLabel();
        lblVacaciones = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboxVigencia = new javax.swing.JCheckBox();
        txtCantHijos = new javax.swing.JTextField();
        txtNumHabitacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDiasReservados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboxConferencia = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        btnCargarReserva = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstReservas = new javax.swing.JList<>();
        cboTipoReserva = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Tipo de reserva");

        btnMetodos.setText("Mostrar metodos");
        btnMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetodosActionPerformed(evt);
            }
        });

        jLabel6.setText("Cant hijos");

        lblFacturacionTotal.setText("Facturacion total:");

        lblTarifa.setText("Tarifa:");

        lblReservasTipo.setText("Cantidad de reservas por tipo:");

        lblNegocio.setText("Negocio:");

        lblVacaciones.setText("Vacaciones:");

        jLabel7.setText("Conferencia");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Hotel");

        jLabel2.setText("Numero de habitacion");

        jLabel3.setText("Dias reservados");

        btnCargarReserva.setText("Cargar reserva");
        btnCargarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarReservaActionPerformed(evt);
            }
        });

        jLabel4.setText("Vigencia");

        jScrollPane1.setViewportView(lstReservas);

        cboTipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacaciones", "Negocios" }));
        cboTipoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboxConferencia)
                                        .addGap(0, 369, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnMetodos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCargarReserva))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxVigencia)
                                    .addComponent(cboTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCantHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(126, 126, 126)
                                        .addComponent(lblNegocio)
                                        .addGap(31, 31, 31)
                                        .addComponent(lblVacaciones)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(txtDiasReservados))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReservasTipo)
                                    .addComponent(lblFacturacionTotal)
                                    .addComponent(lblTarifa))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboxConferencia)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDiasReservados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxVigencia)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblTarifa)
                                .addGap(18, 18, 18)
                                .addComponent(lblFacturacionTotal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cboTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblReservasTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNegocio)
                            .addComponent(lblVacaciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarReserva)
                    .addComponent(btnMetodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //MOSTRAR METODOS
    private void btnMetodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetodosActionPerformed
        lblTarifa.setText("Tarifa: $" + hotele.tarifaReserva());
        lblFacturacionTotal.setText("Facturacion total: $" + hotele.tarifaTotal());
        lblNegocio.setText("Negocio: " + hotele.cantReservasTipo()[0]);
        lblVacaciones.setText("Vacaciones: " + hotele.cantReservasTipo()[1]);
    }//GEN-LAST:event_btnMetodosActionPerformed

    
    //BOTON CARGAR RESERVA
    private void btnCargarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarReservaActionPerformed

        if (cboTipoReserva.getSelectedItem() == "Vacaciones") {
            String nroHabitacion = txtNumHabitacion.getText();
            int diasReservados = Integer.parseInt(txtDiasReservados.getText());
            boolean vigencia = cboxVigencia.isSelected();
            int cantHijos = Integer.parseInt(txtCantHijos.getText());

            nuevaReserva = new Vacaciones(nroHabitacion, diasReservados, vigencia, cantHijos);
            hotele.agregarReserva(nuevaReserva);
        }
        else{
            String nroHabitacion = txtNumHabitacion.getText();
            int diasReservados = Integer.parseInt(txtDiasReservados.getText());
            boolean vigencia = cboxVigencia.isSelected();
            boolean conferencia = cboxConferencia.isSelected();

            nuevaReserva = new Negocio(nroHabitacion, diasReservados, vigencia, conferencia);
            hotele.agregarReserva(nuevaReserva);
        }
        lstReservas.setListData(hotele.getListaReservas().toArray());

    }//GEN-LAST:event_btnCargarReservaActionPerformed

    //COMBO BOX TIPO DE RESERVA
    private void cboTipoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoReservaActionPerformed

        if(cboTipoReserva.getSelectedItem() == "Negocios"){
            txtCantHijos.setVisible(false);
            cboxConferencia.setVisible(true);
        }
        if(cboTipoReserva.getSelectedItem() == "Vacaciones"){
            txtCantHijos.setVisible(true);
            cboxConferencia.setVisible(false);
        }

    }//GEN-LAST:event_cboTipoReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarReserva;
    private javax.swing.JButton btnMetodos;
    private javax.swing.JComboBox<Object> cboTipoReserva;
    private javax.swing.JCheckBox cboxConferencia;
    private javax.swing.JCheckBox cboxVigencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFacturacionTotal;
    private javax.swing.JLabel lblNegocio;
    private javax.swing.JLabel lblReservasTipo;
    private javax.swing.JLabel lblTarifa;
    private javax.swing.JLabel lblVacaciones;
    private javax.swing.JList<Object> lstReservas;
    private javax.swing.JTextField txtCantHijos;
    private javax.swing.JTextField txtDiasReservados;
    private javax.swing.JTextField txtNumHabitacion;
    // End of variables declaration//GEN-END:variables
}
