package com.alura.hotel.dao;

import com.alura.hotel.domain.hospede.Hospede;
import com.alura.hotel.domain.reserva.Reserva;
import com.alura.hotel.domain.reserva.SequenciaReserva;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
public class HospedeDao {

	private EntityManager em;

	public HospedeDao(EntityManager em) {
		this.em = em;
	}
	public void cadastrar(Hospede hospede) {
		this.em.persist(hospede);
	}

	public boolean atualizar(Hospede hospede) {
		this.em.merge(hospede);
		return true;
	}
	public boolean remover(Long id) {
		Hospede hospede = em.find(Hospede.class, id);
		this.em.remove(hospede);
		return true;
	}
	
	public Hospede buscarPorId(Long id) {
		return em.find(Hospede.class, id);
	}
	
	public ArrayList<Hospede> buscarTodos() {
		String jpql = "SELECT h FROM Hospede h";
		return (ArrayList<Hospede>) em.createQuery(jpql, Hospede.class).getResultList();
	}
	public ArrayList<Hospede> buscarPorSobrenome(String sobrenome) {
		try {
			String jpql = "SELECT h FROM Hospede h WHERE sobrenome = :sobrenome";
			return (ArrayList<Hospede>) this.em.createQuery(jpql, Hospede.class).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
}
