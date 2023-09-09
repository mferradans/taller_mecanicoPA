
package com.mycompany.tallermecanico.gui;

import com.mycompany.tallermecanico.logica.Cliente;
import com.mycompany.tallermecanico.logica.ControladoraLogica;
import com.mycompany.tallermecanico.logica.Marca;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaMarca extends javax.swing.JFrame {
    ControladoraLogica control = new ControladoraLogica();

    Marca marca = new Marca();
    public PantallaMarca() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarMarca = new javax.swing.JButton();
        btnRegresar3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMarcas = new javax.swing.JTable();
        btnEliminarMarca = new javax.swing.JButton();
        btnEditarC = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MARCAS");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        btnAgregarMarca.setText("Agregar");
        btnAgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMarcaActionPerformed(evt);
            }
        });

        btnRegresar3.setText("Regresar");
        btnRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(2, 39, 76));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        tablaMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMarcasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMarcas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEliminarMarca.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarMarca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarMarca.setText("Eliminar");
        btnEliminarMarca.setEnabled(false);
        btnEliminarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMarcaActionPerformed(evt);
            }
        });

        btnEditarC.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarC.setText("Editar");
        btnEditarC.setEnabled(false);
        btnEditarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCActionPerformed(evt);
            }
        });

        btnGuardarC.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarC.setText("Guardar cambios");
        btnGuardarC.setEnabled(false);
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminarMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(btnAgregarMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarC))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarMarca))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar3)
                    .addComponent(btnEditarC)
                    .addComponent(btnGuardarC))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMarcaActionPerformed
        String nombreMarca = txtNombreMarca.getText();
        control.agregarMarca(nombreMarca);
        mostrarMensaje("Vehiculo registrado", "info", "Guardado exitoso");
        cargarTabla();

    }//GEN-LAST:event_btnAgregarMarcaActionPerformed
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }  
    private void btnRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresar3ActionPerformed

    private void btnEliminarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMarcaActionPerformed
        //controlo q la tabla no este vacia
        if (tablaMarcas.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaMarcas.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_marca = Integer.parseInt(String.valueOf(tablaMarcas.getValueAt(tablaMarcas.getSelectedRow(), 0)));
                control.borrarMarca(num_marca);

                //avisamos
                mostrarMensaje("Cliente eliminado", "info", "Borrado de cliente");
                cargarTabla();
                limpiarDatos();
            }
            else{
                mostrarMensaje("No hay cliente seleccionado", "error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("No hay clientes en la tabla", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarMarcaActionPerformed

    private void btnEditarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCActionPerformed
        //controlo q la tabla no este vacia
        if (tablaMarcas.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaMarcas.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_marca = Integer.parseInt(String.valueOf(tablaMarcas.getValueAt(tablaMarcas.getSelectedRow(), 0)));
                this.marca = control.traerMarca(num_marca);
                txtNombreMarca.setText(marca.getNombre());
                btnGuardarC.setEnabled(true);
                btnAgregarMarca.setEnabled(false);
                btnEliminarMarca.setEnabled(false);
                //btnLimpiar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEditarCActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        String nombre = txtNombreMarca.getText();
        
        control.modificarMarca(marca, nombre);
        mostrarMensaje("Modificacion realizada correctamente", "info", "Edicion correcta");
        cargarTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void tablaMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMarcasMouseClicked
        int filaSeleccionada = tablaMarcas.getSelectedRow();      
        if (filaSeleccionada >= 0) {
            // Se ha seleccionado una fila, habilitar el botón
            btnEditarC.setEnabled(true);
            btnEliminarMarca.setEnabled(true);
        } else {
            // No se ha seleccionado ninguna fila, deshabilitar el botón
            btnEditarC.setEnabled(false);
            btnEliminarMarca.setEnabled(false);
        }
    }//GEN-LAST:event_tablaMarcasMouseClicked
    private void cargarTabla() {
        //definir modelo que queremos para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        
        //nombres de columnas
        String titulos[] = {"Id","Nombre"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de datos de BD
        List <Marca> listaMarca = control.traerMarcas();
        
        //recorrer lista y mostrar c/ elemento
        if (listaMarca!=null){
            for (Marca cli:listaMarca){
                Object[] objeto = {cli.getId_marca(), cli.getNombre()};
                modeloTabla.addRow(objeto);
            }
        }
        tablaMarcas.setModel(modeloTabla);

    }
    public void limpiarDatos(){
        txtNombreMarca.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMarca;
    private javax.swing.JButton btnEditarC;
    private javax.swing.JButton btnEliminarMarca;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMarcas;
    private javax.swing.JTextField txtNombreMarca;
    // End of variables declaration//GEN-END:variables
}

