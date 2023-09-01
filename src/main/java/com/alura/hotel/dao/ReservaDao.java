package com.alura.hotel.dao;

import com.alura.hotel.domain.reserva.Reserva;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
public class ReservaDao {

	private EntityManager em;
	public ReservaDao(EntityManager em) {
		this.em = em;
	}
	public void cadastrar(Reserva reserva) {
		this.em.persist(reserva);
	}

	public void atualizar(Reserva reserva) {
		this.em.merge(reserva);
	}

	public void remover(Reserva reserva) {
		reserva = em.merge(reserva);
		this.em.remove(reserva);
	}
	public  Reserva buscarPorId(Long id) {
		return em.find(Reserva.class, id);
	}
	
	public ArrayList<Reserva> buscarTodos() {
		String jpql = "SELECT r FROM Reserva r";
		return (ArrayList<Reserva>) this.em.createQuery(jpql, Reserva.class).getResultList();
	}
}
