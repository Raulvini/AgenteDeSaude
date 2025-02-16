package com.agentesaudeonline.agente.online.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;

//    private AgenteSaude agenteSaude;

//    private Localicade localicade;

    private int carteiraSus;

    private int idade;

    private String genero;

    private String sexo; // "f" | "m"

//    private Posto posto;

}
