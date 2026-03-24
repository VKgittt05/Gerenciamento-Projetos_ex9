package com.Gerenciamento_Projetos.Projetos.models;

import jakarta.persistence.*;
        import java.time.LocalDate;

@Entity(name = "Projeto")
@Table(name = "tb_projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_projeto", nullable = false)
    private String nome;

    @Column(name = "descr_detalhada")
    private String descricao;

    @Column(name = "dt_inicio")
    private LocalDate dataInicio;

    // Construtor Padrão (Obrigatório pelo JPA)
    public Projeto() {
    }

    // Getters e Setters manuais
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}

