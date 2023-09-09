
package com.mycompany.tallermecanico.gui;

import com.mycompany.tallermecanico.logica.Cliente;
import com.mycompany.tallermecanico.logica.ControladoraLogica;
import com.mycompany.tallermecanico.logica.Marca;
import com.mycompany.tallermecanico.logica.Modelo;
import com.mycompany.tallermecanico.logica.Vehiculo;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PantallaVehiculos extends javax.swing.JFrame {
    ControladoraLogica control=new ControladoraLogica();
    Vehiculo vehiculo;
    public PantallaVehiculos() {
        initComponents();
        cargarComboCliente(cmbClientes);
        cargarComboMarca(cmbMarca);
        cargarComboModelo();
    }
/*
    public String[]datos (String datos){
        String[]informacion=new String[4];
        if(datos.equalsIgnoreCase("Ford")){
            informacion[0]="-";
            informacion[1]="Falcon";
            informacion[2]="Ranger";
            informacion[3]="Mustang";
        }
        if(datos.equalsIgnoreCase("Toyota")){
            informacion[0]="-";
            informacion[1]="Etios";
            informacion[2]="Corolla";   
        }
        if(datos.equalsIgnoreCase("Seleccionar")){
            informacion[0]="-";  
        }
        return informacion;
    }
*/
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
        txtAño = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        cmbModelo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtKm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbEstadoV = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarV = new javax.swing.JButton();
        btnEliminarV = new javax.swing.JButton();
        btnEditarV = new javax.swing.JButton();
        btnLimpiarV = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        btnActualizarV = new javax.swing.JButton();
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
        jLabel3.setText("VEHICULOS");

        jPanel2.setBackground(new java.awt.Color(2, 39, 76));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marca:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Patente:");

        txtAño.setBackground(new java.awt.Color(204, 204, 204));
        txtAño.setForeground(new java.awt.Color(51, 51, 51));
        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });

        txtPatente.setBackground(new java.awt.Color(204, 204, 204));
        txtPatente.setForeground(new java.awt.Color(51, 51, 51));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Toyota", "Ford" }));
        cmbMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMarcaItemStateChanged(evt);
            }
        });
        cmbMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbMarcaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbMarcaMouseEntered(evt);
            }
        });
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kilometraje:");

        txtKm.setBackground(new java.awt.Color(204, 204, 204));
        txtKm.setForeground(new java.awt.Color(51, 51, 51));
        txtKm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKmKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cliente:");

        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");

        cmbEstadoV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En proceso", "Terminado" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPatente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEstadoV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cmbEstadoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)))
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(2, 39, 76));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btnAgregarV.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarV.setText("Agregar");
        btnAgregarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVActionPerformed(evt);
            }
        });

        btnEliminarV.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarV.setText("Eliminar");
        btnEliminarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVActionPerformed(evt);
            }
        });

        btnEditarV.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarV.setText("Editar");
        btnEditarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVActionPerformed(evt);
            }
        });

        btnLimpiarV.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiarV.setText("Limpiar");
        btnLimpiarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVActionPerformed(evt);
            }
        });

        btnGuardarC.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarC.setText("Guardar cambios");
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
                .addComponent(btnAgregarV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnEditarV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnGuardarC)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarV)
                        .addComponent(btnEliminarV)
                        .addComponent(btnEditarV)
                        .addComponent(btnLimpiarV)
                        .addComponent(btnGuardarC)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(2, 39, 76));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        tablaVehiculos.setBackground(new java.awt.Color(204, 204, 204));
        tablaVehiculos.setForeground(new java.awt.Color(51, 51, 51));
        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVehiculos.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaVehiculos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnActualizarV.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizarV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActualizarV.setText("Actualizar");
        btnActualizarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVActionPerformed(evt);
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
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarV)
                .addContainerGap(20, Short.MAX_VALUE))
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
    public void limpiarDatos(){
        txtAño.setText("");
        txtKm.setText("");
        txtPatente.setText("");
        cmbMarca.setSelectedIndex(0);
        cmbModelo.setSelectedIndex(0);
        cmbClientes.setSelectedIndex(0);
        cmbEstadoV.setSelectedIndex(0);

    }
    
    
    private void btnEliminarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVActionPerformed
        if (tablaVehiculos.getRowCount()>0){
            if (tablaVehiculos.getSelectedColumn()!=-1){
                int num_veh = Integer.parseInt(String.valueOf(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 0)));
                control.borrarVehiculo(num_veh);          
                
                mostrarMensaje("Vehiculo eliminado", "info", "Borrado de vehiculo");       
                cargarTabla();
                limpiarDatos();
            }
            else{
                mostrarMensaje("No hay vehiculo seleccionado", "error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("No hay vehiculo en la tabla", "error", "Error al eliminar");
        }       

    }//GEN-LAST:event_btnEliminarVActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        cargarComboModelo();
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void cmbMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMarcaItemStateChanged
        /*
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.cmbMarca.getSelectedIndex()>0){
                this.cmbModelo.setModel(new DefaultComboBoxModel(this.datos(this.cmbMarca.getSelectedItem().toString())));
            }
        }
    */
    }//GEN-LAST:event_cmbMarcaItemStateChanged

    private void btnLimpiarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarVActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClientesActionPerformed
    private void btnAgregarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVActionPerformed
        String anio=txtAño.getText();
        String km = txtKm.getText();
        String patente = txtPatente.getText();
        String estado = (String) cmbEstadoV.getSelectedItem();

        String marcaSeleccion = (String) cmbMarca.getSelectedItem();
        String modeloSeleccion = (String) cmbModelo.getSelectedItem();
        
        List<Modelo> listaModelo = control.traerModelos();
        List<Marca> listaMarca = control.traerMarcas();

        //Tengo el nombre del cliente
        // A través de la lista que me da la persistencia debo conseguir el ID
        // Si consigo el ID del cliente puede crear un vehiculo 
        List<Cliente> listaClientess=control.traerClientes();
        
        //Guardo en una variable el nombre del cliente seleccionado
        String clienteSeleccion = (String) cmbClientes.getSelectedItem();
        
        //Busco uno por uno los clientes
        for (Cliente cl1 : listaClientess){
            //Si el cliente seleccionado del combobox es igual a alguno del FOR
            if(clienteSeleccion.equals(cl1.getNombre())){
                int idc = cl1.getId_cliente();
                //Entonces ese cliente es quien necesitamos y lo traemos
                Cliente claseCliente = control.traerCliente(idc);
                //Para crear un Vehiculo donde uno de sus parámetros es un obj Cliente
                int idMarca = buscadorIDMarca(listaMarca, marcaSeleccion);
                Marca claseMarca = control.traerMarca(idMarca);
                
                int idModelo = buscadorIDModelo(listaModelo,modeloSeleccion);
                Modelo claseModelo = control.traerModelo(idModelo);
                System.out.println("Marca:"+claseMarca.getNombre());
                System.out.println("Modelo:"+claseModelo.getNombre());
                control.agregarVehiculo(anio,km,patente,claseMarca,claseModelo,estado,claseCliente);
                mostrarMensaje("Vehiculo registrado", "info", "Guardado exitoso");
                
                //El vehiculo que creamos, además, debe estar dentro de la LinkedList
                //de vehiculos que tiene como atributo el Cliente
                //por eso traigo toda la lista de vehiculos
                List<Vehiculo> listaVehiculosBD=control.traerVehiculos();
                //y los recorro para encontrar el vehiculo que acabo de añadir
                for (Vehiculo vh1:listaVehiculosBD){
                    Cliente cliDeVeh = vh1.getCliente();
                    if (cliDeVeh.getId_cliente() == idc){
                        //Si de los vehiculos recorridos, obtengo su cliente y este cliente
                        // tiene el mismo ID que el cliente***
                        //Obtenemos la lista de vehiculos del cliente, y añadimos el vehiculo que recorrimos
                        cliDeVeh.getListaVehiculo().add(control.traerVehiculo(vh1.getId_vehiculo()));
                        
                        control.modificarClienteListaVehiculos(cl1,vh1);
                    }
                }           
            }
        }
        cargarTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnAgregarVActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened
    
    private int buscadorIDMarca(List<Marca> listaMarca, String seleccionCombo){
        int id_marca = 0;
        for(Marca claseMarca : listaMarca){
            if(seleccionCombo.equals(claseMarca.getNombre())){
                id_marca = claseMarca.getId_marca();
            }       
        }
        return id_marca;
    }
    private int buscadorIDModelo(List<Modelo> listaModelo, String seleccionCombo){
        int id_modelo = 0;
        for(Modelo claseModelo : listaModelo){
            if(seleccionCombo.equals(claseModelo.getNombre())){
                id_modelo = claseModelo.getId_modelo();
            }       
        }
        return id_modelo;
    }
    
    
    private void btnActualizarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnActualizarVActionPerformed

    private void btnEditarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVActionPerformed
        if (tablaVehiculos.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaVehiculos.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_veh = Integer.parseInt(String.valueOf(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 0)));
                this.vehiculo = control.traerVehiculo(num_veh);
                txtAño.setText(vehiculo.getAnio());
                txtKm.setText(vehiculo.getKilometraje());
                txtPatente.setText(vehiculo.getPatente());

                //Seleccionar COMBOS
                for (int i = 0; i < cmbClientes.getWidth(); i++) {
                    Object elemento = cmbClientes.getItemAt(i);
                    if(vehiculo.getCliente().getNombre().equals((String) elemento)){
                        cmbClientes.setSelectedIndex(i);}}                

                for (int i = 0; i < cmbMarca.getWidth(); i++) {
                    Object elemento = cmbMarca.getItemAt(i);
                    if(vehiculo.getMarca().getNombre().equals((String) elemento)){
                        cmbMarca.setSelectedIndex(i);}}
                
                for (int i = 0; i < cmbModelo.getWidth(); i++) {
                    Object elemento = cmbModelo.getItemAt(i);
                    if(vehiculo.getModelo().getNombre().equals((String) elemento)){
                        cmbModelo.setSelectedIndex(i);}}
                
                for (int i = 0; i < cmbEstadoV.getWidth(); i++) {
                    Object elemento = cmbEstadoV.getItemAt(i);
                    if(vehiculo.getEstado().equals((String) elemento)){
                        cmbEstadoV.setSelectedIndex(i);}}                     
            }
            else{
                mostrarMensaje("No hay cliente seleccionado", "error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("No hay clientes en la tabla", "error", "Error al eliminar");
        }
            
    }//GEN-LAST:event_btnEditarVActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        String anio = txtAño.getText();
        String km = txtKm.getText();
        String patente = txtPatente.getText();
        String marcaSeleccion = (String) cmbMarca.getSelectedItem();
        String modeloSeleccion = (String) cmbModelo.getSelectedItem();
        String estado = (String) cmbEstadoV.getSelectedItem();
        
        List<Modelo> listaModelo = control.traerModelos();
        List<Marca> listaMarca = control.traerMarcas();  
        List<Cliente> listaClientess=control.traerClientes(); 
        
        String cl2 = (String) cmbClientes.getSelectedItem();
        for (Cliente cl1 : listaClientess){
            if(cl2.equals(cl1.getNombre())){
                
                int idc = cl1.getId_cliente();
                Cliente claseCliente = control.traerCliente(idc);
                
                int idMarca = buscadorIDMarca(listaMarca, marcaSeleccion);
                Marca claseMarca = control.traerMarca(idMarca);
                
                int idModelo = buscadorIDModelo(listaModelo,modeloSeleccion);
                Modelo claseModelo = control.traerModelo(idModelo);
                
                    control.modificarVehiculo(vehiculo,anio,km,patente,claseCliente,claseMarca, claseModelo, estado);
                    mostrarMensaje("Modificacion realizada correctamente", "info", "Edicion correcta");
                    cargarTabla();
                    limpiarDatos();
            }
        
        }
        
        
        //paso como parametro el cliente viejo para asegurarme
        // de tener la posicion de memoria correcta

    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed

        
    }//GEN-LAST:event_txtAñoActionPerformed

    private void soloNumeros(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean nro = key>=48 && key <=57;
        if (!nro){
            evt.consume();
        }
    }
    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        soloNumeros(evt);
        if(txtAño.getText().trim().length()==4){
            evt.consume();
        }
    }//GEN-LAST:event_txtAñoKeyTyped

    private void txtKmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtKmKeyTyped

    private void cmbMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMarcaMouseClicked
        cargarComboModelo();
    }//GEN-LAST:event_cmbMarcaMouseClicked

    private void cmbMarcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMarcaMouseEntered
        /*cargarComboModelo();*/    }//GEN-LAST:event_cmbMarcaMouseEntered



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarV;
    private javax.swing.JButton btnAgregarV;
    private javax.swing.JButton btnEditarV;
    private javax.swing.JButton btnEliminarV;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnLimpiarV;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JComboBox<String> cmbEstadoV;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaVehiculos;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables

   
    //ControladoraLogica control = new ControladoraLogica();    



    private void cargarComboCliente(JComboBox c){
        DefaultComboBoxModel comboClientes = new DefaultComboBoxModel();
        c.setModel(comboClientes);
        ControladoraLogica control = new ControladoraLogica();
        List<Cliente> listaClientCombo= control.traerClientes();
        
        for (Cliente cl : listaClientCombo){
            comboClientes.addElement(cl.getNombre());
        }
        
    }
    private void cargarComboMarca(JComboBox c){
        DefaultComboBoxModel comboMarcas = new DefaultComboBoxModel();
        c.setModel(comboMarcas);
        ControladoraLogica control = new ControladoraLogica();
        List<Marca> listaMarcaCombo=control.traerMarcas();        
        for (Marca cl : listaMarcaCombo){
            comboMarcas.addElement(cl.getNombre());
        }
        
    }

    
    private void cargarComboModelo(){
        DefaultComboBoxModel comboModelos = new DefaultComboBoxModel();   
        cmbModelo.setModel(comboModelos);
        
        comboModelos.removeAllElements();
        List<Modelo> listaModeloCombo = control.traerModelos();
        String marcaSeleccionada = (String)cmbMarca.getSelectedItem();
        //NECESITO QUE LOS MODELOS APAREZCAN SEGÚN LA MARCA QUE TIENEN ESTABLECIDA
        //Recorro las marcas
                //Ahora recorro la lista de modelos
        for (Modelo model : listaModeloCombo){
                    //Y encuentro los modelos que como atributo marca tengan esa clase Marca
            if(model.getMarca().getNombre().equals(marcaSeleccionada)){
                comboModelos.addElement(model.getNombre());
            }
            else{comboModelos.removeElement(model.getNombre());
            }        
        }
}

        
    


    private void cargarTabla() {
                //definir modelo que queremos para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        
        //nombres de columnas
        String titulos[] = {"Id","Marca","Modelo","Año","Patente","Km","Cliente","Estado"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de datos de BD
        List <Vehiculo> listaVehiculos = control.traerVehiculos();
        
        //recorrer lista y mostrar c/ elemento
        if (listaVehiculos!=null){
            for (Vehiculo veh:listaVehiculos){
                Object[] objeto = {veh.getId_vehiculo(), veh.getMarca().getNombre(),veh.getModelo().getNombre(),
                veh.getAnio(),veh.getPatente(),veh.getKilometraje(),veh.getCliente().getNombre(),veh.getEstado()};
                modeloTabla.addRow(objeto);
            }
        }
        tablaVehiculos.setModel(modeloTabla);
    }
    
}
