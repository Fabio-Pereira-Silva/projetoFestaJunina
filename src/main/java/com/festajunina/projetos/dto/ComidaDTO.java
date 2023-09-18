package com.festajunina.projetos.dto;

import com.festajunina.projetos.domain.Comida;

public class ComidaDTO {
    Long id;
    String nome;
    public ComidaDTO(){

    }
    public ComidaDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public ComidaDTO(Comida comida) {
        id = comida.getId();
        nome = comida.getNome();
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
}
