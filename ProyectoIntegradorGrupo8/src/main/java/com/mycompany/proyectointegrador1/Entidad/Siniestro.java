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
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Siniestro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer IdSiniestro;
  private String Descripcion;
  private Date FechaDeSiniestro; 
  private Date FechaDeResoluccion;
  private Boolean estado;
  private int Cuit_Cliente;
  @ManyToOne //relacion con servicios
  private Servicios servicios;
  @OneToMany //relacion con tecnico
  private Tecnico tecnico;
  @OneToMany(mappedBy ="siniestro")
  private List<Problema> problemas;
}
