package com.agentesaudeonline.agente.online.models;


import jakarta.persistence.*;

import com.agentesaudeonline.agente.online.models.Paciente;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_agente")
public class AgenteDeSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    @OneToMany
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private List<Paciente> paciente;

//    private Localidade localidade;

}
