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
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String RazonSocial;
  private int Cuit_Cliente;
  private Integer IdCliente;
  private boolean estado;
  @OneToMany(mappedBy ="cliente")//relacion con servicio
  private List<Servicios>servicios;
    public Cliente() {
    }

    public Cliente(String RazonSocial, int Cuit_Cliente, int IdCliente, boolean estado) {
        this.RazonSocial = RazonSocial;
        this.Cuit_Cliente = Cuit_Cliente;
        this.IdCliente = IdCliente;
        this.estado = estado;
    }

    public Cliente(String RazonSocial, int Cuit_Cliente, boolean estado) {
        this.RazonSocial = RazonSocial;
        this.Cuit_Cliente = Cuit_Cliente;
        this.estado = estado;
    }

    


   
}
