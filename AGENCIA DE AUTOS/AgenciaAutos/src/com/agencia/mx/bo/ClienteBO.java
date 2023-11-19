/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agencia.mx.bo;

import com.agencia.mx.dao.ClienteDAO;
import com.agencia.mx.db.Conexion;
import com.agencia.mx.entity.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Brandon Prado
 */
public class ClienteBO {
    private String mensaje = "";
    private ClienteDAO cdao = new ClienteDAO();
    
    public String agregarCliente(Cliente cli){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.agregarCliente(conn, cli);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
            }
        }
        return mensaje;
    }
    
    public String modificarCliente(Cliente cli){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.modificarCliente(conn, cli);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
            }
        }
        return mensaje;
    }
    
    public String eliminarCliente(int id){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cdao.eliminarCliente(conn, id);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
            }
        }
        return mensaje;
    }
    
    public void listarCliente(JTable tabla){
            Connection conn = Conexion.getConnection();
            cdao.listarCliente(conn, tabla);
            try {
                conn.close();
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
    }
    
    public int getMaxID(){
        Connection conn = Conexion.getConnection();
            int id = cdao.getMaxID(conn);
            try {
                conn.close();
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
            return id;
    }
}
