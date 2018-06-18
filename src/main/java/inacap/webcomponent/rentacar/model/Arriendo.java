/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 19725847-0
 */
public class Arriendo {
    
    private int idArriendo;
    
    private Date fechaArriendo;
    
    private Time horaArriendo;
    
    private Persona vendedor;
    
    private Vehiculo vehiculo;
    
    private MedioPago mediopago;
    
    public static ArrayList<Arriendo> arriendo = new ArrayList<>();

    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
    }

    public Date getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(Date fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public Time getHoraArriendo() {
        return horaArriendo;
    }

    public void setHoraArriendo(Time horaArriendo) {
        this.horaArriendo = horaArriendo;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public void setVendedor(Persona vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public MedioPago getMediopago() {
        return mediopago;
    }

    public void setMediopago(MedioPago mediopago) {
        this.mediopago = mediopago;
    }

    public Arriendo() {
    }

    public Arriendo(Date fechaArriendo, Time horaArriendo, Persona vendedor, Vehiculo vehiculo, MedioPago mediopago) {
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.mediopago = mediopago;
    }

    private Arriendo(int idArriendo, Date fechaArriendo, Time horaArriendo, Persona vendedor, Vehiculo vehiculo, MedioPago mediopago) {
        this.idArriendo = idArriendo;
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.mediopago = mediopago;
    }

    
}
