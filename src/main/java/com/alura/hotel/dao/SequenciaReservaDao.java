package com.alura.hotel.dao;

import com.alura.hotel.domain.reserva.SequenciaReserva;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

public class SequenciaReservaDao {

	private EntityManager em;
	public SequenciaReservaDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(SequenciaReserva sequenciaReserva) {
		this.em.persist(sequenciaReserva);
	}
	public void atualizar(SequenciaReserva sequenciaReserva) {
		this.em.merge(sequenciaReserva);
	}
	public SequenciaReserva buscarSequencia() {
		try {
			String jpql = "SELECT seq FROM SequenciaReserva seq";
			return this.em.createQuery(jpql, SequenciaReserva.class).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}