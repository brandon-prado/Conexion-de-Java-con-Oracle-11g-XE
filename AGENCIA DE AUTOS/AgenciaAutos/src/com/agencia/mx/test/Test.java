/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agencia.mx.test;

import com.agencia.mx.bo.ClienteBO;
import com.agencia.mx.entity.Cliente;

/**
 *
 * @author Brandon Prado
 */
public class Test {
    ClienteBO cbo = new ClienteBO();
    Cliente cli = new Cliente();
    String mensaje = "";
    public void insertar() {
        cli.setNombre_cliente("Brandon");
        cli.setPaterno_cliente("Prado");
        cli.setMaterno_cliente("Castro");
        cli.setFolio_ine("BAPCINE");
        cli.setDomicilio_cliente("Parras, Coahuila");
        cli.setCorreo_cliente("alexisbapc@gmail.com");
        cli.setRfc_cliente("PACB01040");
        cli.setTelefono_cliente("4426208429");
        cli.setNombre_aval("Alexis Pardo");
        cli.setTelefono_aval("8441018545");
        cli.setLicencia_conducir('S');

//        cli.setNombre_cliente("Alexis");
//        cli.setPaterno_cliente("Castro");
//        cli.setMaterno_cliente("Prado");
//        cli.setFolio_ine("ABCPINE");
//        cli.setDomicilio_cliente("Parras, Coahuila");
//        cli.setCorreo_cliente("alexisbapc@hotmail.com");
//        cli.setRfc_cliente("CBAPRFC");
//        cli.setTelefono_cliente("4426208428");
//        cli.setNombre_aval("Alexis Pardo");
//        cli.setTelefono_aval("8441018547");
//        cli.setLicencia_conducir('S');
        mensaje = cbo.agregarCliente(cli);
        System.out.println(mensaje);
    }
    
    public void modificar() {
        cli.setId_cliente(1);
        cli.setNombre_cliente("Alex");
        cli.setPaterno_cliente("Prado");
        cli.setMaterno_cliente("Castro");
        cli.setFolio_ine("728BAPCINE");
        cli.setDomicilio_cliente("Parras, Coahuila");
        cli.setCorreo_cliente("alexisbapc@gmail.com");
        cli.setRfc_cliente("722PACB01040");
        cli.setTelefono_cliente("4426208429");
        cli.setNombre_aval("Alexis Pardo");
        cli.setTelefono_aval("8441018545");
        cli.setLicencia_conducir('N');
        mensaje = cbo.modificarCliente(cli);
        System.out.println(mensaje);
    }
    
    public void eliminar() {
        mensaje = cbo.eliminarCliente(3);
        mensaje = cbo.eliminarCliente(5);
        mensaje = cbo.eliminarCliente(8);
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        //test.insertar();;
        //test.modificar();
        //test.eliminar();
    }
}
