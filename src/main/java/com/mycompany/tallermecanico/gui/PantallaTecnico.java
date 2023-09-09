
package com.mycompany.tallermecanico.gui;

import com.mycompany.tallermecanico.logica.Cliente;
import com.mycompany.tallermecanico.logica.ControladoraLogica;
import com.mycompany.tallermecanico.logica.Tecnico;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PantallaTecnico extends javax.swing.JFrame {
ControladoraLogica control = new ControladoraLogica();
    public PantallaTecnico() {
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoTecnico = new javax.swing.JTextField();
        txtEmailTecnico = new javax.swing.JTextField();
        txtDireccionTecnico = new javax.swing.JTextField();
        txtNombreTecnico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLegajoTecnico = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarTecnico = new javax.swing.JButton();
        btnEliminarTecnico = new javax.swing.JButton();
        btnEditarTecnico = new javax.swing.JButton();
        btnLimpiarTecnico = new javax.swing.JButton();
        btnGuardarTecnico = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTecnicos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TÉCNICOS");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(2, 39, 76));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel2KeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL:");

        txtTelefonoTecnico.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefonoTecnico.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefonoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoTecnicoActionPerformed(evt);
            }
        });
        txtTelefonoTecnico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoTecnicoKeyTyped(evt);
            }
        });

        txtEmailTecnico.setBackground(new java.awt.Color(204, 204, 204));
        txtEmailTecnico.setForeground(new java.awt.Color(51, 51, 51));
        txtEmailTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailTecnicoActionPerformed(evt);
            }
        });
        txtEmailTecnico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailTecnicoKeyTyped(evt);
            }
        });

        txtDireccionTecnico.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionTecnico.setForeground(new java.awt.Color(51, 51, 51));
        txtDireccionTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionTecnicoActionPerformed(evt);
            }
        });
        txtDireccionTecnico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionTecnicoKeyTyped(evt);
            }
        });

        txtNombreTecnico.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreTecnico.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTecnicoActionPerformed(evt);
            }
        });
        txtNombreTecnico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTecnicoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Legajo:");

        txtLegajoTecnico.setBackground(new java.awt.Color(204, 204, 204));
        txtLegajoTecnico.setForeground(new java.awt.Color(51, 51, 51));
        txtLegajoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLegajoTecnicoActionPerformed(evt);
            }
        });
        txtLegajoTecnico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLegajoTecnicoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtLegajoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccionTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmailTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefonoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefonoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmailTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLegajoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(2, 39, 76));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        btnAgregarTecnico.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarTecnico.setText("Agregar");
        btnAgregarTecnico.setEnabled(false);
        btnAgregarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTecnicoActionPerformed(evt);
            }
        });

        btnEliminarTecnico.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarTecnico.setText("Eliminar");
        btnEliminarTecnico.setEnabled(false);
        btnEliminarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTecnicoActionPerformed(evt);
            }
        });

        btnEditarTecnico.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarTecnico.setText("Editar");
        btnEditarTecnico.setEnabled(false);
        btnEditarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTecnicoActionPerformed(evt);
            }
        });

        btnLimpiarTecnico.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiarTecnico.setText("Limpiar");
        btnLimpiarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTecnicoActionPerformed(evt);
            }
        });

        btnGuardarTecnico.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarTecnico.setText("Guardar cambios");
        btnGuardarTecnico.setEnabled(false);
        btnGuardarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTecnicoActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAgregarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarTecnico)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTecnico)
                    .addComponent(btnEliminarTecnico)
                    .addComponent(btnEditarTecnico)
                    .addComponent(btnLimpiarTecnico)
                    .addComponent(btnGuardarTecnico))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(2, 39, 76));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        tablaTecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaTecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTecnicosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaTecnicos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(368, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtTelefonoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoTecnicoActionPerformed

    }//GEN-LAST:event_txtTelefonoTecnicoActionPerformed

    private void txtTelefonoTecnicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoTecnicoKeyTyped
        verificarCamposTexto(1);
        if(txtTelefonoTecnico.getText().trim().length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoTecnicoKeyTyped

    private void txtEmailTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailTecnicoActionPerformed

    }//GEN-LAST:event_txtEmailTecnicoActionPerformed

    private void txtEmailTecnicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailTecnicoKeyTyped
        verificarCamposTexto(1);
    }//GEN-LAST:event_txtEmailTecnicoKeyTyped

    private void txtDireccionTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionTecnicoActionPerformed

    }//GEN-LAST:event_txtDireccionTecnicoActionPerformed

    private void txtDireccionTecnicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionTecnicoKeyTyped
        verificarCamposTexto(1);
    }//GEN-LAST:event_txtDireccionTecnicoKeyTyped

    private void txtNombreTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTecnicoActionPerformed

    }//GEN-LAST:event_txtNombreTecnicoActionPerformed

    private void txtNombreTecnicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTecnicoKeyTyped
        verificarCamposTexto(1);
    }//GEN-LAST:event_txtNombreTecnicoKeyTyped

    private void jPanel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyReleased

    }//GEN-LAST:event_jPanel2KeyReleased

    private void btnAgregarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTecnicoActionPerformed
        String nombre = txtNombreTecnico.getText();
        String email = txtEmailTecnico.getText();
        String direccion = txtDireccionTecnico.getText();
        String tel = txtTelefonoTecnico.getText();
        String legajo = txtLegajoTecnico.getText();
        control.agregarTecnico(nombre,email,direccion,tel,legajo);

        mostrarMensaje("Tecnico registrado", "info", "Guardado exitoso");
        cargarTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnAgregarTecnicoActionPerformed

    private void btnEliminarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTecnicoActionPerformed
        //controlo q la tabla no este vacia
        if (tablaTecnicos.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaTecnicos.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_tec = Integer.parseInt(String.valueOf(tablaTecnicos.getValueAt(tablaTecnicos.getSelectedRow(), 0)));
                control.borrarTecnico(num_tec);

                //avisamos
                mostrarMensaje("Tecnico eliminado", "info", "Borrado de cliente");
                cargarTabla();
                limpiarDatos();
            }
            else{
                mostrarMensaje("No hay Tecnico seleccionado", "error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("No hay Tecnicos en la tabla", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarTecnicoActionPerformed
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
        txtDireccionTecnico.setText("");
        txtEmailTecnico.setText("");
        txtLegajoTecnico.setText("");
        txtNombreTecnico.setText("");
        txtTelefonoTecnico.setText("");
    }
Tecnico tecnico = new Tecnico();
    private void btnEditarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTecnicoActionPerformed
        //controlo q la tabla no este vacia
        if (tablaTecnicos.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaTecnicos.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_tec = Integer.parseInt(String.valueOf(tablaTecnicos.getValueAt(tablaTecnicos.getSelectedRow(), 0)));
                this.tecnico = control.traerTecnico(num_tec);
                txtDireccionTecnico.setText(tecnico.getDireccion());
                txtEmailTecnico.setText(tecnico.getEmail());
                txtNombreTecnico.setText(tecnico.getNombre());
                txtTelefonoTecnico.setText(tecnico.getTelefono());
                txtLegajoTecnico.setText(tecnico.getLegajo());
                btnGuardarTecnico.setEnabled(true);
                btnAgregarTecnico.setEnabled(false);
                btnEliminarTecnico.setEnabled(false);
                btnLimpiarTecnico.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEditarTecnicoActionPerformed

    private void btnLimpiarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTecnicoActionPerformed
        limpiarDatos();
        btnGuardarTecnico.setEnabled(false);
        cargarTabla();
    }//GEN-LAST:event_btnLimpiarTecnicoActionPerformed

    private void btnGuardarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTecnicoActionPerformed
        String nombre = txtNombreTecnico.getText();
        String email = txtEmailTecnico.getText();
        String direccion = txtDireccionTecnico.getText();
        String tel = txtTelefonoTecnico.getText();
        String legajo = txtLegajoTecnico.getText();
        //paso como parametro el cliente viejo para asegurarme
        // de tener la posicion de memoria correcta
        control.modificarTecnico(tecnico, nombre,email,direccion,tel,legajo);
        mostrarMensaje("Modificacion realizada correctamente", "info", "Edicion correcta");
        cargarTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarTecnicoActionPerformed

    private void txtLegajoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLegajoTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLegajoTecnicoActionPerformed

    private void txtLegajoTecnicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLegajoTecnicoKeyTyped
        verificarCamposTexto(1);
    }//GEN-LAST:event_txtLegajoTecnicoKeyTyped

    private void tablaTecnicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTecnicosMouseClicked
        int filaSeleccionada = tablaTecnicos.getSelectedRow();      
        if (filaSeleccionada >= 0) {
            // Se ha seleccionado una fila, habilitar el botón
            btnEditarTecnico.setEnabled(true);
            btnEliminarTecnico.setEnabled(true);
        } else {
            // No se ha seleccionado ninguna fila, deshabilitar el botón
            btnEditarTecnico.setEnabled(false);
            btnEliminarTecnico.setEnabled(false);
        }
    }//GEN-LAST:event_tablaTecnicosMouseClicked
    private void verificarCamposTexto(int i) {
        if (i==1){
            boolean todosTienenTexto = !txtDireccionTecnico.getText().isEmpty() && !txtEmailTecnico.getText().isEmpty()
                    && !txtTelefonoTecnico.getText().isEmpty() && !txtNombreTecnico.getText().isEmpty() && !txtLegajoTecnico.getText().isEmpty();
            btnAgregarTecnico.setEnabled(todosTienenTexto);        
        }else if(i==2){
            boolean todosTienenTexto = !txtDireccionTecnico.getText().isEmpty() || !txtEmailTecnico.getText().isEmpty()
                    || !txtTelefonoTecnico.getText().isEmpty() || !txtNombreTecnico.getText().isEmpty() || !txtLegajoTecnico.getText().isEmpty();
            btnAgregarTecnico.setEnabled(todosTienenTexto);  
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTecnico;
    private javax.swing.JButton btnEditarTecnico;
    private javax.swing.JButton btnEliminarTecnico;
    private javax.swing.JButton btnGuardarTecnico;
    private javax.swing.JButton btnLimpiarTecnico;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaTecnicos;
    private javax.swing.JTextField txtDireccionTecnico;
    private javax.swing.JTextField txtEmailTecnico;
    private javax.swing.JTextField txtLegajoTecnico;
    private javax.swing.JTextField txtNombreTecnico;
    private javax.swing.JTextField txtTelefonoTecnico;
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
        String titulos[] = {"Id","Nombre","Email","Dirección","Teléfono","Legajo"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de datos de BD
        List <Tecnico> listaTecnico = control.traerTecnicos();
        
        //recorrer lista y mostrar c/ elemento
        if (listaTecnico!=null){
            for (Tecnico cli:listaTecnico){
                Object[] objeto = {cli.getId_tecnico(), cli.getNombre(),cli.getEmail(),
                cli.getDireccion(), cli.getTelefono(), cli.getLegajo()};
                modeloTabla.addRow(objeto);
            }
        }
        tablaTecnicos.setModel(modeloTabla);

    }


}
