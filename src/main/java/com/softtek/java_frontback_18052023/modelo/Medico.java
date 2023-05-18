package com.softtek.java_frontback_18052023.modelo;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medico {
    private int id_medico;
    private String dni;
    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return String.format("{ \"idMedico\": %d, \"dni\":\"%s\", \"nombre\":\"%s\", \"edad\":%d }", this.id_medico, this.dni, this.nombre, this.edad);
    }
}
