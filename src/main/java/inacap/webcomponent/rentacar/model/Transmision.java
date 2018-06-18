/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.model;


import java.util.ArrayList;


public class Transmision {
    
    private int idTransmision;
    
    private String nombreTransmision;
    
    private String detalle;
    
    
    
    public static ArrayList<Transmision> transmision = new ArrayList<>();
    
    

    public int getIdTransmision() {
        return idTransmision;
    }

    public void setIdTransmision(int idTransmision) {
        this.idTransmision = idTransmision;
    }

    public String getNombreTransmision() {
        return nombreTransmision;
    }

    public void setNombreTransmision(String nombreTransmision) {
        this.nombreTransmision = nombreTransmision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Transmision() {
    }

    public Transmision(String nombreTransmision, String detalle) {
        this.nombreTransmision = nombreTransmision;
        this.detalle = detalle;
    }

    private Transmision(int idTransmision, String nombreTransmision, String detalle) {
        this.idTransmision = idTransmision;
        this.nombreTransmision = nombreTransmision;
        this.detalle = detalle;
    }
    
    
}
