package com.example.jpah2demo;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @NotNull
    private String nome;

    private Integer idade;

    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefoneList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecoList;

    public Cliente() {
    }

    public Cliente(Long id, String nome, Integer idade, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
