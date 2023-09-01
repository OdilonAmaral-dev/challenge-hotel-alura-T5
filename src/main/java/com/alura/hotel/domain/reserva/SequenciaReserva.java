package com.alura.hotel.domain.reserva;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "SequenciaReserva")
@Table(name = "sequenciareservas")
public class SequenciaReserva {
    @Id
    private Long id;
    private Long ultSeqReserva;
    public SequenciaReserva () {}
}


