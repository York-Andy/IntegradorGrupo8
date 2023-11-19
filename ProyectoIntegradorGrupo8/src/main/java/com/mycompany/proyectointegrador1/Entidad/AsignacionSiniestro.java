/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectointegrador1.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class AsignacionSiniestro {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer IdAsignacion;
   @ManyToOne
   @JoinColumn(name ="Idtecnico",referencedColumnName ="IdTecnico")
  private int IdTecnico;
  @ManyToOne
  @JoinColumn(name ="IdSiniestro",referencedColumnName ="IdSiniestro")
  private int IdSiniestro;  
}
