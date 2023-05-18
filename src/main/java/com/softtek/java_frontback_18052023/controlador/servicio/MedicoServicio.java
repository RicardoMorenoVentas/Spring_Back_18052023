package com.softtek.java_frontback_18052023.controlador.servicio;

import com.softtek.java_frontback_18052023.modelo.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MedicoServicio implements IMedServicio{

    private ArrayList<Medico> medicos = new ArrayList<>();

    public MedicoServicio(){
       medicos.add(new Medico(1,"ABCD1234","Antonio",30));
    }

    @Override
    public void eliminarMedico(int id_medico) {
        for (int i = 0; i < medicos.size(); i++){
            Medico m = medicos.get(i);
            if (m.getId_medico() == id_medico){
                medicos.remove(i);
                break;
            }
        }
    }

    @Override
    public Medico retornarMedico(int id_medico) {
        for (Medico m : medicos){
            if (m.getId_medico() == id_medico){
                return m;
            }
        };
        return null;
    }

    @Override
    public Medico[] retornarMedicos(){
        return this.medicos.toArray(new Medico[0]);
    }

    @Override
    public void addMedico(Medico med) {
        this.medicos.add(med);
    }
}
