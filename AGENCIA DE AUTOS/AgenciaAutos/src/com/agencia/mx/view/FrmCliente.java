/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agencia.mx.view;

import com.agencia.mx.bo.ClienteBO;
import com.agencia.mx.entity.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Prado
 */
public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    private ClienteBO cbo = new ClienteBO();
    
    public FrmCliente() {
        initComponents();
        listarCliente();
        idMax();
    }
    
    public void listarCliente(){
        cbo.listarCliente(tbCliente);
    }
    
    public void idMax(){
        txtIdCliente.setText(cbo.getMaxID() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupLicencia = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIne = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombreAval = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelefonoAval = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        rdNoTieneLic = new javax.swing.JRadioButton();
        rdTieneLic = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        txtPaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtPaterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 240, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("FORMULARIO CLIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 30));

        txtIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOMBRE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 30));

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        txtMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtMaterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("FOLIO INE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 30));

        txtIne.setBackground(new java.awt.Color(255, 255, 255));
        txtIne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtIne, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 240, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DOMICILIO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, 30));

        txtDomicilio.setBackground(new java.awt.Color(255, 255, 255));
        txtDomicilio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 240, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CORREO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, 30));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 240, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("RFC");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 30));

        txtRfc.setBackground(new java.awt.Color(255, 255, 255));
        txtRfc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 240, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("TELEFONO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, 30));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 240, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("NOMBRE AVAL");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, 30));

        txtNombreAval.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreAval.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtNombreAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 240, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("TELEFONO AVAL");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, 30));

        txtTelefonoAval.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoAval.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtTelefonoAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 240, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("LICENCIA/CONDUCIR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 30));

        tbCliente.setForeground(new java.awt.Color(0, 0, 0));
        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCliente.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 760, 180));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(204, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 120, 40));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 102, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 110, 40));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 153, 0));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 140, 40));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 102, 102));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 130, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 51, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 500, 100, 40));

        rdNoTieneLic.setBackground(new java.awt.Color(255, 255, 255));
        groupLicencia.add(rdNoTieneLic);
        rdNoTieneLic.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        rdNoTieneLic.setForeground(new java.awt.Color(153, 0, 0));
        rdNoTieneLic.setText("No tiene licencia");
        rdNoTieneLic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoTieneLicActionPerformed(evt);
            }
        });
        jPanel1.add(rdNoTieneLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        rdTieneLic.setBackground(new java.awt.Color(255, 255, 255));
        groupLicencia.add(rdTieneLic);
        rdTieneLic.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        rdTieneLic.setForeground(new java.awt.Color(0, 51, 102));
        rdTieneLic.setText("Tiene licencia");
        rdTieneLic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdTieneLicActionPerformed(evt);
            }
        });
        jPanel1.add(rdTieneLic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("             TALLER DE BASE DE DATOS \n                MARZO - JUNIO 2021\n                    L - J (12 -13 HRS)\nIMPARTIDA POR: ING LISET MANCINAS PÉREZ\n        EQUIPO CONFORMADO POR: A - Z\n      EIMY LU-RUHAMA CRUZ RODRÍGUEZ\n    BRAULIO HUMBERTO DÁVILA SAUCEDO\n        BRANDON ALEXIS PRADO CASTRO\n       MARIO ORLANDO TORRES SALAZAR\n                  OMAR SEGURA SENA");
        jTextArea1.setCaretColor(new java.awt.Color(255, 51, 51));
        jTextArea1.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jTextArea1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setSelectionColor(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 220, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (txtIdCliente.getText().isEmpty() || txtNombreCliente.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() || txtIne.getText().isEmpty() || txtDomicilio.getText().isEmpty() || txtRfc.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtNombreAval.getText().isEmpty() || txtTelefonoAval.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS, EL CORREO ES OPCIONAL.");
        }else{
            String mensaje = cbo.eliminarCliente(Integer.parseInt(txtIdCliente.getText()));
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCliente();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (txtIdCliente.getText().isEmpty() || txtNombreCliente.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() || txtIne.getText().isEmpty() || txtDomicilio.getText().isEmpty() || txtRfc.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtNombreAval.getText().isEmpty() || txtTelefonoAval.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS, EL CORREO ES OPCIONAL.");
        }else{
            char licencia;
            if (rdTieneLic.isSelected()) {
                licencia = 'S';
            }else{
                licencia = 'N';
            }
            Cliente cli = new Cliente();
            cli.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
            cli.setNombre_cliente(txtNombreCliente.getText());
            cli.setPaterno_cliente(txtPaterno.getText());
            cli.setMaterno_cliente(txtMaterno.getText());
            cli.setFolio_ine(txtIne.getText());
            cli.setDomicilio_cliente(txtDomicilio.getText());
            cli.setCorreo_cliente(txtCorreo.getText());
            cli.setRfc_cliente(txtRfc.getText());
            cli.setTelefono_cliente(txtTelefono.getText());
            cli.setNombre_aval(txtNombreAval.getText());
            cli.setTelefono_aval(txtTelefonoAval.getText());
            cli.setLicencia_conducir((char)licencia);
            String mensaje = cbo.agregarCliente(cli);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCliente();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (txtIdCliente.getText().isEmpty() || txtNombreCliente.getText().isEmpty() || txtPaterno.getText().isEmpty() || txtMaterno.getText().isEmpty() || txtIne.getText().isEmpty() || txtDomicilio.getText().isEmpty() || txtRfc.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtNombreAval.getText().isEmpty() || txtTelefonoAval.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS, EL CORREO ES OPCIONAL.");
        }else{
            char licencia;
            if (rdTieneLic.isSelected()) {
                licencia = 'S';
            }else{
                licencia = 'N';
            }
            Cliente cli = new Cliente();
            cli.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
            cli.setNombre_cliente(txtNombreCliente.getText());
            cli.setPaterno_cliente(txtPaterno.getText());
            cli.setMaterno_cliente(txtMaterno.getText());
            cli.setFolio_ine(txtIne.getText());
            cli.setDomicilio_cliente(txtDomicilio.getText());
            cli.setCorreo_cliente(txtCorreo.getText());
            cli.setRfc_cliente(txtRfc.getText());
            cli.setTelefono_cliente(txtTelefono.getText());
            cli.setNombre_aval(txtNombreAval.getText());
            cli.setTelefono_aval(txtTelefonoAval.getText());
            cli.setLicencia_conducir((char)licencia);
            String mensaje = cbo.modificarCliente(cli);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarCliente();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void limpiar(){
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtIne.setText("");
        txtDomicilio.setText("");
        txtCorreo.setText("");
        txtRfc.setText("");
        txtTelefono.setText("");
        txtNombreAval.setText("");
        txtTelefonoAval.setText("");
        groupLicencia.clearSelection();
        idMax();
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rdNoTieneLicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoTieneLicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoTieneLicActionPerformed

    private void rdTieneLicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdTieneLicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdTieneLicActionPerformed

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        // TODO add your handling code here:
        int seleccion = tbCliente.rowAtPoint(evt.getPoint());
        txtIdCliente.setText(tbCliente.getValueAt(seleccion, 0) + "");
        txtNombreCliente.setText(tbCliente.getValueAt(seleccion, 1) + "");
        txtPaterno.setText(tbCliente.getValueAt(seleccion, 2) + "");
        txtMaterno.setText(tbCliente.getValueAt(seleccion, 3) + "");
        txtIne.setText(tbCliente.getValueAt(seleccion, 4) + "");
        txtDomicilio.setText(tbCliente.getValueAt(seleccion, 5) + "");
        txtCorreo.setText(tbCliente.getValueAt(seleccion, 6) + "");
        txtRfc.setText(tbCliente.getValueAt(seleccion, 7) + "");
        txtTelefono.setText(tbCliente.getValueAt(seleccion, 8) + "");
        txtNombreAval.setText(tbCliente.getValueAt(seleccion, 9) + "");
        txtTelefonoAval.setText(tbCliente.getValueAt(seleccion, 10) + "");
        String licencia = tbCliente.getValueAt(seleccion, 11) + "";
        if(licencia.equals("S")){
            rdTieneLic.setSelected(true);
        }else{
            rdNoTieneLic.setSelected(true);
        }
    }//GEN-LAST:event_tbClienteMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup groupLicencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rdNoTieneLic;
    private javax.swing.JRadioButton rdTieneLic;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIne;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombreAval;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoAval;
    // End of variables declaration//GEN-END:variables
}
