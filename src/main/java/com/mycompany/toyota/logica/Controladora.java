package com.mycompany.toyota.logica;

import com.mycompany.toyota.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void AgregarAutomovil(String modelo, String marca,
        String motor,String color, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAuto(auto);  
    }

    public List<Automovil> traerAutomoviles() {
       return controlPersis.traerAutomoviles();

    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) {
       return controlPersis.traerAutos(idAuto);
        
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor,
            String color, String patente, int cantPuertas) {
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.modificarAuto(auto);
        
    }
    
    
}
