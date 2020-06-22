package inmobiliaria_gui;

import javax.swing.JOptionPane;


public class VentanaInmobiliaria extends javax.swing.JFrame {

    Inmobiliaria inmobiliaria = new Inmobiliaria();
    Propiedad nuevaPropiedad = null;

    public VentanaInmobiliaria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblCantHabitaciones = new javax.swing.JLabel();
        txtCantHabitaciones = new javax.swing.JTextField();
        lblPrecioBaseAlquiler = new javax.swing.JLabel();
        txtPrecioBaseAlquiler = new javax.swing.JTextField();
        cbUsoComercial = new javax.swing.JCheckBox();
        lblCantidadInquilinos = new javax.swing.JLabel();
        txtCantidadInquilinos = new javax.swing.JTextField();
        lblTipoPropiedad = new javax.swing.JLabel();
        cboTipoPropiedad = new javax.swing.JComboBox<>();
        cbGaraje = new javax.swing.JCheckBox();
        lblPrecioExpensas = new javax.swing.JLabel();
        txtPrecioExpensas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnMostrarMetodos = new javax.swing.JButton();
        lblEnunAlquiler = new javax.swing.JLabel();
        lblAlquilerPromedio2 = new javax.swing.JLabel();
        lblEnunCasas = new javax.swing.JLabel();
        lblCasas3habitaciones = new javax.swing.JLabel();
        btnCargarLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPropiedades = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDireccion.setText("Direccion");

        lblCantHabitaciones.setText("Cant Habitaciones");

        lblPrecioBaseAlquiler.setText("Precio Base Alquiler");

        cbUsoComercial.setText("Uso Comercial");

        lblCantidadInquilinos.setText("Cantidad Inquilinos");

        lblTipoPropiedad.setText("Tipo de Propiedad");

        cboTipoPropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Casa", "Deparatamento" }));
        cboTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoPropiedadActionPerformed(evt);
            }
        });

        cbGaraje.setText("Garaje");

        lblPrecioExpensas.setText("Precio Expensas");

        jButton1.setText("Cargar Propiedad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnMostrarMetodos.setText("Mostrar Metodos");
        btnMostrarMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMetodosActionPerformed(evt);
            }
        });

        lblEnunAlquiler.setText("Alquiler Prom 2 Inquilinos:");

        lblEnunCasas.setText("Casas 3 Hab c/ Garaje: ");

        btnCargarLista.setText("Cargar Lista");
        btnCargarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarListaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaPropiedades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCargarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarMetodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion)
                            .addComponent(lblTipoPropiedad)
                            .addComponent(cboTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbUsoComercial)
                                    .addComponent(cbGaraje))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPrecioExpensas)
                                    .addComponent(txtCantidadInquilinos)
                                    .addComponent(lblCantidadInquilinos)
                                    .addComponent(txtPrecioExpensas)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCantHabitaciones)
                                            .addComponent(txtCantHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPrecioBaseAlquiler)
                                            .addComponent(txtPrecioBaseAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEnunAlquiler)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAlquilerPromedio2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEnunCasas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCasas3habitaciones)))))
                        .addGap(0, 131, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnunAlquiler)
                    .addComponent(lblAlquilerPromedio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantHabitaciones)
                    .addComponent(lblPrecioBaseAlquiler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioBaseAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnunCasas)
                    .addComponent(lblCasas3habitaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipoPropiedad)
                .addGap(4, 4, 4)
                .addComponent(cboTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrecioExpensas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGaraje)
                    .addComponent(txtPrecioExpensas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblCantidadInquilinos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUsoComercial)
                    .addComponent(txtCantidadInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnMostrarMetodos)
                    .addComponent(btnCargarLista))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    //BOTON CARGAR PROPIEDAD
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cboTipoPropiedad.getSelectedItem() == "Casa") {
            String direccion = txtDireccion.getText();
            int cantidadHabitaciones = Integer.parseInt(txtCantHabitaciones.getText());
            int precioBaseAlquiler = Integer.parseInt(txtPrecioBaseAlquiler.getText());
            boolean usoComercial = cbUsoComercial.isSelected();
            int cantidadInquilinos = Integer.parseInt(txtCantidadInquilinos.getText());
            boolean poseeGaraje = cbGaraje.isSelected();
            
            nuevaPropiedad = new Casa(direccion, cantidadHabitaciones, precioBaseAlquiler, usoComercial, cantidadInquilinos, poseeGaraje);

        } else {
            String direccion = txtDireccion.getText();
            int cantidadHabitaciones = Integer.parseInt(txtCantHabitaciones.getText());
            int precioBaseAlquiler = Integer.parseInt(txtPrecioBaseAlquiler.getText());
            boolean usoComercial = cbUsoComercial.isSelected();
            int cantidadInquilinos = Integer.parseInt(txtCantidadInquilinos.getText());
            int precioExpensas = Integer.parseInt(txtPrecioExpensas.getText());
            
            nuevaPropiedad = new Departamento(direccion, cantidadHabitaciones, precioBaseAlquiler, usoComercial, cantidadInquilinos, precioExpensas);
            
        }
       inmobiliaria.agregarPropiedad(nuevaPropiedad);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    
    //BOTON MOSTRAR METODOS
    private void btnMostrarMetodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMetodosActionPerformed
        lblAlquilerPromedio2.setText("Alquiler Promedio: "+ inmobiliaria.alquilerPromedio());
        lblCasas3habitaciones.setText("Casas 3 Habitaciones:" + inmobiliaria.casas3Habitaciones());
    }//GEN-LAST:event_btnMostrarMetodosActionPerformed

    
    //COMBO BOX TIPO PROPIEDAD
    private void cboTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoPropiedadActionPerformed
        if(cboTipoPropiedad.getSelectedItem() == ""){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un tipo de propiedad");
        }
        
        if(cboTipoPropiedad.getSelectedItem() == "Casa"){
            txtPrecioExpensas.setVisible(false);
            cbGaraje.setVisible(true);
        }
        if(cboTipoPropiedad.getSelectedItem() == "Departamento"){
            txtPrecioExpensas.setVisible(true);
            cbGaraje.setVisible(false);
        }
    }//GEN-LAST:event_cboTipoPropiedadActionPerformed

    private void btnCargarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarListaActionPerformed
         listaPropiedades.setListData(inmobiliaria.getListaPropiedad().toArray());
    }//GEN-LAST:event_btnCargarListaActionPerformed

    

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInmobiliaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarLista;
    private javax.swing.JButton btnMostrarMetodos;
    private javax.swing.JCheckBox cbGaraje;
    private javax.swing.JCheckBox cbUsoComercial;
    private javax.swing.JComboBox<String> cboTipoPropiedad;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlquilerPromedio2;
    private javax.swing.JLabel lblCantHabitaciones;
    private javax.swing.JLabel lblCantidadInquilinos;
    private javax.swing.JLabel lblCasas3habitaciones;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEnunAlquiler;
    private javax.swing.JLabel lblEnunCasas;
    private javax.swing.JLabel lblPrecioBaseAlquiler;
    private javax.swing.JLabel lblPrecioExpensas;
    private javax.swing.JLabel lblTipoPropiedad;
    private javax.swing.JList<Object> listaPropiedades;
    private javax.swing.JTextField txtCantHabitaciones;
    private javax.swing.JTextField txtCantidadInquilinos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtPrecioBaseAlquiler;
    private javax.swing.JTextField txtPrecioExpensas;
    // End of variables declaration//GEN-END:variables
}
