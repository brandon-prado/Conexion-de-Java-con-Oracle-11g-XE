
package com.agencia.mx.entity;

/**
 *
 * @author Brandon Prado
 */
public class Cliente {
    private int id_cliente;
    private String nombre_cliente;
    private String paterno_cliente;
    private String materno_cliente;
    private String folio_ine;
    private String domicilio_cliente;
    private String correo_cliente;
    private String rfc_cliente;
    private String telefono_cliente;
    private String nombre_aval;
    private String telefono_aval;
    private char licencia_conducir;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre_cliente, String paterno_cliente, String materno_cliente, String folio_ine, String domicilio_cliente, String correo_cliente, String rfc_cliente, String telefono_cliente, String nombre_aval, String telefono_aval, char licencia_conducir) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.paterno_cliente = paterno_cliente;
        this.materno_cliente = materno_cliente;
        this.folio_ine = folio_ine;
        this.domicilio_cliente = domicilio_cliente;
        this.correo_cliente = correo_cliente;
        this.rfc_cliente = rfc_cliente;
        this.telefono_cliente = telefono_cliente;
        this.nombre_aval = nombre_aval;
        this.telefono_aval = telefono_aval;
        this.licencia_conducir = licencia_conducir;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getPaterno_cliente() {
        return paterno_cliente;
    }

    public String getMaterno_cliente() {
        return materno_cliente;
    }

    public String getFolio_ine() {
        return folio_ine;
    }

    public String getDomicilio_cliente() {
        return domicilio_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public String getRfc_cliente() {
        return rfc_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public String getNombre_aval() {
        return nombre_aval;
    }

    public String getTelefono_aval() {
        return telefono_aval;
    }

    public char getLicencia_conducir() {
        return licencia_conducir;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setPaterno_cliente(String paterno_cliente) {
        this.paterno_cliente = paterno_cliente;
    }

    public void setMaterno_cliente(String materno_cliente) {
        this.materno_cliente = materno_cliente;
    }

    public void setFolio_ine(String folio_ine) {
        this.folio_ine = folio_ine;
    }

    public void setDomicilio_cliente(String domicilio_cliente) {
        this.domicilio_cliente = domicilio_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public void setRfc_cliente(String rfc_cliente) {
        this.rfc_cliente = rfc_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public void setNombre_aval(String nombre_aval) {
        this.nombre_aval = nombre_aval;
    }

    public void setTelefono_aval(String telefono_aval) {
        this.telefono_aval = telefono_aval;
    }

    public void setLicencia_conducir(char licencia_conducir) {
        this.licencia_conducir = licencia_conducir;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", paterno_cliente=" + paterno_cliente + ", materno_cliente=" + materno_cliente + ", folio_ine=" + folio_ine + ", domicilio_cliente=" + domicilio_cliente + ", correo_cliente=" + correo_cliente + ", rfc_cliente=" + rfc_cliente + ", telefono_cliente=" + telefono_cliente + ", nombre_aval=" + nombre_aval + ", telefono_aval=" + telefono_aval + ", licencia_conducir=" + licencia_conducir + '}';
    }
}
