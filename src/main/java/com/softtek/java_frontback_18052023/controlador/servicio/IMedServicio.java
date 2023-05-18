package com.softtek.java_frontback_18052023.controlador.servicio;
import com.softtek.java_frontback_18052023.modelo.Medico;

public interface IMedServicio {

        public void eliminarMedico(int id_medico);

        public Medico retornarMedico(int id_medico);

        public Medico[] retornarMedicos();

        public void addMedico(Medico med);
}
