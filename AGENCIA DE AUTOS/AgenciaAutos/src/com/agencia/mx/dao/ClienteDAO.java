/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agencia.mx.dao;

import com.agencia.mx.entity.Cliente;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brandon Prado
 */
public class ClienteDAO {
    private String mensaje = "";
    
    public String agregarCliente(Connection conn , Cliente cli){
        PreparedStatement pst = null;
        String sql = "INSERT INTO cliente(id_cliente, nombre_cliente, paterno_cliente, materno_cliente, folio_ine, domicilio_cliente, correo_cliente, rfc_cliente, telefono_cliente, nombre_aval, telefono_aval, licencia_conducir) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cli.getId_cliente());
            pst.setString(2, cli.getNombre_cliente());
            pst.setString(3, cli.getPaterno_cliente());
            pst.setString(4, cli.getMaterno_cliente());
            pst.setString(5, cli.getFolio_ine());
            pst.setString(6, cli.getDomicilio_cliente());
            pst.setString(7, cli.getCorreo_cliente());
            pst.setString(8, cli.getRfc_cliente());
            pst.setString(9, cli.getTelefono_cliente());
            pst.setString(10, cli.getNombre_aval());
            pst.setString(11, cli.getTelefono_aval());
            pst.setString(12, cli.getLicencia_conducir()+"");
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarCliente(Connection conn , Cliente cli){
        PreparedStatement pst = null;
        String sql = "UPDATE cliente SET nombre_cliente = ?, paterno_cliente = ?, materno_cliente = ?, folio_ine = ?, domicilio_cliente = ?, correo_cliente = ?, rfc_cliente = ?, telefono_cliente = ?, nombre_aval = ?, telefono_aval = ?, licencia_conducir = ? "
                + " WHERE id_cliente = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, cli.getNombre_cliente());
            pst.setString(2, cli.getPaterno_cliente());
            pst.setString(3, cli.getMaterno_cliente());
            pst.setString(4, cli.getFolio_ine());
            pst.setString(5, cli.getDomicilio_cliente());
            pst.setString(6, cli.getCorreo_cliente());
            pst.setString(7, cli.getRfc_cliente());
            pst.setString(8, cli.getTelefono_cliente());
            pst.setString(9, cli.getNombre_aval());
            pst.setString(10, cli.getTelefono_aval());
            pst.setString(11, cli.getLicencia_conducir()+"");
            pst.setInt(12, cli.getId_cliente());
            mensaje = "MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO MODIFICAR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarCliente(Connection conn , int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ELIMINAR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public void listarCliente(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID_CLIENTE", "NOMBRE_CLIENTE", "PATERNO CLIENTE", "MATERNO_CLIENTE", "FOLIO_INE", "DOMICILIO_CLIENTE", "CORREO_CLIENTE", "RFC_CLIENTE", "TELEFONO_CLIENTE", "NOMBRE_AVAL", "TELEFONO_AVAL", "LICENCIA_CONDUCIR"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM cliente ORDER BY id_cliente";
        
        String [] filas = new String[12];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 12; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }
    
    public int getMaxID(Connection con){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT MAX(id_cliente) + 1 FROM cliente";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error al mostrar id: " + e.getMessage());
        }
        return id;
    }
}
