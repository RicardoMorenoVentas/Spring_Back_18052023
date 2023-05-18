package com.softtek.java_frontback_18052023.controlador;

import com.softtek.java_frontback_18052023.controlador.servicio.IMedServicio;
import com.softtek.java_frontback_18052023.modelo.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/")
public class MedicoControlador {

    @Autowired
    IMedServicio servicio;

    @GetMapping("/getAll")
    public String getDefault(){

        Medico[] medicos = servicio.retornarMedicos();
        String out = "";
        for (Medico m : medicos){
            out += m.toString();
        }
        return out;
    }

    @GetMapping("/{id}")
    public String getMedico(@PathVariable("id") int id){
        if (servicio.retornarMedico(id) == null) return "{}";
        return servicio.retornarMedico(id).toString();
    }

    @PostMapping("/getAll")
    public void addMedico(@RequestBody Medico med){
        System.out.println(med);
//        servicio.addMedico(med);
    }

    @DeleteMapping("/del/{idMedico}")
    public void delMedico(@PathVariable("idMedico") int idMed){
        System.out.println(idMed);
        servicio.eliminarMedico(idMed);
    }
}
