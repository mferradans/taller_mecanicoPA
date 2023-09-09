
package com.mycompany.tallermecanico.gui;

import com.mycompany.tallermecanico.logica.Cliente;
import com.mycompany.tallermecanico.logica.ControladoraLogica;
import com.mycompany.tallermecanico.logica.Vehiculo;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PantallaCliente extends javax.swing.JFrame {
    ControladoraLogica control = new ControladoraLogica();
    Cliente cliente;
    public PantallaCliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoC = new javax.swing.JTextField();
        txtEmailC = new javax.swing.JTextField();
        txtDireccionC = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        btnEditarC = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnActualizarC = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIENTES");

        jPanel2.setBackground(new java.awt.Color(2, 39, 76));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel2KeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dirección:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL:");

        txtTelefonoC.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefonoC.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefonoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCActionPerformed(evt);
            }
        });
        txtTelefonoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoCKeyTyped(evt);
            }
        });

        txtEmailC.setBackground(new java.awt.Color(204, 204, 204));
        txtEmailC.setForeground(new java.awt.Color(51, 51, 51));
        txtEmailC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCActionPerformed(evt);
            }
        });
        txtEmailC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailCKeyTyped(evt);
            }
        });

        txtDireccionC.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionC.setForeground(new java.awt.Color(51, 51, 51));
        txtDireccionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionCActionPerformed(evt);
            }
        });
        txtDireccionC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionCKeyTyped(evt);
            }
        });

        txtNombreC.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreC.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCActionPerformed(evt);
            }
        });
        txtNombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(2, 39, 76));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btnAgregarC.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarC.setText("Agregar");
        btnAgregarC.setEnabled(false);
        btnAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCActionPerformed(evt);
            }
        });

        btnEliminarC.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarC.setText("Eliminar");
        btnEliminarC.setEnabled(false);
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
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

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarC)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarC)
                    .addComponent(btnEliminarC)
                    .addComponent(btnEditarC)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardarC))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(2, 39, 76));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        tablaClientes.setBackground(new java.awt.Color(204, 204, 204));
        tablaClientes.setForeground(new java.awt.Color(51, 51, 51));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tablaClientesMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnActualizarC.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizarC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActualizarC.setText("Actualizar");
        btnActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegresar)
                            .addGap(202, 202, 202)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarC)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        //controlo q la tabla no este vacia
        if (tablaClientes.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaClientes.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_cliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
                control.borrarCliente(num_cliente);
                
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

    }//GEN-LAST:event_btnEliminarCActionPerformed

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
    };
    public void limpiarDatos(){
        txtDireccionC.setText("");
        txtEmailC.setText("");
        txtNombreC.setText("");
        txtTelefonoC.setText("");
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
        btnGuardarC.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCActionPerformed
        String nombre = txtNombreC.getText();
        String email = txtEmailC.getText();
        String direccion = txtDireccionC.getText();
        String tel = txtTelefonoC.getText();
        LinkedList<Vehiculo> listaVehiculos = new LinkedList<Vehiculo>();
        control.agregarCliente(nombre,email,direccion,tel,listaVehiculos);
        
        mostrarMensaje("Cliente registrado", "info", "Guardado exitoso");
        cargarTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnAgregarCActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnActualizarCActionPerformed

    private void btnEditarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCActionPerformed
        //controlo q la tabla no este vacia
        if (tablaClientes.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaClientes.getSelectedColumn()!=-1){            
                //obtengo ID del cliente
                int num_cliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
                this.cliente = control.traerCliente(num_cliente);
                txtDireccionC.setText(cliente.getDireccion());
                txtEmailC.setText(cliente.getEmail());
                txtNombreC.setText(cliente.getNombre());
                txtTelefonoC.setText(cliente.getTelefono());
                btnGuardarC.setEnabled(true);
                btnAgregarC.setEnabled(false);
                btnEliminarC.setEnabled(false);
                btnLimpiar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEditarCActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        String nombre = txtNombreC.getText();
        String email = txtEmailC.getText();
        String direccion = txtDireccionC.getText();
        String tel = txtTelefonoC.getText();
        LinkedList<Vehiculo> listaVehiculos = new LinkedList<Vehiculo>();
        //paso como parametro el cliente viejo para asegurarme
        // de tener la posicion de memoria correcta
        control.modificarCliente(cliente, nombre,email,direccion,tel,listaVehiculos);
        mostrarMensaje("Modificacion realizada correctamente", "info", "Edicion correcta");
        cargarTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtTelefonoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoCKeyTyped
        soloNumeros(evt);
        verificarCamposTexto(1);
        if(txtTelefonoC.getText().trim().length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoCKeyTyped

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        int filaSeleccionada = tablaClientes.getSelectedRow();      
        if (filaSeleccionada >= 0) {
            // Se ha seleccionado una fila, habilitar el botón
            btnEditarC.setEnabled(true);
            btnEliminarC.setEnabled(true);
        } else {
            // No se ha seleccionado ninguna fila, deshabilitar el botón
            btnEditarC.setEnabled(false);
            btnEliminarC.setEnabled(false);
        }    }//GEN-LAST:event_tablaClientesMouseClicked


    
    
    private void jPanel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyReleased
        
    }//GEN-LAST:event_jPanel2KeyReleased

    private void txtNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCActionPerformed

    }//GEN-LAST:event_txtNombreCActionPerformed

    private void txtDireccionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionCActionPerformed

    }//GEN-LAST:event_txtDireccionCActionPerformed

    private void txtTelefonoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCActionPerformed

    }//GEN-LAST:event_txtTelefonoCActionPerformed

    private void txtEmailCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCActionPerformed

    }//GEN-LAST:event_txtEmailCActionPerformed

    private void txtNombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCKeyTyped
        verificarCamposTexto(1);
    }//GEN-LAST:event_txtNombreCKeyTyped

    private void txtDireccionCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionCKeyTyped
        verificarCamposTexto(1);
    }//GEN-LAST:event_txtDireccionCKeyTyped

    private void txtEmailCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailCKeyTyped
        verificarCamposTexto(1);
    }//GEN-LAST:event_txtEmailCKeyTyped

    private void tablaClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseExited
            }//GEN-LAST:event_tablaClientesMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarC;
    private javax.swing.JButton btnAgregarC;
    private javax.swing.JButton btnEditarC;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtDireccionC;
    private javax.swing.JTextField txtEmailC;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtTelefonoC;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //definir modelo que queremos para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        
        //nombres de columnas
        String titulos[] = {"Id","Nombre","Email","Dirección","Teléfono","Cantidad de vehiculos"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de datos de BD
        List <Cliente> listaClientes = control.traerClientes();
        
        //recorrer lista y mostrar c/ elemento
        if (listaClientes!=null){
            for (Cliente cli:listaClientes){
                Object[] objeto = {cli.getId_cliente(), cli.getNombre(),cli.getEmail(),
                cli.getDireccion(), cli.getTelefono(), cli.getListaVehiculo().size()};
                modeloTabla.addRow(objeto);
            }
        }
        tablaClientes.setModel(modeloTabla);

    }

    
    private void soloNumeros(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean nro = key>=48 && key <=57;
        if (!nro){
            evt.consume();
        }
    }

    private void verificarCamposTexto(int i) {
        if (i==1){
            boolean todosTienenTexto = !txtDireccionC.getText().isEmpty() && !txtEmailC.getText().isEmpty()
                    && !txtTelefonoC.getText().isEmpty() && !txtNombreC.getText().isEmpty();
            btnAgregarC.setEnabled(todosTienenTexto);        
        }else if(i==2){
            boolean todosTienenTexto = !txtDireccionC.getText().isEmpty() || !txtEmailC.getText().isEmpty()
                    || !txtTelefonoC.getText().isEmpty() || !txtNombreC.getText().isEmpty();
            btnAgregarC.setEnabled(todosTienenTexto);  
        }

    }
}
