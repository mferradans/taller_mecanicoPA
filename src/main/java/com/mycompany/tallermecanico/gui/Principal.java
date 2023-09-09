
package com.mycompany.tallermecanico.gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.io.InputStream;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPantallaClientes = new javax.swing.JButton();
        btnPantallaVehiculos = new javax.swing.JButton();
        btnPantallaMarca = new javax.swing.JButton();
        btnPantallaModelo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPantallaTecnico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        btnPantallaClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPantallaClientes.setText("Clientes");
        btnPantallaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantallaClientesActionPerformed(evt);
            }
        });

        btnPantallaVehiculos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPantallaVehiculos.setText("Vehiculos");
        btnPantallaVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantallaVehiculosActionPerformed(evt);
            }
        });

        btnPantallaMarca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPantallaMarca.setText("Marcas");
        btnPantallaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantallaMarcaActionPerformed(evt);
            }
        });

        btnPantallaModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPantallaModelo.setText("Modelos");
        btnPantallaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantallaModeloActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dissimilar Headlines", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Taller de vehiculos");

        btnPantallaTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPantallaTecnico.setText("Técnicos");
        btnPantallaTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantallaTecnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPantallaTecnico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPantallaClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPantallaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPantallaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPantallaVehiculos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPantallaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPantallaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPantallaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPantallaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPantallaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPantallaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantallaClientesActionPerformed
        PantallaCliente pantCli = new PantallaCliente();
        pantCli.setVisible(true);
        pantCli.setLocationRelativeTo(null);
        

    }//GEN-LAST:event_btnPantallaClientesActionPerformed

    private void btnPantallaVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantallaVehiculosActionPerformed
        PantallaVehiculos pantVeh = new PantallaVehiculos();
        pantVeh.setVisible(true);
        pantVeh.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPantallaVehiculosActionPerformed

    private void btnPantallaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantallaMarcaActionPerformed
        PantallaMarca pantMar=new PantallaMarca();
        pantMar.setVisible(true);
        pantMar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPantallaMarcaActionPerformed

    private void btnPantallaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantallaModeloActionPerformed
        PantallaModelo pantMar=new PantallaModelo();
        pantMar.setVisible(true);
        pantMar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPantallaModeloActionPerformed

    private void btnPantallaTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantallaTecnicoActionPerformed
        PantallaTecnico pantTec=new PantallaTecnico();
        pantTec.setVisible(true);
        pantTec.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPantallaTecnicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPantallaClientes;
    private javax.swing.JButton btnPantallaMarca;
    private javax.swing.JButton btnPantallaModelo;
    private javax.swing.JButton btnPantallaTecnico;
    private javax.swing.JButton btnPantallaVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
