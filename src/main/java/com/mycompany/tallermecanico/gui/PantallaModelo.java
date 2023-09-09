
package com.mycompany.tallermecanico.gui;

import com.mycompany.tallermecanico.logica.ControladoraLogica;
import com.mycompany.tallermecanico.logica.Marca;
import com.mycompany.tallermecanico.logica.Modelo;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaModelo extends javax.swing.JFrame {
    ControladoraLogica control = new ControladoraLogica();
    /**
     * Creates new form PantallaModelo
     */
    public PantallaModelo() {
        initComponents();
        cargarComboMarca(cmbMarca);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        txtNombreModelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarMarca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEliminarModelo = new javax.swing.JButton();
        btnEditarModelo = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModelos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtNombreModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreModeloActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca");

        btnAgregarMarca.setText("Agregar");
        btnAgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMarcaActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MODELOS");

        btnEliminarModelo.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarModelo.setText("Eliminar");
        btnEliminarModelo.setEnabled(false);
        btnEliminarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarModeloActionPerformed(evt);
            }
        });

        btnEditarModelo.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarModelo.setText("Editar");
        btnEditarModelo.setEnabled(false);
        btnEditarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarModeloActionPerformed(evt);
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

        jPanel4.setBackground(new java.awt.Color(2, 39, 76));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        tablaModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaModelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaModelos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminarModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(btnAgregarMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarC))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarMarca)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarModelo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarModelo)
                            .addComponent(btnGuardarC))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(19, 19, 19))))
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

    private void txtNombreModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreModeloActionPerformed

    private void btnAgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMarcaActionPerformed
        String nombreModelo = txtNombreModelo.getText();
        String marcaSeleccion = (String) cmbMarca.getSelectedItem();
        
        List<Marca> listaMarca = control.traerMarcas();
        int idMarca = buscadorIDMarca(listaMarca, marcaSeleccion);
        Marca claseMarca = control.traerMarca(idMarca);
        System.out.println("Modelo: "+nombreModelo);
        System.out.println("Marca del modelo: "+ claseMarca.getNombre());
        control.agregarModelo(nombreModelo, claseMarca);
        mostrarMensaje("Vehiculo registrado", "info", "Guardado exitoso");
        cargarTabla();

    }//GEN-LAST:event_btnAgregarMarcaActionPerformed

    private void btnEliminarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarModeloActionPerformed
        //controlo q la tabla no este vacia
        if (tablaModelos.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaModelos.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_modelo = Integer.parseInt(String.valueOf(tablaModelos.getValueAt(tablaModelos.getSelectedRow(), 0)));
                control.borrarModelo(num_modelo);

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
    }//GEN-LAST:event_btnEliminarModeloActionPerformed
Modelo modelo = new Modelo();
    private void btnEditarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarModeloActionPerformed
        //controlo q la tabla no este vacia
        if (tablaModelos.getRowCount()>0){
            //controlo que se haya seleccionado un cliente
            if (tablaModelos.getSelectedColumn()!=-1){
                //obtengo ID del cliente
                int num_modelo = Integer.parseInt(String.valueOf(tablaModelos.getValueAt(tablaModelos.getSelectedRow(), 0)));
                this.modelo = control.traerModelo(num_modelo);
                txtNombreModelo.setText(modelo.getNombre());
                
                for (int i = 0; i < cmbMarca.getWidth(); i++) {
                    Object elemento = cmbMarca.getItemAt(i);
                    if(modelo.getMarca().getNombre().equals((String) elemento)){
                        cmbMarca.setSelectedIndex(i);}}                 
                
                btnGuardarC.setEnabled(true);
                btnAgregarMarca.setEnabled(false);
                btnEliminarModelo.setEnabled(false);
                
                //btnLimpiar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEditarModeloActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        String nombre = txtNombreModelo.getText();
        String marcaSeleccion = (String) cmbMarca.getSelectedItem();
        List<Marca> listaMarca = control.traerMarcas();  
        int idMarca = buscadorIDMarca(listaMarca, marcaSeleccion);
        Marca claseMarca = control.traerMarca(idMarca);
        control.modificarModelo(modelo, nombre, claseMarca);
        mostrarMensaje("Modificacion realizada correctamente", "info", "Edicion correcta");
        cargarTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void tablaModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaModelosMouseClicked
        int filaSeleccionada = tablaModelos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            // Se ha seleccionado una fila, habilitar el botón
            btnEditarModelo.setEnabled(true);
            btnEliminarModelo.setEnabled(true);
        } else {
            // No se ha seleccionado ninguna fila, deshabilitar el botón
            btnEditarModelo.setEnabled(false);
            btnEliminarModelo.setEnabled(false);
        }
    }//GEN-LAST:event_tablaModelosMouseClicked
    private int buscadorIDMarca(List<Marca> listaMarca, String seleccionCombo){
        int id_marca = 0;
        for(Marca claseMarca : listaMarca){
            if(seleccionCombo.equals(claseMarca.getNombre())){
                id_marca = claseMarca.getId_marca();
            }       
        }
        return id_marca;
    }
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
    private void cargarComboMarca(JComboBox c){
        DefaultComboBoxModel comboMarcas = new DefaultComboBoxModel();
        c.setModel(comboMarcas);
        List<Marca> listaMarcasCombo= control.traerMarcas();        
        for (Marca cl : listaMarcasCombo){
            comboMarcas.addElement(cl.getNombre());
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
        String titulos[] = {"Id","Nombre","Marca"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de datos de BD
        List <Modelo> listaModelo = control.traerModelos();
        
        //recorrer lista y mostrar c/ elemento
        if (listaModelo!=null){
            for (Modelo cli:listaModelo){
                Object[] objeto = {cli.getId_modelo(), cli.getNombre(), cli.getMarca().getNombre()};
                modeloTabla.addRow(objeto);
            }
        }
        tablaModelos.setModel(modeloTabla);

    }
    public void limpiarDatos(){
        txtNombreModelo.setText("");
        cmbMarca.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMarca;
    private javax.swing.JButton btnEditarModelo;
    private javax.swing.JButton btnEliminarModelo;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaModelos;
    private javax.swing.JTextField txtNombreModelo;
    // End of variables declaration//GEN-END:variables
}
