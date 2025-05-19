package com.refloreser.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.refloreser.clinica.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

}
