package com.example.jpah2demo;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @NotNull
    private Integer DDD;

    @NotNull
    private Integer numero;

    @ManyToOne
    @Transient
    private Cliente cliente;

    public Telefone(Long id, Integer DDD, Integer numero, Cliente cliente) {
        this.id = id;
        this.DDD = DDD;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Telefone() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDDD() {
        return DDD;
    }

    public void setDDD(Integer DDD) {
        this.DDD = DDD;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
