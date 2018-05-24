/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.credito.modelo;

/**
 *
 * @author ASUS
 */
public class Usuario {
    String  Documento;
    String Nombre;
    String Monto_aprestar;
    String Tipo_trabajadores;
    String Tipo_credtio;
    String Trabaja_compañia;

    public Usuario(String Documento, String Nombre, String Monto_aprestar, String Tipo_trabajadores, String Tipo_credtio, String Trabaja_compañia) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Monto_aprestar = Monto_aprestar;
        this.Tipo_trabajadores = Tipo_trabajadores;
        this.Tipo_credtio = Tipo_credtio;
        this.Trabaja_compañia = Trabaja_compañia;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setMonto_aprestar(String Monto_aprestar) {
        this.Monto_aprestar = Monto_aprestar;
    }

    public void setTipo_trabajadores(String Tipo_trabajadores) {
        this.Tipo_trabajadores = Tipo_trabajadores;
    }

    public void setTipo_credtio(String Tipo_credtio) {
        this.Tipo_credtio = Tipo_credtio;
    }

    public void setTrabaja_compañia(String Trabaja_compañia) {
        this.Trabaja_compañia = Trabaja_compañia;
    }

    public String getDocumento() {
        return Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getMonto_aprestar() {
        return Monto_aprestar;
    }

    public String getTipo_trabajadores() {
        return Tipo_trabajadores;
    }

    public String getTipo_credtio() {
        return Tipo_credtio;
    }

    public String getTrabaja_compañia() {
        return Trabaja_compañia;
    }
            
}


