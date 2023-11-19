/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectointegrador1.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer IdServicio;
   private String descripcion;
   @ManyToOne //relacion con cliente
   private Cliente cliente ;
   @OneToMany(mappedBy ="servicio")
   private List<Siniestro>siniestro;
   
}
