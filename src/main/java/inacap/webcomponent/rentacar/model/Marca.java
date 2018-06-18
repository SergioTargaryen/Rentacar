/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.model;

import java.util.ArrayList;


public class Marca {
    
    private int idMarca;
    
    private String nombreMarca;
    
    private String detalle;
    
    public static ArrayList<Marca> marca = new ArrayList<>();

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Marca() {
    }

    public Marca(String nombreMarca, String detalle) {
        this.nombreMarca = nombreMarca;
        this.detalle = detalle;
    }

    private Marca(int idMarca, String nombreMarca, String detalle) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
        this.detalle = detalle;
    }
    
    
}
