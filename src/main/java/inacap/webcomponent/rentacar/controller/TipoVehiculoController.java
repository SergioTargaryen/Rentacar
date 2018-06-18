/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.rentacar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import inacap.webcomponent.rentacar.model.TipoVehiculo;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/tipovehiculo")
public class TipoVehiculoController {
    
    @GetMapping()
     public List<TipoVehiculo> list() {
        return TipoVehiculo.tipovehiculo;
    }
    
    @GetMapping("/{id}")
    public TipoVehiculo get(@PathVariable String id) {
        TipoVehiculo tipovehiculo = new TipoVehiculo();
        
        return tipovehiculo.buscarTipoVehiculo(Integer.parseInt(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @PostMapping
     public ResponseEntity<?> post(@RequestBody TipoVehiculo nuevoTipoVehiculo) {
        
        TipoVehiculo tipovehiculo = new TipoVehiculo();
        
        if(!tipovehiculo.nuevoTipoVehiculo(nuevoTipoVehiculo)){
            return new ResponseEntity<>(HttpStatus.CREATED);
                    
        }else
        
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        
        TipoVehiculo tipovehiculo = new TipoVehiculo();
        if(!tipovehiculo.eliminarTipoVehiculo(Integer.parseInt(id))){
            return new ResponseEntity<>(HttpStatus.OK);
            
        }else
        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
    
}
