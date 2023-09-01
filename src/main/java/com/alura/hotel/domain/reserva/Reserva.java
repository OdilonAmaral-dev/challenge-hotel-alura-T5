package com.alura.hotel.domain.reserva;

import com.alura.hotel.domain.hospede.Hospede;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("ALL")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Entity(name = "Reserva")
@Table(name = "reservas")
public class Reserva {
    @Id
    private Long id;
    private Date dataEntrada;
    private Date dataSaida;
    @Column(precision = 12, scale = 2)
    private BigDecimal valor;
    private String formaPagamentoReserva;
    public Reserva (
            Long id,
            Date dataEntrada,
            Date dataSaida,
            BigDecimal valor,
            String formaPagamentoReserva)
    {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamentoReserva = formaPagamentoReserva;
    }
    public Long getId() {
        return id;
    }
}


