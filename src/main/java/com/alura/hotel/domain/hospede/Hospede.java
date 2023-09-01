package com.alura.hotel.domain.hospede;

import com.alura.hotel.domain.reserva.Reserva;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@SuppressWarnings("ALL")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Entity(name = "Hospede")
@Table(name = "hospedes")
public class Hospede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String nacionalidade;
    private String telefone;
    private Long idReserva;
    public Hospede (String nome, String sobrenome, Date dataNascimento,
                    String nacionalidade, String telefone, Long idReserva) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.idReserva = idReserva;
    }
    public Long getId() {
        return id;
    }
}
