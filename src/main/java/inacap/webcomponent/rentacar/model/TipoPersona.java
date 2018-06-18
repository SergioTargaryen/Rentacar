/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.model;

import java.util.ArrayList;


public class TipoPersona {
    
    private int idPersona;
    
    private String nombreTipoPersona;
    
    private String detalle;
    
    public static ArrayList<TipoPersona> tipopersona = new ArrayList<>();

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombreTipoPersona() {
        return nombreTipoPersona;
    }

    public void setNombreTipoPersona(String nombreTipoPersona) {
        this.nombreTipoPersona = nombreTipoPersona;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoPersona() {
    }

    public TipoPersona(String nombreTipoPersona, String detalle) {
        this.nombreTipoPersona = nombreTipoPersona;
        this.detalle = detalle;
    }

    private TipoPersona(int idPersona, String nombreTipoPersona, String detalle) {
        this.idPersona = idPersona;
        this.nombreTipoPersona = nombreTipoPersona;
        this.detalle = detalle;
    }
    
}
