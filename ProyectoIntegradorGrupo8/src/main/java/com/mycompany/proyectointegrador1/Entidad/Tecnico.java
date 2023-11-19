/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectointegrador1.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;
@Entity

@Data
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer IdTecnico;
 private String nombreYapellido;
 @OneToMany(mappedBy ="tecnico")
 private List <String> especialidad;
}
